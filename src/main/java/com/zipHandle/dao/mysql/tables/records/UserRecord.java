/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.mysql.tables.records;


import com.zipHandle.dao.mysql.enums.UserAlterPriv;
import com.zipHandle.dao.mysql.enums.UserAlterRoutinePriv;
import com.zipHandle.dao.mysql.enums.UserCreatePriv;
import com.zipHandle.dao.mysql.enums.UserCreateRoutinePriv;
import com.zipHandle.dao.mysql.enums.UserCreateTablespacePriv;
import com.zipHandle.dao.mysql.enums.UserCreateTmpTablePriv;
import com.zipHandle.dao.mysql.enums.UserCreateUserPriv;
import com.zipHandle.dao.mysql.enums.UserCreateViewPriv;
import com.zipHandle.dao.mysql.enums.UserDeletePriv;
import com.zipHandle.dao.mysql.enums.UserDropPriv;
import com.zipHandle.dao.mysql.enums.UserEventPriv;
import com.zipHandle.dao.mysql.enums.UserExecutePriv;
import com.zipHandle.dao.mysql.enums.UserFilePriv;
import com.zipHandle.dao.mysql.enums.UserGrantPriv;
import com.zipHandle.dao.mysql.enums.UserIndexPriv;
import com.zipHandle.dao.mysql.enums.UserInsertPriv;
import com.zipHandle.dao.mysql.enums.UserLockTablesPriv;
import com.zipHandle.dao.mysql.enums.UserPasswordExpired;
import com.zipHandle.dao.mysql.enums.UserProcessPriv;
import com.zipHandle.dao.mysql.enums.UserReferencesPriv;
import com.zipHandle.dao.mysql.enums.UserReloadPriv;
import com.zipHandle.dao.mysql.enums.UserReplClientPriv;
import com.zipHandle.dao.mysql.enums.UserReplSlavePriv;
import com.zipHandle.dao.mysql.enums.UserSelectPriv;
import com.zipHandle.dao.mysql.enums.UserShowDbPriv;
import com.zipHandle.dao.mysql.enums.UserShowViewPriv;
import com.zipHandle.dao.mysql.enums.UserShutdownPriv;
import com.zipHandle.dao.mysql.enums.UserSslType;
import com.zipHandle.dao.mysql.enums.UserSuperPriv;
import com.zipHandle.dao.mysql.enums.UserTriggerPriv;
import com.zipHandle.dao.mysql.enums.UserUpdatePriv;
import com.zipHandle.dao.mysql.tables.User;

