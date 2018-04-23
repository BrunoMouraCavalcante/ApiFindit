/*
 * This file is generated by jOOQ.
*/
package com.findit.jooq.tables.records;


import com.findit.jooq.tables.Students;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StudentsRecord extends UpdatableRecordImpl<StudentsRecord> implements Record7<Integer, String, String, String, byte[], Integer, Integer> {

    private static final long serialVersionUID = 1361182667;

    /**
     * Setter for <code>public.Students.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Students.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.Students.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Students.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.Students.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Students.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.Students.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Students.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.Students.image</code>.
     */
    public void setImage(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.Students.image</code>.
     */
    public byte[] getImage() {
        return (byte[]) get(4);
    }

    /**
     * Setter for <code>public.Students.missing</code>.
     */
    public void setMissing(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.Students.missing</code>.
     */
    public Integer getMissing() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.Students.late</code>.
     */
    public void setLate(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.Students.late</code>.
     */
    public Integer getLate() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, byte[], Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, byte[], Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Students.STUDENTS.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Students.STUDENTS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Students.STUDENTS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Students.STUDENTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return Students.STUDENTS.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Students.STUDENTS.MISSING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Students.STUDENTS.LATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getMissing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getMissing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value1(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value5(byte... value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value6(Integer value) {
        setMissing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value7(Integer value) {
        setLate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord values(Integer value1, String value2, String value3, String value4, byte[] value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentsRecord
     */
    public StudentsRecord() {
        super(Students.STUDENTS);
    }

    /**
     * Create a detached, initialised StudentsRecord
     */
    public StudentsRecord(Integer studentId, String firstName, String lastName, String email, byte[] image, Integer missing, Integer late) {
        super(Students.STUDENTS);

        set(0, studentId);
        set(1, firstName);
        set(2, lastName);
        set(3, email);
        set(4, image);
        set(5, missing);
        set(6, late);
    }
}