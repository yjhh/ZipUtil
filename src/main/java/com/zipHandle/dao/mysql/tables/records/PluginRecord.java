/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables.records;


import com.zipHandle.dao.mysql.tables.Plugin;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * MySQL plugins
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PluginRecord extends UpdatableRecordImpl<PluginRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 5942554;

    /**
     * Setter for <code>mysql.plugin.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.plugin.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.plugin.dl</code>.
     */
    public void setDl(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.plugin.dl</code>.
     */
    public String getDl() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Plugin.PLUGIN.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Plugin.PLUGIN.DL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PluginRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PluginRecord value2(String value) {
        setDl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PluginRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PluginRecord
     */
    public PluginRecord() {
        super(Plugin.PLUGIN);
    }

    /**
     * Create a detached, initialised PluginRecord
     */
    public PluginRecord(String name, String dl) {
        super(Plugin.PLUGIN);

        set(0, name);
        set(1, dl);
    }
}
