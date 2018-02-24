/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables.records;


import com.zipHandle.dao.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


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
public class TableIoWaitsSummaryByIndexUsageRecord extends TableRecordImpl<TableIoWaitsSummaryByIndexUsageRecord> {

    private static final long serialVersionUID = 151631572;

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
     */
    public void setIndexName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
     */
    public void setCountStar(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
     */
    public void setSumTimerWait(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
     */
    public void setMinTimerWait(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
     */
    public void setAvgTimerWait(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
     */
    public void setMaxTimerWait(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
     */
    public void setCountRead(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_READ</code>.
     */
    public ULong getCountRead() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
     */
    public void setSumTimerRead(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_READ</code>.
     */
    public ULong getSumTimerRead() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
     */
    public void setMinTimerRead(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_READ</code>.
     */
    public ULong getMinTimerRead() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
     */
    public void setAvgTimerRead(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_READ</code>.
     */
    public ULong getAvgTimerRead() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
     */
    public void setMaxTimerRead(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_READ</code>.
     */
    public ULong getMaxTimerRead() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
     */
    public void setCountWrite(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_WRITE</code>.
     */
    public ULong getCountWrite() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
     */
    public void setSumTimerWrite(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_WRITE</code>.
     */
    public ULong getSumTimerWrite() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
     */
    public void setMinTimerWrite(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_WRITE</code>.
     */
    public ULong getMinTimerWrite() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
     */
    public void setAvgTimerWrite(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_WRITE</code>.
     */
    public ULong getAvgTimerWrite() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
     */
    public void setMaxTimerWrite(ULong value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_WRITE</code>.
     */
    public ULong getMaxTimerWrite() {
        return (ULong) get(18);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
     */
    public void setCountFetch(ULong value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_FETCH</code>.
     */
    public ULong getCountFetch() {
        return (ULong) get(19);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
     */
    public void setSumTimerFetch(ULong value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_FETCH</code>.
     */
    public ULong getSumTimerFetch() {
        return (ULong) get(20);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
     */
    public void setMinTimerFetch(ULong value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_FETCH</code>.
     */
    public ULong getMinTimerFetch() {
        return (ULong) get(21);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
     */
    public void setAvgTimerFetch(ULong value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_FETCH</code>.
     */
    public ULong getAvgTimerFetch() {
        return (ULong) get(22);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
     */
    public void setMaxTimerFetch(ULong value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_FETCH</code>.
     */
    public ULong getMaxTimerFetch() {
        return (ULong) get(23);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
     */
    public void setCountInsert(ULong value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_INSERT</code>.
     */
    public ULong getCountInsert() {
        return (ULong) get(24);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
     */
    public void setSumTimerInsert(ULong value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_INSERT</code>.
     */
    public ULong getSumTimerInsert() {
        return (ULong) get(25);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
     */
    public void setMinTimerInsert(ULong value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_INSERT</code>.
     */
    public ULong getMinTimerInsert() {
        return (ULong) get(26);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
     */
    public void setAvgTimerInsert(ULong value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_INSERT</code>.
     */
    public ULong getAvgTimerInsert() {
        return (ULong) get(27);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
     */
    public void setMaxTimerInsert(ULong value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_INSERT</code>.
     */
    public ULong getMaxTimerInsert() {
        return (ULong) get(28);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
     */
    public void setCountUpdate(ULong value) {
        set(29, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_UPDATE</code>.
     */
    public ULong getCountUpdate() {
        return (ULong) get(29);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
     */
    public void setSumTimerUpdate(ULong value) {
        set(30, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_UPDATE</code>.
     */
    public ULong getSumTimerUpdate() {
        return (ULong) get(30);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
     */
    public void setMinTimerUpdate(ULong value) {
        set(31, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_UPDATE</code>.
     */
    public ULong getMinTimerUpdate() {
        return (ULong) get(31);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
     */
    public void setAvgTimerUpdate(ULong value) {
        set(32, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_UPDATE</code>.
     */
    public ULong getAvgTimerUpdate() {
        return (ULong) get(32);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
     */
    public void setMaxTimerUpdate(ULong value) {
        set(33, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_UPDATE</code>.
     */
    public ULong getMaxTimerUpdate() {
        return (ULong) get(33);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
     */
    public void setCountDelete(ULong value) {
        set(34, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.COUNT_DELETE</code>.
     */
    public ULong getCountDelete() {
        return (ULong) get(34);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
     */
    public void setSumTimerDelete(ULong value) {
        set(35, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.SUM_TIMER_DELETE</code>.
     */
    public ULong getSumTimerDelete() {
        return (ULong) get(35);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
     */
    public void setMinTimerDelete(ULong value) {
        set(36, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MIN_TIMER_DELETE</code>.
     */
    public ULong getMinTimerDelete() {
        return (ULong) get(36);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
     */
    public void setAvgTimerDelete(ULong value) {
        set(37, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.AVG_TIMER_DELETE</code>.
     */
    public ULong getAvgTimerDelete() {
        return (ULong) get(37);
    }

    /**
     * Setter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
     */
    public void setMaxTimerDelete(ULong value) {
        set(38, value);
    }

    /**
     * Getter for <code>performance_schema.table_io_waits_summary_by_index_usage.MAX_TIMER_DELETE</code>.
     */
    public ULong getMaxTimerDelete() {
        return (ULong) get(38);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TableIoWaitsSummaryByIndexUsageRecord
     */
    public TableIoWaitsSummaryByIndexUsageRecord() {
        super(TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);
    }

    /**
     * Create a detached, initialised TableIoWaitsSummaryByIndexUsageRecord
     */
    public TableIoWaitsSummaryByIndexUsageRecord(String objectType, String objectSchema, String objectName, String indexName, ULong countStar, ULong sumTimerWait, ULong minTimerWait, ULong avgTimerWait, ULong maxTimerWait, ULong countRead, ULong sumTimerRead, ULong minTimerRead, ULong avgTimerRead, ULong maxTimerRead, ULong countWrite, ULong sumTimerWrite, ULong minTimerWrite, ULong avgTimerWrite, ULong maxTimerWrite, ULong countFetch, ULong sumTimerFetch, ULong minTimerFetch, ULong avgTimerFetch, ULong maxTimerFetch, ULong countInsert, ULong sumTimerInsert, ULong minTimerInsert, ULong avgTimerInsert, ULong maxTimerInsert, ULong countUpdate, ULong sumTimerUpdate, ULong minTimerUpdate, ULong avgTimerUpdate, ULong maxTimerUpdate, ULong countDelete, ULong sumTimerDelete, ULong minTimerDelete, ULong avgTimerDelete, ULong maxTimerDelete) {
        super(TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE);

        set(0, objectType);
        set(1, objectSchema);
        set(2, objectName);
        set(3, indexName);
        set(4, countStar);
        set(5, sumTimerWait);
        set(6, minTimerWait);
        set(7, avgTimerWait);
        set(8, maxTimerWait);
        set(9, countRead);
        set(10, sumTimerRead);
        set(11, minTimerRead);
        set(12, avgTimerRead);
        set(13, maxTimerRead);
        set(14, countWrite);
        set(15, sumTimerWrite);
        set(16, minTimerWrite);
        set(17, avgTimerWrite);
        set(18, maxTimerWrite);
        set(19, countFetch);
        set(20, sumTimerFetch);
        set(21, minTimerFetch);
        set(22, avgTimerFetch);
        set(23, maxTimerFetch);
        set(24, countInsert);
        set(25, sumTimerInsert);
        set(26, minTimerInsert);
        set(27, avgTimerInsert);
        set(28, maxTimerInsert);
        set(29, countUpdate);
        set(30, sumTimerUpdate);
        set(31, minTimerUpdate);
        set(32, avgTimerUpdate);
        set(33, maxTimerUpdate);
        set(34, countDelete);
        set(35, sumTimerDelete);
        set(36, minTimerDelete);
        set(37, avgTimerDelete);
        set(38, maxTimerDelete);
    }
}
