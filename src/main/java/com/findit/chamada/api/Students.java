package com.findit.chamada.api;

import com.findit.bd.connector.PostgresConnector;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.tools.json.JSONObject;
import org.jooq.tools.json.JSONParser;


import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import static com.findit.joog.Tables.STUDENTS;

@Path("/api/chamada/Students")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class Students {

    /**
     * GET /api/chamada/Users/ Get all users
     *
     * @return the {@code Resource} with status 200 (OK) and body or status 404
     */
    @javax.ws.rs.GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudent() {
        ResponseBody response = null;
        try {
            java.sql.Connection conn = PostgresConnector.getConnection();
            DSLContext select = DSL.using(conn, SQLDialect.POSTGRES);
            Result<Record2<String, String>> result = select.select(STUDENTS.FIRST_NAME,STUDENTS.EMAIL).from(STUDENTS).fetch();
            return Response.ok(generateResponse(1,result.formatJSON()),MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            return Response.status(404).build();
        }
    }

    /**
     * POST /api/chamada/Students/ Create student
     *
     * @return the {@code Resource} with status 200 (OK) and body or status 404
     */
    @javax.ws.rs.POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response setStudent(@FormDataParam("student")String json,
                               @FormDataParam("file") byte[] file) {
        ResponseBody response = null;
        try {
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(json);
            com.findit.models.chamada.Students student = new com.findit.models.chamada.Students(
                    object.get("first_name").toString(),
                    object.get("last_name").toString(),
                    object.get("email").toString(),
                    file
            );
            java.sql.Connection conn = PostgresConnector.getConnection();
            DSLContext insert = DSL.using(conn, SQLDialect.POSTGRES);
            int result = insert.insertInto(
                    STUDENTS,
                    STUDENTS.FIRST_NAME,
                    STUDENTS.LAST_NAME,
                    STUDENTS.EMAIL,
                    STUDENTS.IMAGE
                ).values(
                    student.getFirst_name(),
                    student.getLast_name(),
                    student.getEmail(),
                    student.getImage()
                ).execute();
            return Response.ok(generateResponse(result, null),MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            return Response.status(404).build();
        }
    }

    /**
     * PUT /api/chamada/Students/ update student
     *
     * @return the {@code Resource} with status 200 (OK) and body or status 404
     */
    @javax.ws.rs.PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStudent(@FormDataParam("student")String json,
                                  @FormDataParam("file") byte[] file) {
        ResponseBody response = null;
        try {
            JSONParser parser = new JSONParser();
            JSONObject object = (JSONObject) parser.parse(json);
            com.findit.models.chamada.Students student = new com.findit.models.chamada.Students(
                    Integer.parseInt(object.get("student_id").toString()),
                    object.get("first_name").toString(),
                    object.get("last_name").toString(),
                    object.get("email").toString(),
                    file
            );
            java.sql.Connection conn = PostgresConnector.getConnection();
            DSLContext update = DSL.using(conn, SQLDialect.POSTGRES);
            int result = update.update(STUDENTS)
                    .set(STUDENTS.FIRST_NAME,student.getFirst_name())
                    .set(STUDENTS.LAST_NAME,student.getLast_name())
                    .set(STUDENTS.EMAIL,student.getEmail())
                    .set(STUDENTS.IMAGE,student.getImage())
                    .where(STUDENTS.STUDENT_ID.eq(student.getStudent_id()))
                    .execute();
            return Response.ok(generateResponse(result, null),MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            return Response.status(404).build();
        }
    }

    /**
     * DELETE /api/chamada/Students/ delete student
     *
     * @return the {@code Resource} with status 200 (OK) and body or status 404
     */
    @javax.ws.rs.DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteStudent(@FormDataParam("id")int id) {
        ResponseBody response = null;
        try {
            java.sql.Connection conn = PostgresConnector.getConnection();
            DSLContext delete = DSL.using(conn, SQLDialect.POSTGRES);
            int result = delete.delete(STUDENTS)
                    .where(STUDENTS.STUDENT_ID.eq(id))
                    .execute();
            return Response.ok(generateResponse(result, null),MediaType.APPLICATION_JSON).build();
        } catch (Exception e) {
            return Response.status(404).build();
        }
    }

    public JSONObject generateResponse(int id, String data) {
        if (data != null) {
            try {
                JSONParser parser = new JSONParser();
                JSONObject json = (JSONObject) parser.parse(data);
                return ResponseStatus.getValueById(id,json);
            } catch (Exception e) {
                return ResponseStatus.getValueById(id,null);
            }
        }
        return ResponseStatus.getValueById(id,null);
    }


    public enum ResponseStatus {
        STU_001(1,"Sucess", true),
        STU_000(0,"Fail", false);

        private String value;
        private int id;
        private boolean succcess;

        public String getValue() { return this.value; }

        public static JSONObject getValueById(int id, JSONObject data) {
            for(ResponseStatus rs : ResponseStatus.values()){
                if (rs.id == id) {
                    JSONObject json = new JSONObject();
                    JSONObject jsonS = new JSONObject();
                    JSONObject jsonF = new JSONObject();
                    if (rs.succcess) {
                        jsonS.put("code",rs.name());
                        jsonS.put("data",(data != null ? data :rs.getValue()));
                    } else {
                        jsonF.put("code",rs.name());
                        jsonF.put("extras",(data != null ? data :rs.getValue()));
                    }
                    json.put("success",jsonS);
                    json.put("error", jsonF);
                    return  json;
                }
            }
            return null;
        }

        ResponseStatus(int result, String value, boolean success) {
            this.id = result;
            this.value = value;
            this.succcess = success;
        }
    }
}
