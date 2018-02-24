/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.information_schema.tables;


import com.zipHandle.dao.information_schema.InformationSchema;
import com.zipHandle.dao.information_schema.tables.records.InnodbFtIndexCacheRecord;

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
public class InnodbFtIndexCache extends TableImpl<InnodbFtIndexCacheRecord> {

    private static final long serialVersionUID = 549329758;

    /**
     * The reference instance of <code>information_schema.INNODB_FT_INDEX_CACHE</code>
     */
    public static final InnodbFtIndexCache INNODB_FT_INDEX_CACHE = new InnodbFtIndexCache();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtIndexCacheRecord> getRecordType() {
        return InnodbFtIndexCacheRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.WORD</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, String> WORD = createField("WORD", org.jooq.impl.SQLDataType.VARCHAR.length(337).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.FIRST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> FIRST_DOC_ID = createField("FIRST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.LAST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> LAST_DOC_ID = createField("LAST_DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_COUNT</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_COUNT = createField("DOC_COUNT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> DOC_ID = createField("DOC_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_CACHE.POSITION</code>.
     */
    public final TableField<InnodbFtIndexCacheRecord, ULong> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
     */
    public InnodbFtIndexCache() {
        this("INNODB_FT_INDEX_CACHE", null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_CACHE</code> table reference
     */
    public InnodbFtIndexCache(String alias) {
        this(alias, INNODB_FT_INDEX_CACHE);
    }

    private InnodbFtIndexCache(String alias, Table<InnodbFtIndexCacheRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFtIndexCache(String alias, Table<InnodbFtIndexCacheRecord> aliased, Field<?>[] parameters) {
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
    public InnodbFtIndexCache as(String alias) {
        return new InnodbFtIndexCache(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexCache rename(String name) {
        return new InnodbFtIndexCache(name, null);
    }
}
