/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables;


import com.zipHandle.dao.mysql.Keys;
import com.zipHandle.dao.mysql.Mysql;
import com.zipHandle.dao.mysql.tables.records.HelpKeywordRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * help keywords
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpKeyword extends TableImpl<HelpKeywordRecord> {

    private static final long serialVersionUID = -623103563;

    /**
     * The reference instance of <code>mysql.help_keyword</code>
     */
    public static final HelpKeyword HELP_KEYWORD = new HelpKeyword();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HelpKeywordRecord> getRecordType() {
        return HelpKeywordRecord.class;
    }

    /**
     * The column <code>mysql.help_keyword.help_keyword_id</code>.
     */
    public final TableField<HelpKeywordRecord, UInteger> HELP_KEYWORD_ID = createField("help_keyword_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.help_keyword.name</code>.
     */
    public final TableField<HelpKeywordRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(64).nullable(false), this, "");

    /**
     * Create a <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword() {
        this("help_keyword", null);
    }

    /**
     * Create an aliased <code>mysql.help_keyword</code> table reference
     */
    public HelpKeyword(String alias) {
        this(alias, HELP_KEYWORD);
    }

    private HelpKeyword(String alias, Table<HelpKeywordRecord> aliased) {
        this(alias, aliased, null);
    }

    private HelpKeyword(String alias, Table<HelpKeywordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "help keywords");
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
    public UniqueKey<HelpKeywordRecord> getPrimaryKey() {
        return Keys.KEY_HELP_KEYWORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HelpKeywordRecord>> getKeys() {
        return Arrays.<UniqueKey<HelpKeywordRecord>>asList(Keys.KEY_HELP_KEYWORD_PRIMARY, Keys.KEY_HELP_KEYWORD_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpKeyword as(String alias) {
        return new HelpKeyword(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HelpKeyword rename(String name) {
        return new HelpKeyword(name, null);
    }
}
