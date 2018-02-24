/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.information_schema.tables;


import com.zipHandle.dao.information_schema.InformationSchema;
import com.zipHandle.dao.information_schema.tables.records.CollationsRecord;

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
public class Collations extends TableImpl<CollationsRecord> {

    private static final long serialVersionUID = -622801675;

    /**
     * The reference instance of <code>information_schema.COLLATIONS</code>
     */
    public static final Collations COLLATIONS = new Collations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationsRecord> getRecordType() {
        return CollationsRecord.class;
    }

    /**
     * The column <code>information_schema.COLLATIONS.COLLATION_NAME</code>.
     */
    public final TableField<CollationsRecord, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLLATIONS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<CollationsRecord, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLLATIONS.ID</code>.
     */
    public final TableField<CollationsRecord, Long> ID = createField("ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.COLLATIONS.IS_DEFAULT</code>.
     */
    public final TableField<CollationsRecord, String> IS_DEFAULT = createField("IS_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLLATIONS.IS_COMPILED</code>.
     */
    public final TableField<CollationsRecord, String> IS_COMPILED = createField("IS_COMPILED", org.jooq.impl.SQLDataType.VARCHAR.length(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.COLLATIONS.SORTLEN</code>.
     */
    public final TableField<CollationsRecord, Long> SORTLEN = createField("SORTLEN", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>information_schema.COLLATIONS</code> table reference
     */
    public Collations() {
        this("COLLATIONS", null);
    }

    /**
     * Create an aliased <code>information_schema.COLLATIONS</code> table reference
     */
    public Collations(String alias) {
        this(alias, COLLATIONS);
    }

    private Collations(String alias, Table<CollationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Collations(String alias, Table<CollationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collations as(String alias) {
        return new Collations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(String name) {
        return new Collations(name, null);
    }
}
