/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.enums.ThreadsInstrumented;
import com.zipHandle.dao.performance_schema.tables.records.ThreadsRecord;

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
public class Threads extends TableImpl<ThreadsRecord> {

    private static final long serialVersionUID = -368893767;

    /**
     * The reference instance of <code>performance_schema.threads</code>
     */
    public static final Threads THREADS = new Threads();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ThreadsRecord> getRecordType() {
        return ThreadsRecord.class;
    }

    /**
     * The column <code>performance_schema.threads.THREAD_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.NAME</code>.
     */
    public final TableField<ThreadsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.TYPE</code>.
     */
    public final TableField<ThreadsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> PROCESSLIST_ID = createField("PROCESSLIST_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_USER</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_USER = createField("PROCESSLIST_USER", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_HOST</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_HOST = createField("PROCESSLIST_HOST", org.jooq.impl.SQLDataType.VARCHAR.length(60), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_DB</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_DB = createField("PROCESSLIST_DB", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_COMMAND</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_COMMAND = createField("PROCESSLIST_COMMAND", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_TIME</code>.
     */
    public final TableField<ThreadsRecord, Long> PROCESSLIST_TIME = createField("PROCESSLIST_TIME", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_STATE</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_STATE = createField("PROCESSLIST_STATE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.threads.PROCESSLIST_INFO</code>.
     */
    public final TableField<ThreadsRecord, String> PROCESSLIST_INFO = createField("PROCESSLIST_INFO", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>performance_schema.threads.PARENT_THREAD_ID</code>.
     */
    public final TableField<ThreadsRecord, ULong> PARENT_THREAD_ID = createField("PARENT_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.threads.ROLE</code>.
     */
    public final TableField<ThreadsRecord, String> ROLE = createField("ROLE", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>performance_schema.threads.INSTRUMENTED</code>.
     */
    public final TableField<ThreadsRecord, ThreadsInstrumented> INSTRUMENTED = createField("INSTRUMENTED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.performance_schema.enums.ThreadsInstrumented.class), this, "");

    /**
     * Create a <code>performance_schema.threads</code> table reference
     */
    public Threads() {
        this("threads", null);
    }

    /**
     * Create an aliased <code>performance_schema.threads</code> table reference
     */
    public Threads(String alias) {
        this(alias, THREADS);
    }

    private Threads(String alias, Table<ThreadsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Threads(String alias, Table<ThreadsRecord> aliased, Field<?>[] parameters) {
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
    public Threads as(String alias) {
        return new Threads(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Threads rename(String name) {
        return new Threads(name, null);
    }
}
