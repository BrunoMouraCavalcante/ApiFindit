/*
 * This file is generated by jOOQ.
*/
package com.findit.joog;


import com.findit.joog.tables.Meetings;
import com.findit.joog.tables.StudentMeeting;
import com.findit.joog.tables.Students;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.Meetings</code>.
     */
    public static final Meetings MEETINGS = com.findit.joog.tables.Meetings.MEETINGS;

    /**
     * The table <code>public.Student_Meeting</code>.
     */
    public static final StudentMeeting STUDENT_MEETING = com.findit.joog.tables.StudentMeeting.STUDENT_MEETING;

    /**
     * The table <code>public.Students</code>.
     */
    public static final Students STUDENTS = com.findit.joog.tables.Students.STUDENTS;
}
