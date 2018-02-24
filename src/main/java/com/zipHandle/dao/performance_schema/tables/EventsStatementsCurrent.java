/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.enums.EventsStatementsCurrentNestingEventType;
import com.zipHandle.dao.performance_schema.tables.records.EventsStatementsCurrentRecord;

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
public class EventsStatementsCurrent extends TableImpl<EventsStatementsCurrentRecord> {

    private static final long serialVersionUID = 1387379809;

    /**
     * The reference instance of <code>performance_schema.events_statements_current</code>
     */
    public static final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = new EventsStatementsCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsCurrentRecord> getRecordType() {
        return EventsStatementsCurrentRecord.class;
    }

    /**
     * The column <code>performance_schema.events_statements_current.THREAD_ID</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.EVENT_ID</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.EVENT_NAME</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SOURCE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.TIMER_START</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.TIMER_END</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> LOCK_TIME = createField("LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SQL_TEXT</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> SQL_TEXT = createField("SQL_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.DIGEST</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> DIGEST = createField("DIGEST", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.DIGEST_TEXT</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> DIGEST_TEXT = createField("DIGEST_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.CURRENT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> CURRENT_SCHEMA = createField("CURRENT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.OBJECT_TYPE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.OBJECT_NAME</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.MYSQL_ERRNO</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, Integer> MYSQL_ERRNO = createField("MYSQL_ERRNO", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.RETURNED_SQLSTATE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> RETURNED_SQLSTATE = createField("RETURNED_SQLSTATE", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.MESSAGE_TEXT</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, String> MESSAGE_TEXT = createField("MESSAGE_TEXT", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.ERRORS</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> ERRORS = createField("ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.WARNINGS</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> WARNINGS = createField("WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> ROWS_AFFECTED = createField("ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> ROWS_SENT = createField("ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> ROWS_EXAMINED = createField("ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> CREATED_TMP_DISK_TABLES = createField("CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> CREATED_TMP_TABLES = createField("CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SELECT_FULL_JOIN = createField("SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SELECT_FULL_RANGE_JOIN = createField("SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SELECT_RANGE = createField("SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SELECT_RANGE_CHECK = createField("SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SELECT_SCAN = createField("SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SORT_MERGE_PASSES = createField("SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SORT_RANGE = createField("SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SORT_ROWS = createField("SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> SORT_SCAN = createField("SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> NO_INDEX_USED = createField("NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> NO_GOOD_INDEX_USED = createField("NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_statements_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_statements_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStatementsCurrentRecord, EventsStatementsCurrentNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.performance_schema.enums.EventsStatementsCurrentNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_statements_current</code> table reference
     */
    public EventsStatementsCurrent() {
        this("events_statements_current", null);
    }

    /**
     * Create an aliased <code>performance_schema.events_statements_current</code> table reference
     */
    public EventsStatementsCurrent(String alias) {
        this(alias, EVENTS_STATEMENTS_CURRENT);
    }

    private EventsStatementsCurrent(String alias, Table<EventsStatementsCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsCurrent(String alias, Table<EventsStatementsCurrentRecord> aliased, Field<?>[] parameters) {
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
    public EventsStatementsCurrent as(String alias) {
        return new EventsStatementsCurrent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsCurrent rename(String name) {
        return new EventsStatementsCurrent(name, null);
    }
}