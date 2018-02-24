/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables;


import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.performance_schema.tables.records.FileSummaryByInstanceRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
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
public class FileSummaryByInstance extends TableImpl<FileSummaryByInstanceRecord> {

    private static final long serialVersionUID = 464177726;

    /**
     * The reference instance of <code>performance_schema.file_summary_by_instance</code>
     */
    public static final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = new FileSummaryByInstance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileSummaryByInstanceRecord> getRecordType() {
        return FileSummaryByInstanceRecord.class;
    }

    /**
     * The column <code>performance_schema.file_summary_by_instance.FILE_NAME</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, String> FILE_NAME = createField("FILE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.EVENT_NAME</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.COUNT_STAR</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_STAR = createField("COUNT_STAR", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_WAIT = createField("SUM_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_WAIT = createField("MIN_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_WAIT = createField("AVG_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MAX_TIMER_WAIT</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_WAIT = createField("MAX_TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.COUNT_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_READ = createField("COUNT_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_READ = createField("SUM_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MIN_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_READ = createField("MIN_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.AVG_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_READ = createField("AVG_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MAX_TIMER_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_READ = createField("MAX_TIMER_READ", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, Long> SUM_NUMBER_OF_BYTES_READ = createField("SUM_NUMBER_OF_BYTES_READ", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.COUNT_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_WRITE = createField("COUNT_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_WRITE = createField("SUM_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MIN_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_WRITE = createField("MIN_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.AVG_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_WRITE = createField("AVG_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MAX_TIMER_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_WRITE = createField("MAX_TIMER_WRITE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, Long> SUM_NUMBER_OF_BYTES_WRITE = createField("SUM_NUMBER_OF_BYTES_WRITE", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.COUNT_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> COUNT_MISC = createField("COUNT_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.SUM_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> SUM_TIMER_MISC = createField("SUM_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MIN_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MIN_TIMER_MISC = createField("MIN_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.AVG_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> AVG_TIMER_MISC = createField("AVG_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.file_summary_by_instance.MAX_TIMER_MISC</code>.
     */
    public final TableField<FileSummaryByInstanceRecord, ULong> MAX_TIMER_MISC = createField("MAX_TIMER_MISC", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>performance_schema.file_summary_by_instance</code> table reference
     */
    public FileSummaryByInstance() {
        this("file_summary_by_instance", null);
    }

    /**
     * Create an aliased <code>performance_schema.file_summary_by_instance</code> table reference
     */
    public FileSummaryByInstance(String alias) {
        this(alias, FILE_SUMMARY_BY_INSTANCE);
    }

    private FileSummaryByInstance(String alias, Table<FileSummaryByInstanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileSummaryByInstance(String alias, Table<FileSummaryByInstanceRecord> aliased, Field<?>[] parameters) {
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
    public FileSummaryByInstance as(String alias) {
        return new FileSummaryByInstance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileSummaryByInstance rename(String name) {
        return new FileSummaryByInstance(name, null);
    }
}
