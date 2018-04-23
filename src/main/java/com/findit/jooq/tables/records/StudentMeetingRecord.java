/*
 * This file is generated by jOOQ.
*/
package com.findit.jooq.tables.records;


import com.findit.jooq.tables.StudentMeeting;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class StudentMeetingRecord extends UpdatableRecordImpl<StudentMeetingRecord> implements Record4<Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1745304921;

    /**
     * Setter for <code>public.Student_Meeting.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.Student_Meeting.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.Student_Meeting.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.Student_Meeting.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.Student_Meeting.meeting_id</code>.
     */
    public void setMeetingId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.Student_Meeting.meeting_id</code>.
     */
    public Integer getMeetingId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.Student_Meeting.status</code>.
     */
    public void setStatus(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.Student_Meeting.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return StudentMeeting.STUDENT_MEETING.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StudentMeeting.STUDENT_MEETING.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return StudentMeeting.STUDENT_MEETING.MEETING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return StudentMeeting.STUDENT_MEETING.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMeetingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMeetingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentMeetingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentMeetingRecord value2(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentMeetingRecord value3(Integer value) {
        setMeetingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentMeetingRecord value4(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentMeetingRecord values(Integer value1, Integer value2, Integer value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentMeetingRecord
     */
    public StudentMeetingRecord() {
        super(StudentMeeting.STUDENT_MEETING);
    }

    /**
     * Create a detached, initialised StudentMeetingRecord
     */
    public StudentMeetingRecord(Integer id, Integer studentId, Integer meetingId, Integer status) {
        super(StudentMeeting.STUDENT_MEETING);

        set(0, id);
        set(1, studentId);
        set(2, meetingId);
        set(3, status);
    }
}