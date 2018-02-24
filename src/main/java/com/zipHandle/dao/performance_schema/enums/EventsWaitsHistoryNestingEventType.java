/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum EventsWaitsHistoryNestingEventType implements EnumType {

    STATEMENT("STATEMENT"),

    STAGE("STAGE"),

    WAIT("WAIT");

    private final String literal;

    private EventsWaitsHistoryNestingEventType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "events_waits_history_NESTING_EVENT_TYPE";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
