/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.information_schema.tables.records;


import com.zipHandle.dao.information_schema.tables.InnodbSysFields;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
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
public class InnodbSysFieldsRecord extends TableRecordImpl<InnodbSysFieldsRecord> implements Record3<ULong, String, UInteger> {

    private static final long serialVersionUID = -1950968212;

    /**
     * Setter for <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public void setIndexId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public ULong getIndexId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public void setPos(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public UInteger getPos() {
        return (UInteger) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, String, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<ULong, String, UInteger> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return InnodbSysFields.INNODB_SYS_FIELDS.INDEX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysFields.INNODB_SYS_FIELDS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return InnodbSysFields.INNODB_SYS_FIELDS.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getIndexId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFieldsRecord value1(ULong value) {
        setIndexId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFieldsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFieldsRecord value3(UInteger value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFieldsRecord values(ULong value1, String value2, UInteger value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysFieldsRecord
     */
    public InnodbSysFieldsRecord() {
        super(InnodbSysFields.INNODB_SYS_FIELDS);
    }

    /**
     * Create a detached, initialised InnodbSysFieldsRecord
     */
    public InnodbSysFieldsRecord(ULong indexId, String name, UInteger pos) {
        super(InnodbSysFields.INNODB_SYS_FIELDS);

        set(0, indexId);
        set(1, name);
        set(2, pos);
    }
}
