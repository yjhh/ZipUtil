/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables;


import com.zipHandle.dao.mysql.Keys;
import com.zipHandle.dao.mysql.Mysql;
import com.zipHandle.dao.mysql.enums.FuncType;
import com.zipHandle.dao.mysql.tables.records.FuncRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * User defined functions
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Func extends TableImpl<FuncRecord> {

    private static final long serialVersionUID = 2019359934;

    /**
     * The reference instance of <code>mysql.func</code>
     */
    public static final Func FUNC = new Func();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FuncRecord> getRecordType() {
        return FuncRecord.class;
    }

    /**
     * The column <code>mysql.func.name</code>.
     */
    public final TableField<FuncRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.func.ret</code>.
     */
    public final TableField<FuncRecord, Boolean> RET = createField("ret", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>mysql.func.dl</code>.
     */
    public final TableField<FuncRecord, String> DL = createField("dl", org.jooq.impl.SQLDataType.CHAR.length(128).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.func.type</code>.
     */
    public final TableField<FuncRecord, FuncType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.FuncType.class), this, "");

    /**
     * Create a <code>mysql.func</code> table reference
     */
    public Func() {
        this("func", null);
    }

    /**
     * Create an aliased <code>mysql.func</code> table reference
     */
    public Func(String alias) {
        this(alias, FUNC);
    }

    private Func(String alias, Table<FuncRecord> aliased) {
        this(alias, aliased, null);
    }

    private Func(String alias, Table<FuncRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "User defined functions");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FuncRecord> getPrimaryKey() {
        return Keys.KEY_FUNC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FuncRecord>> getKeys() {
        return Arrays.<UniqueKey<FuncRecord>>asList(Keys.KEY_FUNC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Func as(String alias) {
        return new Func(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Func rename(String name) {
        return new Func(name, null);
    }
}
