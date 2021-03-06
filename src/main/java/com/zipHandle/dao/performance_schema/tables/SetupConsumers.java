/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.enums.SetupConsumersEnabled;
import com.zipHandle.dao.performance_schema.tables.records.SetupConsumersRecord;

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
public class SetupConsumers extends TableImpl<SetupConsumersRecord> {

    private static final long serialVersionUID = -629546314;

    /**
     * The reference instance of <code>performance_schema.setup_consumers</code>
     */
    public static final SetupConsumers SETUP_CONSUMERS = new SetupConsumers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupConsumersRecord> getRecordType() {
        return SetupConsumersRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_consumers.NAME</code>.
     */
    public final TableField<SetupConsumersRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_consumers.ENABLED</code>.
     */
    public final TableField<SetupConsumersRecord, SetupConsumersEnabled> ENABLED = createField("ENABLED", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.performance_schema.enums.SetupConsumersEnabled.class), this, "");

    /**
     * Create a <code>performance_schema.setup_consumers</code> table reference
     */
    public SetupConsumers() {
        this("setup_consumers", null);
    }

    /**
     * Create an aliased <code>performance_schema.setup_consumers</code> table reference
     */
    public SetupConsumers(String alias) {
        this(alias, SETUP_CONSUMERS);
    }

    private SetupConsumers(String alias, Table<SetupConsumersRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupConsumers(String alias, Table<SetupConsumersRecord> aliased, Field<?>[] parameters) {
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
    public SetupConsumers as(String alias) {
        return new SetupConsumers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupConsumers rename(String name) {
        return new SetupConsumers(name, null);
    }
}
