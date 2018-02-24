/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.enums.SetupTimersTimerName;
import com.zipHandle.dao.performance_schema.tables.records.SetupTimersRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;


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
public class SetupTimers extends TableImpl<SetupTimersRecord> {

    private static final long serialVersionUID = 1945547827;

    /**
     * The reference instance of <code>performance_schema.setup_timers</code>
     */
    public static final SetupTimers SETUP_TIMERS = new SetupTimers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupTimersRecord> getRecordType() {
        return SetupTimersRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_timers.NAME</code>.
     */
    public final TableField<SetupTimersRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_timers.TIMER_NAME</code>.
     */
    public final TableField<SetupTimersRecord, SetupTimersTimerName> TIMER_NAME = createField("TIMER_NAME", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.performance_schema.enums.SetupTimersTimerName.class), this, "");

    /**
     * Create a <code>performance_schema.setup_timers</code> table reference
     */
    public SetupTimers() {
        this("setup_timers", null);
    }

    /**
     * Create an aliased <code>performance_schema.setup_timers</code> table reference
     */
    public SetupTimers(String alias) {
        this(alias, SETUP_TIMERS);
    }

    private SetupTimers(String alias, Table<SetupTimersRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupTimers(String alias, Table<SetupTimersRecord> aliased, Field<?>[] parameters) {
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
    public SetupTimers as(String alias) {
        return new SetupTimers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupTimers rename(String name) {
        return new SetupTimers(name, null);
    }
}
