/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema.tables.records;


import com.zipHandle.dao.performance_schema.enums.HostCacheHostValidated;
import com.zipHandle.dao.performance_schema.tables.HostCache;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;


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
public class HostCacheRecord extends TableRecordImpl<HostCacheRecord> {

    private static final long serialVersionUID = -1640382639;

    /**
     * Setter for <code>performance_schema.host_cache.IP</code>.
     */
    public void setIp(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.IP</code>.
     */
    public String getIp() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.host_cache.HOST</code>.
     */
    public void setHost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.HOST</code>.
     */
    public String getHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.host_cache.HOST_VALIDATED</code>.
     */
    public void setHostValidated(HostCacheHostValidated value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.HOST_VALIDATED</code>.
     */
    public HostCacheHostValidated getHostValidated() {
        return (HostCacheHostValidated) get(2);
    }

    /**
     * Setter for <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
     */
    public void setSumConnectErrors(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.SUM_CONNECT_ERRORS</code>.
     */
    public Long getSumConnectErrors() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
     */
    public void setCountHostBlockedErrors(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_HOST_BLOCKED_ERRORS</code>.
     */
    public Long getCountHostBlockedErrors() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
     */
    public void setCountNameinfoTransientErrors(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_NAMEINFO_TRANSIENT_ERRORS</code>.
     */
    public Long getCountNameinfoTransientErrors() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
     */
    public void setCountNameinfoPermanentErrors(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_NAMEINFO_PERMANENT_ERRORS</code>.
     */
    public Long getCountNameinfoPermanentErrors() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
     */
    public void setCountFormatErrors(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_FORMAT_ERRORS</code>.
     */
    public Long getCountFormatErrors() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
     */
    public void setCountAddrinfoTransientErrors(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_ADDRINFO_TRANSIENT_ERRORS</code>.
     */
    public Long getCountAddrinfoTransientErrors() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
     */
    public void setCountAddrinfoPermanentErrors(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_ADDRINFO_PERMANENT_ERRORS</code>.
     */
    public Long getCountAddrinfoPermanentErrors() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
     */
    public void setCountFcrdnsErrors(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_FCRDNS_ERRORS</code>.
     */
    public Long getCountFcrdnsErrors() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
     */
    public void setCountHostAclErrors(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_HOST_ACL_ERRORS</code>.
     */
    public Long getCountHostAclErrors() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
     */
    public void setCountNoAuthPluginErrors(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_NO_AUTH_PLUGIN_ERRORS</code>.
     */
    public Long getCountNoAuthPluginErrors() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
     */
    public void setCountAuthPluginErrors(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_AUTH_PLUGIN_ERRORS</code>.
     */
    public Long getCountAuthPluginErrors() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
     */
    public void setCountHandshakeErrors(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_HANDSHAKE_ERRORS</code>.
     */
    public Long getCountHandshakeErrors() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
     */
    public void setCountProxyUserErrors(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ERRORS</code>.
     */
    public Long getCountProxyUserErrors() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
     */
    public void setCountProxyUserAclErrors(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_PROXY_USER_ACL_ERRORS</code>.
     */
    public Long getCountProxyUserAclErrors() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
     */
    public void setCountAuthenticationErrors(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_AUTHENTICATION_ERRORS</code>.
     */
    public Long getCountAuthenticationErrors() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
     */
    public void setCountSslErrors(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_SSL_ERRORS</code>.
     */
    public Long getCountSslErrors() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
     */
    public void setCountMaxUserConnectionsErrors(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_ERRORS</code>.
     */
    public Long getCountMaxUserConnectionsErrors() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
     */
    public void setCountMaxUserConnectionsPerHourErrors(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS</code>.
     */
    public Long getCountMaxUserConnectionsPerHourErrors() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
     */
    public void setCountDefaultDatabaseErrors(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_DEFAULT_DATABASE_ERRORS</code>.
     */
    public Long getCountDefaultDatabaseErrors() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
     */
    public void setCountInitConnectErrors(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_INIT_CONNECT_ERRORS</code>.
     */
    public Long getCountInitConnectErrors() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
     */
    public void setCountLocalErrors(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_LOCAL_ERRORS</code>.
     */
    public Long getCountLocalErrors() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
     */
    public void setCountUnknownErrors(Long value) {
        set(24, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.COUNT_UNKNOWN_ERRORS</code>.
     */
    public Long getCountUnknownErrors() {
        return (Long) get(24);
    }

    /**
     * Setter for <code>performance_schema.host_cache.FIRST_SEEN</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.FIRST_SEEN</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>performance_schema.host_cache.LAST_SEEN</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.LAST_SEEN</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
     */
    public void setFirstErrorSeen(Timestamp value) {
        set(27, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.FIRST_ERROR_SEEN</code>.
     */
    public Timestamp getFirstErrorSeen() {
        return (Timestamp) get(27);
    }

    /**
     * Setter for <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
     */
    public void setLastErrorSeen(Timestamp value) {
        set(28, value);
    }

    /**
     * Getter for <code>performance_schema.host_cache.LAST_ERROR_SEEN</code>.
     */
    public Timestamp getLastErrorSeen() {
        return (Timestamp) get(28);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostCacheRecord
     */
    public HostCacheRecord() {
        super(HostCache.HOST_CACHE);
    }

    /**
     * Create a detached, initialised HostCacheRecord
     */
    public HostCacheRecord(String ip, String host, HostCacheHostValidated hostValidated, Long sumConnectErrors, Long countHostBlockedErrors, Long countNameinfoTransientErrors, Long countNameinfoPermanentErrors, Long countFormatErrors, Long countAddrinfoTransientErrors, Long countAddrinfoPermanentErrors, Long countFcrdnsErrors, Long countHostAclErrors, Long countNoAuthPluginErrors, Long countAuthPluginErrors, Long countHandshakeErrors, Long countProxyUserErrors, Long countProxyUserAclErrors, Long countAuthenticationErrors, Long countSslErrors, Long countMaxUserConnectionsErrors, Long countMaxUserConnectionsPerHourErrors, Long countDefaultDatabaseErrors, Long countInitConnectErrors, Long countLocalErrors, Long countUnknownErrors, Timestamp firstSeen, Timestamp lastSeen, Timestamp firstErrorSeen, Timestamp lastErrorSeen) {
        super(HostCache.HOST_CACHE);

        set(0, ip);
        set(1, host);
        set(2, hostValidated);
        set(3, sumConnectErrors);
        set(4, countHostBlockedErrors);
        set(5, countNameinfoTransientErrors);
        set(6, countNameinfoPermanentErrors);
        set(7, countFormatErrors);
        set(8, countAddrinfoTransientErrors);
        set(9, countAddrinfoPermanentErrors);
        set(10, countFcrdnsErrors);
        set(11, countHostAclErrors);
        set(12, countNoAuthPluginErrors);
        set(13, countAuthPluginErrors);
        set(14, countHandshakeErrors);
        set(15, countProxyUserErrors);
        set(16, countProxyUserAclErrors);
        set(17, countAuthenticationErrors);
        set(18, countSslErrors);
        set(19, countMaxUserConnectionsErrors);
        set(20, countMaxUserConnectionsPerHourErrors);
        set(21, countDefaultDatabaseErrors);
        set(22, countInitConnectErrors);
        set(23, countLocalErrors);
        set(24, countUnknownErrors);
        set(25, firstSeen);
        set(26, lastSeen);
        set(27, firstErrorSeen);
        set(28, lastErrorSeen);
    }
}
