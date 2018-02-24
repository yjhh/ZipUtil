/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables;


import com.zipHandle.dao.mysql.Keys;
import com.zipHandle.dao.mysql.Mysql;
import com.zipHandle.dao.mysql.enums.ProcIsDeterministic;
import com.zipHandle.dao.mysql.enums.ProcLanguage;
import com.zipHandle.dao.mysql.enums.ProcSecurityType;
import com.zipHandle.dao.mysql.enums.ProcSqlDataAccess;
import com.zipHandle.dao.mysql.enums.ProcType;
import com.zipHandle.dao.mysql.tables.records.ProcRecord;

import java.sql.Timestamp;
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
 * Stored Procedures
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Proc extends TableImpl<ProcRecord> {

    private static final long serialVersionUID = 2057908157;

    /**
     * The reference instance of <code>mysql.proc</code>
     */
    public static final Proc PROC = new Proc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProcRecord> getRecordType() {
        return ProcRecord.class;
    }

    /**
     * The column <code>mysql.proc.db</code>.
     */
    public final TableField<ProcRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proc.name</code>.
     */
    public final TableField<ProcRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proc.type</code>.
     */
    public final TableField<ProcRecord, ProcType> TYPE = createField("type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.ProcType.class), this, "");

    /**
     * The column <code>mysql.proc.specific_name</code>.
     */
    public final TableField<ProcRecord, String> SPECIFIC_NAME = createField("specific_name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proc.language</code>.
     */
    public final TableField<ProcRecord, ProcLanguage> LANGUAGE = createField("language", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.ProcLanguage.class), this, "");

    /**
     * The column <code>mysql.proc.sql_data_access</code>.
     */
    public final TableField<ProcRecord, ProcSqlDataAccess> SQL_DATA_ACCESS = createField("sql_data_access", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.ProcSqlDataAccess.class), this, "");

    /**
     * The column <code>mysql.proc.is_deterministic</code>.
     */
    public final TableField<ProcRecord, ProcIsDeterministic> IS_DETERMINISTIC = createField("is_deterministic", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.ProcIsDeterministic.class), this, "");

    /**
     * The column <code>mysql.proc.security_type</code>.
     */
    public final TableField<ProcRecord, ProcSecurityType> SECURITY_TYPE = createField("security_type", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.zipHandle.dao.mysql.enums.ProcSecurityType.class), this, "");

    /**
     * The column <code>mysql.proc.param_list</code>.
     */
    public final TableField<ProcRecord, byte[]> PARAM_LIST = createField("param_list", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.proc.returns</code>.
     */
    public final TableField<ProcRecord, byte[]> RETURNS = createField("returns", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.proc.body</code>.
     */
    public final TableField<ProcRecord, byte[]> BODY = createField("body", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.proc.definer</code>.
     */
    public final TableField<ProcRecord, String> DEFINER = createField("definer", org.jooq.impl.SQLDataType.CHAR.length(77).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proc.created</code>.
     */
    public final TableField<ProcRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.proc.modified</code>.
     */
    public final TableField<ProcRecord, Timestamp> MODIFIED = createField("modified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.proc.sql_mode</code>.
     */
    public final TableField<ProcRecord, String> SQL_MODE = createField("sql_mode", org.jooq.impl.SQLDataType.VARCHAR.length(478).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.proc.comment</code>.
     */
    public final TableField<ProcRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>mysql.proc.character_set_client</code>.
     */
    public final TableField<ProcRecord, String> CHARACTER_SET_CLIENT = createField("character_set_client", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

    /**
     * The column <code>mysql.proc.collation_connection</code>.
     */
    public final TableField<ProcRecord, String> COLLATION_CONNECTION = createField("collation_connection", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

    /**
     * The column <code>mysql.proc.db_collation</code>.
     */
    public final TableField<ProcRecord, String> DB_COLLATION = createField("db_collation", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

    /**
     * The column <code>mysql.proc.body_utf8</code>.
     */
    public final TableField<ProcRecord, byte[]> BODY_UTF8 = createField("body_utf8", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>mysql.proc</code> table reference
     */
    public Proc() {
        this("proc", null);
    }

    /**
     * Create an aliased <code>mysql.proc</code> table reference
     */
    public Proc(String alias) {
        this(alias, PROC);
    }

    private Proc(String alias, Table<ProcRecord> aliased) {
        this(alias, aliased, null);
    }

    private Proc(String alias, Table<ProcRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "Stored Procedures");
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
    public UniqueKey<ProcRecord> getPrimaryKey() {
        return Keys.KEY_PROC_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProcRecord>> getKeys() {
        return Arrays.<UniqueKey<ProcRecord>>asList(Keys.KEY_PROC_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Proc as(String alias) {
        return new Proc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Proc rename(String name) {
        return new Proc(name, null);
    }
}
