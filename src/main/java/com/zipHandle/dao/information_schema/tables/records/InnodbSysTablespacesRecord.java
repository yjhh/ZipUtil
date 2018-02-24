/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.information_schema.tables.records;


import com.zipHandle.dao.information_schema.tables.InnodbSysTablespaces;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class InnodbSysTablespacesRecord extends TableRecordImpl<InnodbSysTablespacesRecord> implements Record7<UInteger, String, UInteger, String, String, UInteger, UInteger> {

    private static final long serialVersionUID = -623807905;

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
     */
    public void setSpace(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
     */
    public void setFlag(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FLAG</code>.
     */
    public UInteger getFlag() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
     */
    public void setFileFormat(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.FILE_FORMAT</code>.
     */
    public String getFileFormat() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
     */
    public void setRowFormat(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
     */
    public void setPageSize(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.PAGE_SIZE</code>.
     */
    public UInteger getPageSize() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public void setZipPageSize(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public UInteger getZipPageSize() {
        return (UInteger) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, String, UInteger, String, String, UInteger, UInteger> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<UInteger, String, UInteger, String, String, UInteger, UInteger> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.FILE_FORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ROW_FORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return InnodbSysTablespaces.INNODB_SYS_TABLESPACES.ZIP_PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getSpace();
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
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFileFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getZipPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value1(UInteger value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value3(UInteger value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value4(String value) {
        setFileFormat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value5(String value) {
        setRowFormat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value6(UInteger value) {
        setPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord value7(UInteger value) {
        setZipPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysTablespacesRecord values(UInteger value1, String value2, UInteger value3, String value4, String value5, UInteger value6, UInteger value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysTablespacesRecord
     */
    public InnodbSysTablespacesRecord() {
        super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);
    }

    /**
     * Create a detached, initialised InnodbSysTablespacesRecord
     */
    public InnodbSysTablespacesRecord(UInteger space, String name, UInteger flag, String fileFormat, String rowFormat, UInteger pageSize, UInteger zipPageSize) {
        super(InnodbSysTablespaces.INNODB_SYS_TABLESPACES);

        set(0, space);
        set(1, name);
        set(2, flag);
        set(3, fileFormat);
        set(4, rowFormat);
        set(5, pageSize);
        set(6, zipPageSize);
    }
}
