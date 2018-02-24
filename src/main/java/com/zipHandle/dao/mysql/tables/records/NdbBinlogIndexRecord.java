/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables.records;


import com.zipHandle.dao.mysql.tables.NdbBinlogIndex;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Record3;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;
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
public class NdbBinlogIndexRecord extends UpdatableRecordImpl<NdbBinlogIndexRecord> implements Record10<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger> {

    private static final long serialVersionUID = -708998602;

    /**
     * Setter for <code>mysql.ndb_binlog_index.Position</code>.
     */
    public void setPosition(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.Position</code>.
     */
    public ULong getPosition() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.File</code>.
     */
    public void setFile(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.File</code>.
     */
    public String getFile() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public void setEpoch(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public ULong getEpoch() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public void setInserts(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public UInteger getInserts() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.updates</code>.
     */
    public void setUpdates(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.updates</code>.
     */
    public UInteger getUpdates() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public void setDeletes(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public UInteger getDeletes() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public void setSchemaops(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public UInteger getSchemaops() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public void setOrigServerId(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public UInteger getOrigServerId() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public void setOrigEpoch(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public ULong getOrigEpoch() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.gci</code>.
     */
    public void setGci(UInteger value) {
        set(9, value);
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.gci</code>.
     */
    public UInteger getGci() {
        return (UInteger) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<ULong, UInteger, ULong> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.EPOCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.INSERTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.UPDATES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.DELETES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field7() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.SCHEMAOPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field8() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_SERVER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_EPOCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field10() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.GCI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getEpoch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getInserts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getUpdates();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getDeletes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value7() {
        return getSchemaops();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value8() {
        return getOrigServerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getOrigEpoch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value10() {
        return getGci();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value1(ULong value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value2(String value) {
        setFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value3(ULong value) {
        setEpoch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value4(UInteger value) {
        setInserts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value5(UInteger value) {
        setUpdates(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value6(UInteger value) {
        setDeletes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value7(UInteger value) {
        setSchemaops(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value8(UInteger value) {
        setOrigServerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value9(ULong value) {
        setOrigEpoch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord value10(UInteger value) {
        setGci(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NdbBinlogIndexRecord values(ULong value1, String value2, ULong value3, UInteger value4, UInteger value5, UInteger value6, UInteger value7, UInteger value8, ULong value9, UInteger value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NdbBinlogIndexRecord
     */
    public NdbBinlogIndexRecord() {
        super(NdbBinlogIndex.NDB_BINLOG_INDEX);
    }

    /**
     * Create a detached, initialised NdbBinlogIndexRecord
     */
    public NdbBinlogIndexRecord(ULong position, String file, ULong epoch, UInteger inserts, UInteger updates, UInteger deletes, UInteger schemaops, UInteger origServerId, ULong origEpoch, UInteger gci) {
        super(NdbBinlogIndex.NDB_BINLOG_INDEX);

        set(0, position);
        set(1, file);
        set(2, epoch);
        set(3, inserts);
        set(4, updates);
        set(5, deletes);
        set(6, schemaops);
        set(7, origServerId);
        set(8, origEpoch);
        set(9, gci);
    }
}