import javax.annotation.Generated;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * Users and global privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> {

    private static final long serialVersionUID = -2055618233;

    /**
     * Setter for <code>mysql.user.Host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.user.Host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.user.User</code>.
     */
    public void setUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.user.User</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.user.Password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.user.Password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.user.Select_priv</code>.
     */
    public void setSelectPriv(UserSelectPriv value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.user.Select_priv</code>.
     */
    public UserSelectPriv getSelectPriv() {
        return (UserSelectPriv) get(3);
    }

    /**
     * Setter for <code>mysql.user.Insert_priv</code>.
     */
    public void setInsertPriv(UserInsertPriv value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.user.Insert_priv</code>.
     */
    public UserInsertPriv getInsertPriv() {
        return (UserInsertPriv) get(4);
    }

    /**
     * Setter for <code>mysql.user.Update_priv</code>.
     */
    public void setUpdatePriv(UserUpdatePriv value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.user.Update_priv</code>.
     */
    public UserUpdatePriv getUpdatePriv() {
        return (UserUpdatePriv) get(5);
    }

    /**
     * Setter for <code>mysql.user.Delete_priv</code>.
     */
    public void setDeletePriv(UserDeletePriv value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.user.Delete_priv</code>.
     */
    public UserDeletePriv getDeletePriv() {
        return (UserDeletePriv) get(6);
    }

    /**
     * Setter for <code>mysql.user.Create_priv</code>.
     */
    public void setCreatePriv(UserCreatePriv value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.user.Create_priv</code>.
     */
    public UserCreatePriv getCreatePriv() {
        return (UserCreatePriv) get(7);
    }

    /**
     * Setter for <code>mysql.user.Drop_priv</code>.
     */
    public void setDropPriv(UserDropPriv value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql.user.Drop_priv</code>.
     */
    public UserDropPriv getDropPriv() {
        return (UserDropPriv) get(8);
    }

    /**
     * Setter for <code>mysql.user.Reload_priv</code>.
     */
    public void setReloadPriv(UserReloadPriv value) {
        set(9, value);
    }

    /**
     * Getter for <code>mysql.user.Reload_priv</code>.
     */
    public UserReloadPriv getReloadPriv() {
        return (UserReloadPriv) get(9);
    }

    /**
     * Setter for <code>mysql.user.Shutdown_priv</code>.
     */
    public void setShutdownPriv(UserShutdownPriv value) {
        set(10, value);
    }

    /**
     * Getter for <code>mysql.user.Shutdown_priv</code>.
     */
    public UserShutdownPriv getShutdownPriv() {
        return (UserShutdownPriv) get(10);
    }

    /**
     * Setter for <code>mysql.user.Process_priv</code>.
     */
    public void setProcessPriv(UserProcessPriv value) {
        set(11, value);
    }

    /**
     * Getter for <code>mysql.user.Process_priv</code>.
     */
    public UserProcessPriv getProcessPriv() {
        return (UserProcessPriv) get(11);
    }

    /**
     * Setter for <code>mysql.user.File_priv</code>.
     */
    public void setFilePriv(UserFilePriv value) {
        set(12, value);
    }

    /**
     * Getter for <code>mysql.user.File_priv</code>.
     */
    public UserFilePriv getFilePriv() {
        return (UserFilePriv) get(12);
    }

    /**
     * Setter for <code>mysql.user.Grant_priv</code>.
     */
    public void setGrantPriv(UserGrantPriv value) {
        set(13, value);
    }

    /**
     * Getter for <code>mysql.user.Grant_priv</code>.
     */
    public UserGrantPriv getGrantPriv() {
        return (UserGrantPriv) get(13);
    }

    /**
     * Setter for <code>mysql.user.References_priv</code>.
     */
    public void setReferencesPriv(UserReferencesPriv value) {
        set(14, value);
    }

    /**
     * Getter for <code>mysql.user.References_priv</code>.
     */
    public UserReferencesPriv getReferencesPriv() {
        return (UserReferencesPriv) get(14);
    }

    /**
     * Setter for <code>mysql.user.Index_priv</code>.
     */
    public void setIndexPriv(UserIndexPriv value) {
        set(15, value);
    }

    /**
     * Getter for <code>mysql.user.Index_priv</code>.
     */
    public UserIndexPriv getIndexPriv() {
        return (UserIndexPriv) get(15);
    }

    /**
     * Setter for <code>mysql.user.Alter_priv</code>.
     */
    public void setAlterPriv(UserAlterPriv value) {
        set(16, value);
    }

    /**
     * Getter for <code>mysql.user.Alter_priv</code>.
     */
    public UserAlterPriv getAlterPriv() {
        return (UserAlterPriv) get(16);
    }

    /**
     * Setter for <code>mysql.user.Show_db_priv</code>.
     */
    public void setShowDbPriv(UserShowDbPriv value) {
        set(17, value);
    }

    /**
     * Getter for <code>mysql.user.Show_db_priv</code>.
     */
    public UserShowDbPriv getShowDbPriv() {
        return (UserShowDbPriv) get(17);
    }

    /**
     * Setter for <code>mysql.user.Super_priv</code>.
     */
    public void setSuperPriv(UserSuperPriv value) {
        set(18, value);
    }

    /**
     * Getter for <code>mysql.user.Super_priv</code>.
     */
    public UserSuperPriv getSuperPriv() {
        return (UserSuperPriv) get(18);
    }

    /**
     * Setter for <code>mysql.user.Create_tmp_table_priv</code>.
     */
    public void setCreateTmpTablePriv(UserCreateTmpTablePriv value) {
        set(19, value);
    }

    /**
     * Getter for <code>mysql.user.Create_tmp_table_priv</code>.
     */
    public UserCreateTmpTablePriv getCreateTmpTablePriv() {
        return (UserCreateTmpTablePriv) get(19);
    }

    /**
     * Setter for <code>mysql.user.Lock_tables_priv</code>.
     */
    public void setLockTablesPriv(UserLockTablesPriv value) {
        set(20, value);
    }

    /**
     * Getter for <code>mysql.user.Lock_tables_priv</code>.
     */
    public UserLockTablesPriv getLockTablesPriv() {
        return (UserLockTablesPriv) get(20);
    }

    /**
     * Setter for <code>mysql.user.Execute_priv</code>.
     */
    public void setExecutePriv(UserExecutePriv value) {
        set(21, value);
    }

    /**
     * Getter for <code>mysql.user.Execute_priv</code>.
     */
    public UserExecutePriv getExecutePriv() {
        return (UserExecutePriv) get(21);
    }

    /**
     * Setter for <code>mysql.user.Repl_slave_priv</code>.
     */
    public void setReplSlavePriv(UserReplSlavePriv value) {
        set(22, value);
    }

    /**
     * Getter for <code>mysql.user.Repl_slave_priv</code>.
     */
    public UserReplSlavePriv getReplSlavePriv() {
        return (UserReplSlavePriv) get(22);
    }

    /**
     * Setter for <code>mysql.user.Repl_client_priv</code>.
     */
    public void setReplClientPriv(UserReplClientPriv value) {
        set(23, value);
    }

    /**
     * Getter for <code>mysql.user.Repl_client_priv</code>.
     */
    public UserReplClientPriv getReplClientPriv() {
        return (UserReplClientPriv) get(23);
    }

    /**
     * Setter for <code>mysql.user.Create_view_priv</code>.
     */
    public void setCreateViewPriv(UserCreateViewPriv value) {
        set(24, value);
    }

    /**
     * Getter for <code>mysql.user.Create_view_priv</code>.
     */
    public UserCreateViewPriv getCreateViewPriv() {
        return (UserCreateViewPriv) get(24);
    }

    /**
     * Setter for <code>mysql.user.Show_view_priv</code>.
     */
    public void setShowViewPriv(UserShowViewPriv value) {
        set(25, value);
    }

    /**
     * Getter for <code>mysql.user.Show_view_priv</code>.
     */
    public UserShowViewPriv getShowViewPriv() {
        return (UserShowViewPriv) get(25);
    }

    /**
     * Setter for <code>mysql.user.Create_routine_priv</code>.
     */
    public void setCreateRoutinePriv(UserCreateRoutinePriv value) {
        set(26, value);
    }

    /**
     * Getter for <code>mysql.user.Create_routine_priv</code>.
     */
    public UserCreateRoutinePriv getCreateRoutinePriv() {
        return (UserCreateRoutinePriv) get(26);
    }

    /**
     * Setter for <code>mysql.user.Alter_routine_priv</code>.
     */
    public void setAlterRoutinePriv(UserAlterRoutinePriv value) {
        set(27, value);
    }

    /**
     * Getter for <code>mysql.user.Alter_routine_priv</code>.
     */
    public UserAlterRoutinePriv getAlterRoutinePriv() {
        return (UserAlterRoutinePriv) get(27);
    }

    /**
     * Setter for <code>mysql.user.Create_user_priv</code>.
     */
    public void setCreateUserPriv(UserCreateUserPriv value) {
        set(28, value);
    }

    /**
     * Getter for <code>mysql.user.Create_user_priv</code>.
     */
    public UserCreateUserPriv getCreateUserPriv() {
        return (UserCreateUserPriv) get(28);
    }

    /**
     * Setter for <code>mysql.user.Event_priv</code>.
     */
    public void setEventPriv(UserEventPriv value) {
        set(29, value);
    }

    /**
     * Getter for <code>mysql.user.Event_priv</code>.
     */
    public UserEventPriv getEventPriv() {
        return (UserEventPriv) get(29);
    }

    /**
     * Setter for <code>mysql.user.Trigger_priv</code>.
     */
    public void setTriggerPriv(UserTriggerPriv value) {
        set(30, value);
    }

    /**
     * Getter for <code>mysql.user.Trigger_priv</code>.
     */
    public UserTriggerPriv getTriggerPriv() {
        return (UserTriggerPriv) get(30);
    }

    /**
     * Setter for <code>mysql.user.Create_tablespace_priv</code>.
     */
    public void setCreateTablespacePriv(UserCreateTablespacePriv value) {
        set(31, value);
    }

    /**
     * Getter for <code>mysql.user.Create_tablespace_priv</code>.
     */
    public UserCreateTablespacePriv getCreateTablespacePriv() {
        return (UserCreateTablespacePriv) get(31);
    }

    /**
     * Setter for <code>mysql.user.ssl_type</code>.
     */
    public void setSslType(UserSslType value) {
        set(32, value);
    }

    /**
     * Getter for <code>mysql.user.ssl_type</code>.
     */
    public UserSslType getSslType() {
        return (UserSslType) get(32);
    }

    /**
     * Setter for <code>mysql.user.ssl_cipher</code>.
     */
    public void setSslCipher(byte... value) {
        set(33, value);
    }

    /**
     * Getter for <code>mysql.user.ssl_cipher</code>.
     */
    public byte[] getSslCipher() {
        return (byte[]) get(33);
    }

    /**
     * Setter for <code>mysql.user.x509_issuer</code>.
     */
    public void setX509Issuer(byte... value) {
        set(34, value);
    }

    /**
     * Getter for <code>mysql.user.x509_issuer</code>.
     */
    public byte[] getX509Issuer() {
        return (byte[]) get(34);
    }

    /**
     * Setter for <code>mysql.user.x509_subject</code>.
     */
    public void setX509Subject(byte... value) {
        set(35, value);
    }

    /**
     * Getter for <code>mysql.user.x509_subject</code>.
     */
    public byte[] getX509Subject() {
        return (byte[]) get(35);
    }

    /**
     * Setter for <code>mysql.user.max_questions</code>.
     */
    public void setMaxQuestions(UInteger value) {
        set(36, value);
    }

    /**
     * Getter for <code>mysql.user.max_questions</code>.
     */
    public UInteger getMaxQuestions() {
        return (UInteger) get(36);
    }

    /**
     * Setter for <code>mysql.user.max_updates</code>.
     */
    public void setMaxUpdates(UInteger value) {
        set(37, value);
    }

    /**
     * Getter for <code>mysql.user.max_updates</code>.
     */
    public UInteger getMaxUpdates() {
        return (UInteger) get(37);
    }

    /**
     * Setter for <code>mysql.user.max_connections</code>.
     */
    public void setMaxConnections(UInteger value) {
        set(38, value);
    }

    /**
     * Getter for <code>mysql.user.max_connections</code>.
     */
    public UInteger getMaxConnections() {
        return (UInteger) get(38);
    }

    /**
     * Setter for <code>mysql.user.max_user_connections</code>.
     */
    public void setMaxUserConnections(UInteger value) {
        set(39, value);
    }

    /**
     * Getter for <code>mysql.user.max_user_connections</code>.
     */
    public UInteger getMaxUserConnections() {
        return (UInteger) get(39);
    }

    /**
     * Setter for <code>mysql.user.plugin</code>.
     */
    public void setPlugin(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>mysql.user.plugin</code>.
     */
    public String getPlugin() {
        return (String) get(40);
    }

    /**
     * Setter for <code>mysql.user.authentication_string</code>.
     */
    public void setAuthenticationString(String value) {
        set(41, value);
    }

    /**
     * Getter for <code>mysql.user.authentication_string</code>.
     */
    public String getAuthenticationString() {
        return (String) get(41);
    }

    /**
     * Setter for <code>mysql.user.password_expired</code>.
     */
    public void setPasswordExpired(UserPasswordExpired value) {
        set(42, value);
    }

    /**
     * Getter for <code>mysql.user.password_expired</code>.
     */
    public UserPasswordExpired getPasswordExpired() {
        return (UserPasswordExpired) get(42);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(String host, String user, String password, UserSelectPriv selectPriv, UserInsertPriv insertPriv, UserUpdatePriv updatePriv, UserDeletePriv deletePriv, UserCreatePriv createPriv, UserDropPriv dropPriv, UserReloadPriv reloadPriv, UserShutdownPriv shutdownPriv, UserProcessPriv processPriv, UserFilePriv filePriv, UserGrantPriv grantPriv, UserReferencesPriv referencesPriv, UserIndexPriv indexPriv, UserAlterPriv alterPriv, UserShowDbPriv showDbPriv, UserSuperPriv superPriv, UserCreateTmpTablePriv createTmpTablePriv, UserLockTablesPriv lockTablesPriv, UserExecutePriv executePriv, UserReplSlavePriv replSlavePriv, UserReplClientPriv replClientPriv, UserCreateViewPriv createViewPriv, UserShowViewPriv showViewPriv, UserCreateRoutinePriv createRoutinePriv, UserAlterRoutinePriv alterRoutinePriv, UserCreateUserPriv createUserPriv, UserEventPriv eventPriv, UserTriggerPriv triggerPriv, UserCreateTablespacePriv createTablespacePriv, UserSslType sslType, byte[] sslCipher, byte[] x509Issuer, byte[] x509Subject, UInteger maxQuestions, UInteger maxUpdates, UInteger maxConnections, UInteger maxUserConnections, String plugin, String authenticationString, UserPasswordExpired passwordExpired) {
        super(User.USER);

        set(0, host);
        set(1, user);
        set(2, password);
        set(3, selectPriv);
        set(4, insertPriv);
        set(5, updatePriv);
        set(6, deletePriv);
        set(7, createPriv);
        set(8, dropPriv);
        set(9, reloadPriv);
        set(10, shutdownPriv);
        set(11, processPriv);
        set(12, filePriv);
        set(13, grantPriv);
        set(14, referencesPriv);
        set(15, indexPriv);
        set(16, alterPriv);
        set(17, showDbPriv);
        set(18, superPriv);
        set(19, createTmpTablePriv);
        set(20, lockTablesPriv);
        set(21, executePriv);
        set(22, replSlavePriv);
        set(23, replClientPriv);
        set(24, createViewPriv);
        set(25, showViewPriv);
        set(26, createRoutinePriv);
        set(27, alterRoutinePriv);
        set(28, createUserPriv);
        set(29, eventPriv);
        set(30, triggerPriv);
        set(31, createTablespacePriv);
        set(32, sslType);
        set(33, sslCipher);
        set(34, x509Issuer);
        set(35, x509Subject);
        set(36, maxQuestions);
        set(37, maxUpdates);
        set(38, maxConnections);
        set(39, maxUserConnections);
        set(40, plugin);
        set(41, authenticationString);
        set(42, passwordExpired);
    }
}
