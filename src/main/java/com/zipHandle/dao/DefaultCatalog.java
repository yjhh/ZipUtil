/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao;


import com.zipHandle.dao.information_schema.InformationSchema;
import com.zipHandle.dao.mysql.Mysql;
import com.zipHandle.dao.performance_schema.PerformanceSchema;
import com.zipHandle.dao.test.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1558428015;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = com.zipHandle.dao.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>mysql</code>.
     */
    public final Mysql MYSQL = com.zipHandle.dao.mysql.Mysql.MYSQL;

    /**
     * The schema <code>performance_schema</code>.
     */
    public final PerformanceSchema PERFORMANCE_SCHEMA = com.zipHandle.dao.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA;

    /**
     * The schema <code>test</code>.
     */
    public final Test TEST = com.zipHandle.dao.test.Test.TEST;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            InformationSchema.INFORMATION_SCHEMA,
            Mysql.MYSQL,
            PerformanceSchema.PERFORMANCE_SCHEMA,
            Test.TEST);
    }
}
