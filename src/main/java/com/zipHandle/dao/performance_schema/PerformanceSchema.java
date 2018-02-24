/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.performance_schema;


import com.zipHandle.dao.DefaultCatalog;
import com.zipHandle.dao.performance_schema.tables.Accounts;
import com.zipHandle.dao.performance_schema.tables.CondInstances;
import com.zipHandle.dao.performance_schema.tables.EventsStagesCurrent;
import com.zipHandle.dao.performance_schema.tables.EventsStagesHistory;
import com.zipHandle.dao.performance_schema.tables.EventsStagesHistoryLong;
import com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsCurrent;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsHistory;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsHistoryLong;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByDigest;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsCurrent;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsHistory;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsHistoryLong;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByInstance;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import com.zipHandle.dao.performance_schema.tables.FileInstances;
import com.zipHandle.dao.performance_schema.tables.FileSummaryByEventName;
import com.zipHandle.dao.performance_schema.tables.FileSummaryByInstance;
import com.zipHandle.dao.performance_schema.tables.HostCache;
import com.zipHandle.dao.performance_schema.tables.Hosts;
import com.zipHandle.dao.performance_schema.tables.MutexInstances;
import com.zipHandle.dao.performance_schema.tables.ObjectsSummaryGlobalByType;
import com.zipHandle.dao.performance_schema.tables.PerformanceTimers;
import com.zipHandle.dao.performance_schema.tables.RwlockInstances;
import com.zipHandle.dao.performance_schema.tables.SessionAccountConnectAttrs;
import com.zipHandle.dao.performance_schema.tables.SessionConnectAttrs;
import com.zipHandle.dao.performance_schema.tables.SetupActors;
import com.zipHandle.dao.performance_schema.tables.SetupConsumers;
import com.zipHandle.dao.performance_schema.tables.SetupInstruments;
import com.zipHandle.dao.performance_schema.tables.SetupObjects;
import com.zipHandle.dao.performance_schema.tables.SetupTimers;
import com.zipHandle.dao.performance_schema.tables.SocketInstances;
import com.zipHandle.dao.performance_schema.tables.SocketSummaryByEventName;
import com.zipHandle.dao.performance_schema.tables.SocketSummaryByInstance;
import com.zipHandle.dao.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import com.zipHandle.dao.performance_schema.tables.TableIoWaitsSummaryByTable;
import com.zipHandle.dao.performance_schema.tables.TableLockWaitsSummaryByTable;
import com.zipHandle.dao.performance_schema.tables.Threads;
import com.zipHandle.dao.performance_schema.tables.Users;

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
public class PerformanceSchema extends SchemaImpl {

    private static final long serialVersionUID = 656525314;

    /**
     * The reference instance of <code>performance_schema</code>
     */
    public static final PerformanceSchema PERFORMANCE_SCHEMA = new PerformanceSchema();

