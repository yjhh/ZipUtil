/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.information_schema.tables.records;


import com.zipHandle.dao.information_schema.tables.Profiling;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProfilingRecord extends TableRecordImpl<ProfilingRecord> implements Record18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> {

    private static final long serialVersionUID = 1446441388;

    /**
     * Setter for <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public void setQueryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.QUERY_ID</code>.
     */
    public Integer getQueryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SEQ</code>.
     */
    public void setSeq(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SEQ</code>.
     */
    public Integer getSeq() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>information_schema.PROFILING.STATE</code>.
     */
    public void setState(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.STATE</code>.
     */
    public String getState() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.PROFILING.DURATION</code>.
     */
    public void setDuration(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.DURATION</code>.
     */
    public BigDecimal getDuration() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public void setCpuUser(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CPU_USER</code>.
     */
    public BigDecimal getCpuUser() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public void setCpuSystem(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CPU_SYSTEM</code>.
     */
    public BigDecimal getCpuSystem() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public void setContextVoluntary(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CONTEXT_VOLUNTARY</code>.
     */
    public Integer getContextVoluntary() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public void setContextInvoluntary(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.CONTEXT_INVOLUNTARY</code>.
     */
    public Integer getContextInvoluntary() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public void setBlockOpsIn(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.BLOCK_OPS_IN</code>.
     */
    public Integer getBlockOpsIn() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public void setBlockOpsOut(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.BLOCK_OPS_OUT</code>.
     */
    public Integer getBlockOpsOut() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public void setMessagesSent(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.MESSAGES_SENT</code>.
     */
    public Integer getMessagesSent() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public void setMessagesReceived(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.MESSAGES_RECEIVED</code>.
     */
    public Integer getMessagesReceived() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public void setPageFaultsMajor(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.PAGE_FAULTS_MAJOR</code>.
     */
    public Integer getPageFaultsMajor() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public void setPageFaultsMinor(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.PAGE_FAULTS_MINOR</code>.
     */
    public Integer getPageFaultsMinor() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SWAPS</code>.
     */
    public void setSwaps(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SWAPS</code>.
     */
    public Integer getSwaps() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public void setSourceFunction(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_FUNCTION</code>.
     */
    public String getSourceFunction() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public void setSourceFile(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_FILE</code>.
     */
    public String getSourceFile() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public void setSourceLine(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.PROFILING.SOURCE_LINE</code>.
     */
    public Integer getSourceLine() {
        return (Integer) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<Integer, Integer, String, BigDecimal, BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, Integer> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Profiling.PROFILING.QUERY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Profiling.PROFILING.SEQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Profiling.PROFILING.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Profiling.PROFILING.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Profiling.PROFILING.CPU_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Profiling.PROFILING.CPU_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Profiling.PROFILING.CONTEXT_VOLUNTARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Profiling.PROFILING.CONTEXT_INVOLUNTARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Profiling.PROFILING.BLOCK_OPS_IN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Profiling.PROFILING.BLOCK_OPS_OUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Profiling.PROFILING.MESSAGES_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Profiling.PROFILING.MESSAGES_RECEIVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Profiling.PROFILING.PAGE_FAULTS_MAJOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Profiling.PROFILING.PAGE_FAULTS_MINOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Profiling.PROFILING.SWAPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Profiling.PROFILING.SOURCE_FUNCTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Profiling.PROFILING.SOURCE_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Profiling.PROFILING.SOURCE_LINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getQueryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSeq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCpuUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getCpuSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getContextVoluntary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getContextInvoluntary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getBlockOpsIn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getBlockOpsOut();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getMessagesSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getMessagesReceived();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getPageFaultsMajor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getPageFaultsMinor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getSwaps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getSourceFunction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSourceFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getSourceLine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value1(Integer value) {
        setQueryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value2(Integer value) {
        setSeq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value3(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value4(BigDecimal value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value5(BigDecimal value) {
        setCpuUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value6(BigDecimal value) {
        setCpuSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value7(Integer value) {
        setContextVoluntary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value8(Integer value) {
        setContextInvoluntary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value9(Integer value) {
        setBlockOpsIn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value10(Integer value) {
        setBlockOpsOut(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value11(Integer value) {
        setMessagesSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value12(Integer value) {
        setMessagesReceived(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value13(Integer value) {
        setPageFaultsMajor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value14(Integer value) {
        setPageFaultsMinor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value15(Integer value) {
        setSwaps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value16(String value) {
        setSourceFunction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value17(String value) {
        setSourceFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord value18(Integer value) {
        setSourceLine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProfilingRecord values(Integer value1, Integer value2, String value3, BigDecimal value4, BigDecimal value5, BigDecimal value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, String value16, String value17, Integer value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProfilingRecord
     */
    public ProfilingRecord() {
        super(Profiling.PROFILING);
    }

    /**
     * Create a detached, initialised ProfilingRecord
     */
    public ProfilingRecord(Integer queryId, Integer seq, String state, BigDecimal duration, BigDecimal cpuUser, BigDecimal cpuSystem, Integer contextVoluntary, Integer contextInvoluntary, Integer blockOpsIn, Integer blockOpsOut, Integer messagesSent, Integer messagesReceived, Integer pageFaultsMajor, Integer pageFaultsMinor, Integer swaps, String sourceFunction, String sourceFile, Integer sourceLine) {
        super(Profiling.PROFILING);

        set(0, queryId);
        set(1, seq);
        set(2, state);
        set(3, duration);
        set(4, cpuUser);
        set(5, cpuSystem);
        set(6, contextVoluntary);
        set(7, contextInvoluntary);
        set(8, blockOpsIn);
        set(9, blockOpsOut);
        set(10, messagesSent);
        set(11, messagesReceived);
        set(12, pageFaultsMajor);
        set(13, pageFaultsMinor);
        set(14, swaps);
        set(15, sourceFunction);
        set(16, sourceFile);
        set(17, sourceLine);
    }
}
