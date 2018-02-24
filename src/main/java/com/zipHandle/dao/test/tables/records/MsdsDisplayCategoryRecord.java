/*
 * This file is generated by jOOQ.
*/
package com.zipHandle.dao.test.tables.records;


import com.zipHandle.dao.test.tables.MsdsDisplayCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MsdsDisplayCategoryRecord extends UpdatableRecordImpl<MsdsDisplayCategoryRecord> implements Record19<String, String, String, String, Integer, Integer, String, Integer, String, Timestamp, String, Timestamp, Integer, Integer, String, Timestamp, String, Boolean, String> {

    private static final long serialVersionUID = -230356326;

    /**
     * Setter for <code>test.msds_display_category.id</code>. 展示类目ID
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>test.msds_display_category.id</code>. 展示类目ID
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.msds_display_category.parent_cid</code>. 父类目ID=0时，代表的是一级的类目
     */
    public void setParentCid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>test.msds_display_category.parent_cid</code>. 父类目ID=0时，代表的是一级的类目
     */
    public String getParentCid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.msds_display_category.top_cid</code>. 顶级类目 编号
     */
    public void setTopCid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>test.msds_display_category.top_cid</code>. 顶级类目 编号
     */
    public String getTopCid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.msds_display_category.display_name</code>. 类目名称
     */
    public void setDisplayName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>test.msds_display_category.display_name</code>. 类目名称
     */
    public String getDisplayName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>test.msds_display_category.is_parent</code>. 该类目是否为父类目(即：该类目是否还有子类目)
     */
    public void setIsParent(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>test.msds_display_category.is_parent</code>. 该类目是否为父类目(即：该类目是否还有子类目)
     */
    public Integer getIsParent() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>test.msds_display_category.is_bottom</code>. 是否是末级分类
     */
    public void setIsBottom(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>test.msds_display_category.is_bottom</code>. 是否是末级分类
     */
    public Integer getIsBottom() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>test.msds_display_category.status</code>. 状态
     */
    public void setStatus(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>test.msds_display_category.status</code>. 状态
     */
    public String getStatus() {
        return (String) get(6);
    }

    /**
     * Setter for <code>test.msds_display_category.orders</code>. 排序
     */
    public void setOrders(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>test.msds_display_category.orders</code>. 排序
     */
    public Integer getOrders() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>test.msds_display_category.create_user</code>. 创建人
     */
    public void setCreateUser(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>test.msds_display_category.create_user</code>. 创建人
     */
    public String getCreateUser() {
        return (String) get(8);
    }

    /**
     * Setter for <code>test.msds_display_category.create_date</code>. 创建时间
     */
    public void setCreateDate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>test.msds_display_category.create_date</code>. 创建时间
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>test.msds_display_category.modify_user</code>. 修改人
     */
    public void setModifyUser(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>test.msds_display_category.modify_user</code>. 修改人
     */
    public String getModifyUser() {
        return (String) get(10);
    }

    /**
     * Setter for <code>test.msds_display_category.modify_date</code>. 修改时间
     */
    public void setModifyDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>test.msds_display_category.modify_date</code>. 修改时间
     */
    public Timestamp getModifyDate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>test.msds_display_category.isdelete</code>. 是否是逻辑删除（0为否，1为是，默认为0）
     */
    public void setIsdelete(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>test.msds_display_category.isdelete</code>. 是否是逻辑删除（0为否，1为是，默认为0）
     */
    public Integer getIsdelete() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>test.msds_display_category.level</code>. 分类相对于顶级分类的等级
     */
    public void setLevel(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>test.msds_display_category.level</code>. 分类相对于顶级分类的等级
     */
    public Integer getLevel() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>test.msds_display_category.only_code</code>.
     */
    public void setOnlyCode(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>test.msds_display_category.only_code</code>.
     */
    public String getOnlyCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>test.msds_display_category.modify_relations_date</code>.
     */
    public void setModifyRelationsDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>test.msds_display_category.modify_relations_date</code>.
     */
    public Timestamp getModifyRelationsDate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>test.msds_display_category.tree_path</code>.
     */
    public void setTreePath(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>test.msds_display_category.tree_path</code>.
     */
    public String getTreePath() {
        return (String) get(16);
    }

    /**
     * Setter for <code>test.msds_display_category.is_hidden</code>. 是否隐藏(0隐藏1显示)
     */
    public void setIsHidden(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>test.msds_display_category.is_hidden</code>. 是否隐藏(0隐藏1显示)
     */
    public Boolean getIsHidden() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>test.msds_display_category.platform</code>.
     */
    public void setPlatform(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>test.msds_display_category.platform</code>.
     */
    public String getPlatform() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, Integer, Integer, String, Integer, String, Timestamp, String, Timestamp, Integer, Integer, String, Timestamp, String, Boolean, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<String, String, String, String, Integer, Integer, String, Integer, String, Timestamp, String, Timestamp, Integer, Integer, String, Timestamp, String, Boolean, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.PARENT_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.TOP_CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.DISPLAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.IS_PARENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.IS_BOTTOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.ORDERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.MODIFY_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.MODIFY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.ISDELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.ONLY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.MODIFY_RELATIONS_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.TREE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.IS_HIDDEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY.PLATFORM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getParentCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTopCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDisplayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIsParent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsBottom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getOrders();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getModifyUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifyDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getIsdelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getOnlyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getModifyRelationsDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getTreePath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getIsHidden();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getPlatform();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value2(String value) {
        setParentCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value3(String value) {
        setTopCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value4(String value) {
        setDisplayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value5(Integer value) {
        setIsParent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value6(Integer value) {
        setIsBottom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value7(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value8(Integer value) {
        setOrders(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value9(String value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value10(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value11(String value) {
        setModifyUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value12(Timestamp value) {
        setModifyDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value13(Integer value) {
        setIsdelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value14(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value15(String value) {
        setOnlyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value16(Timestamp value) {
        setModifyRelationsDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value17(String value) {
        setTreePath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value18(Boolean value) {
        setIsHidden(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord value19(String value) {
        setPlatform(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MsdsDisplayCategoryRecord values(String value1, String value2, String value3, String value4, Integer value5, Integer value6, String value7, Integer value8, String value9, Timestamp value10, String value11, Timestamp value12, Integer value13, Integer value14, String value15, Timestamp value16, String value17, Boolean value18, String value19) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MsdsDisplayCategoryRecord
     */
    public MsdsDisplayCategoryRecord() {
        super(MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY);
    }

    /**
     * Create a detached, initialised MsdsDisplayCategoryRecord
     */
    public MsdsDisplayCategoryRecord(String id, String parentCid, String topCid, String displayName, Integer isParent, Integer isBottom, String status, Integer orders, String createUser, Timestamp createDate, String modifyUser, Timestamp modifyDate, Integer isdelete, Integer level, String onlyCode, Timestamp modifyRelationsDate, String treePath, Boolean isHidden, String platform) {
        super(MsdsDisplayCategory.MSDS_DISPLAY_CATEGORY);

        set(0, id);
        set(1, parentCid);
        set(2, topCid);
        set(3, displayName);
        set(4, isParent);
        set(5, isBottom);
        set(6, status);
        set(7, orders);
        set(8, createUser);
        set(9, createDate);
        set(10, modifyUser);
        set(11, modifyDate);
        set(12, isdelete);
        set(13, level);
        set(14, onlyCode);
        set(15, modifyRelationsDate);
        set(16, treePath);
        set(17, isHidden);
        set(18, platform);
    }
}