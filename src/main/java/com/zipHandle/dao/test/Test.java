/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.test;


import com.zipHandle.dao.DefaultCatalog;
import com.zipHandle.dao.test.tables.MsdsDisplayCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Test extends SchemaImpl {

    private static final long serialVersionUID = -1242589642;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.msds_display_category</code>.
     */
    public final MsdsDisplayCategory MSDS_DISPLAY_CATEGORY = com.zipHandle.dao.test.tables.MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY;

    /**
     * The table <code>test.test</code>.
     */
    public final com.zipHandle.dao.test.tables.Test TEST_ = com.zipHandle.dao.test.tables.Test.TEST_;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY,
            com.zipHandle.dao.test.tables.Test.TEST_);
    }
}