    /**
     * The table <code>performance_schema.accounts</code>.
     */
    public final Accounts ACCOUNTS = com.zipHandle.dao.performance_schema.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    public final CondInstances COND_INSTANCES = com.zipHandle.dao.performance_schema.tables.CondInstances.COND_INSTANCES;

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    public final EventsStagesCurrent EVENTS_STAGES_CURRENT = com.zipHandle.dao.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT;

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    public final EventsStagesHistory EVENTS_STAGES_HISTORY = com.zipHandle.dao.performance_schema.tables.EventsStagesHistory.EVENTS_STAGES_HISTORY;

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    public final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = com.zipHandle.dao.performance_schema.tables.EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    public final EventsStagesSummaryByAccountByEventName EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    public final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    public final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    public final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    public final EventsStagesSummaryGlobalByEventName EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    public final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = com.zipHandle.dao.performance_schema.tables.EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT;

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    public final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = com.zipHandle.dao.performance_schema.tables.EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY;

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    public final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = com.zipHandle.dao.performance_schema.tables.EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    public final EventsStatementsSummaryByAccountByEventName EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    public final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    public final EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    public final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    public final EventsStatementsSummaryByUserByEventName EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    public final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    public final EventsWaitsCurrent EVENTS_WAITS_CURRENT = com.zipHandle.dao.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT;

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    public final EventsWaitsHistory EVENTS_WAITS_HISTORY = com.zipHandle.dao.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY;

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    public final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = com.zipHandle.dao.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    public final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    public final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    public final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    public final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    public final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    public final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    public final FileInstances FILE_INSTANCES = com.zipHandle.dao.performance_schema.tables.FileInstances.FILE_INSTANCES;

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    public final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    public final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = com.zipHandle.dao.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    public final Hosts HOSTS = com.zipHandle.dao.performance_schema.tables.Hosts.HOSTS;

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    public final HostCache HOST_CACHE = com.zipHandle.dao.performance_schema.tables.HostCache.HOST_CACHE;

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    public final MutexInstances MUTEX_INSTANCES = com.zipHandle.dao.performance_schema.tables.MutexInstances.MUTEX_INSTANCES;

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    public final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = com.zipHandle.dao.performance_schema.tables.ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE;

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    public final PerformanceTimers PERFORMANCE_TIMERS = com.zipHandle.dao.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS;

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    public final RwlockInstances RWLOCK_INSTANCES = com.zipHandle.dao.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES;

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    public final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = com.zipHandle.dao.performance_schema.tables.SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    public final SessionConnectAttrs SESSION_CONNECT_ATTRS = com.zipHandle.dao.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    public final SetupActors SETUP_ACTORS = com.zipHandle.dao.performance_schema.tables.SetupActors.SETUP_ACTORS;

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    public final SetupConsumers SETUP_CONSUMERS = com.zipHandle.dao.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS;

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    public final SetupInstruments SETUP_INSTRUMENTS = com.zipHandle.dao.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS;

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    public final SetupObjects SETUP_OBJECTS = com.zipHandle.dao.performance_schema.tables.SetupObjects.SETUP_OBJECTS;

    /**
     * The table <code>performance_schema.setup_timers</code>.
     */
    public final SetupTimers SETUP_TIMERS = com.zipHandle.dao.performance_schema.tables.SetupTimers.SETUP_TIMERS;

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    public final SocketInstances SOCKET_INSTANCES = com.zipHandle.dao.performance_schema.tables.SocketInstances.SOCKET_INSTANCES;

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    public final SocketSummaryByEventName SOCKET_SUMMARY_BY_EVENT_NAME = com.zipHandle.dao.performance_schema.tables.SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    public final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = com.zipHandle.dao.performance_schema.tables.SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    public final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = com.zipHandle.dao.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    public final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = com.zipHandle.dao.performance_schema.tables.TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    public final TableLockWaitsSummaryByTable TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = com.zipHandle.dao.performance_schema.tables.TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.threads</code>.
     */
    public final Threads THREADS = com.zipHandle.dao.performance_schema.tables.Threads.THREADS;

    /**
     * The table <code>performance_schema.users</code>.
     */
    public final Users USERS = com.zipHandle.dao.performance_schema.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private PerformanceSchema() {
        super("performance_schema", null);
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
            Accounts.ACCOUNTS,
            CondInstances.COND_INSTANCES,
            EventsStagesCurrent.EVENTS_STAGES_CURRENT,
            EventsStagesHistory.EVENTS_STAGES_HISTORY,
            EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG,
            EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME,
            EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT,
            EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY,
            EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG,
            EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST,
            EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME,
            EventsWaitsCurrent.EVENTS_WAITS_CURRENT,
            EventsWaitsHistory.EVENTS_WAITS_HISTORY,
            EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG,
            EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME,
            EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME,
            EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE,
            EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME,
            EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME,
            EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME,
            FileInstances.FILE_INSTANCES,
            FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME,
            FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE,
            Hosts.HOSTS,
            HostCache.HOST_CACHE,
            MutexInstances.MUTEX_INSTANCES,
            ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE,
            PerformanceTimers.PERFORMANCE_TIMERS,
            RwlockInstances.RWLOCK_INSTANCES,
            SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS,
            SessionConnectAttrs.SESSION_CONNECT_ATTRS,
            SetupActors.SETUP_ACTORS,
            SetupConsumers.SETUP_CONSUMERS,
            SetupInstruments.SETUP_INSTRUMENTS,
            SetupObjects.SETUP_OBJECTS,
            SetupTimers.SETUP_TIMERS,
            SocketInstances.SOCKET_INSTANCES,
            SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME,
            SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE,
            TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE,
            TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE,
            TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE,
            Threads.THREADS,
            Users.USERS);
    }
}
