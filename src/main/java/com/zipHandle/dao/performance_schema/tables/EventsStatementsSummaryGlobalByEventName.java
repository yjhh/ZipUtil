/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.tables.records.EventsStatementsSummaryGlobalByEventNameRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class EventsStatementsSummaryGlobalByEventName extends TableImpl<EventsStatementsSummaryGlobalByEventNameRecord> {

    private static final long serialVersionUID = 1876839937;

    /**
     * The reference instance of <code>performance_schema.events_statements_summary_global_by_event_name</code>
     */
    public static final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = new EventsStatementsSummaryGlobalByEventName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsSummaryGlobalByEventNameRecord> getRecordType() {
        return EventsStatementsSummaryGlobalByEventNameRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.COUNT_STAR</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_LOCK_TIME = createField("SUM_LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ERRORS</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_ERRORS = createField("SUM_ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_WARNINGS</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_WARNINGS = createField("SUM_WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_ROWS_AFFECTED = createField("SUM_ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_ROWS_SENT = createField("SUM_ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_ROWS_EXAMINED = createField("SUM_ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField("SUM_CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_CREATED_TMP_TABLES = createField("SUM_CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SELECT_FULL_JOIN = createField("SUM_SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField("SUM_SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SELECT_RANGE = createField("SUM_SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SELECT_RANGE_CHECK = createField("SUM_SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SELECT_SCAN = createField("SUM_SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SORT_MERGE_PASSES = createField("SUM_SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SORT_RANGE = createField("SUM_SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SORT_ROWS = createField("SUM_SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_SORT_SCAN = createField("SUM_SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_NO_INDEX_USED = createField("SUM_NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_summary_global_by_event_name.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryGlobalByEventNameRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField("SUM_NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.events_statements_summary_global_by_event_name</code> table reference
     */
    public EventsStatementsSummaryGlobalByEventName() {
        this("events_statements_summary_global_by_event_name", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_summary_global_by_event_name</code> table reference
     */
    public EventsStatementsSummaryGlobalByEventName(String alias) {
        this(alias, EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME);
    }

    private EventsStatementsSummaryGlobalByEventName(String alias, Table<EventsStatementsSummaryGlobalByEventNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsSummaryGlobalByEventName(String alias, Table<EventsStatementsSummaryGlobalByEventNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsStatementsSummaryGlobalByEventName as(String alias) {
        return new EventsStatementsSummaryGlobalByEventName(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryGlobalByEventName rename(String name) {
        return new EventsStatementsSummaryGlobalByEventName(name, null);
    }
}
