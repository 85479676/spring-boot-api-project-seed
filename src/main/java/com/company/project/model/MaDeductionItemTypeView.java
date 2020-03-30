package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ma_deduction_item_type_view")
public class MaDeductionItemTypeView {
    @Id
    private String unid;

    /**
     * 设备唯一标识
     */
    @Column(name = "facility_unid")
    private String facilityUnid;

    /**
     * 事件类型
     */
    @Column(name = "event_type")
    private String eventType;

    /**
     * 所属单位
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 扣分类型
     */
    @Column(name = "mark_type_unid")
    private String markTypeUnid;

    /**
     * 扣分值
     */
    @Column(name = "mark_value")
    private Double markValue;

    /**
     * 报警等级
     */
    private Integer level;

    /**
     * 事件发生时间
     */
    @Column(name = "system_dtime")
    private Date systemDtime;

    /**
     * 消息来源
     */
    @Column(name = "message_source")
    private Integer messageSource;

    /**
     * 评分类型名称
     */
    private String name;

    /**
     * 最大分值
     */
    @Column(name = "max_mark")
    private Double maxMark;

    @Column(name = "domain_name")
    private String domainName;

    @Column(name = "LEFT_INX")
    private Long leftInx;

    @Column(name = "RIGHT_INX")
    private Long rightInx;

    /**
     * 名称
     */
    @Column(name = "aliasName")
    private String aliasname;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

    @Column(name = "LOCATION")
    private String location;

    /**
     * @return unid
     */
    public String getUnid() {
        return unid;
    }

    /**
     * @param unid
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取设备唯一标识
     *
     * @return facility_unid - 设备唯一标识
     */
    public String getFacilityUnid() {
        return facilityUnid;
    }

    /**
     * 设置设备唯一标识
     *
     * @param facilityUnid 设备唯一标识
     */
    public void setFacilityUnid(String facilityUnid) {
        this.facilityUnid = facilityUnid;
    }

    /**
     * 获取事件类型
     *
     * @return event_type - 事件类型
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * 设置事件类型
     *
     * @param eventType 事件类型
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * 获取所属单位
     *
     * @return domain_unid - 所属单位
     */
    public String getDomainUnid() {
        return domainUnid;
    }

    /**
     * 设置所属单位
     *
     * @param domainUnid 所属单位
     */
    public void setDomainUnid(String domainUnid) {
        this.domainUnid = domainUnid;
    }

    /**
     * 获取扣分类型
     *
     * @return mark_type_unid - 扣分类型
     */
    public String getMarkTypeUnid() {
        return markTypeUnid;
    }

    /**
     * 设置扣分类型
     *
     * @param markTypeUnid 扣分类型
     */
    public void setMarkTypeUnid(String markTypeUnid) {
        this.markTypeUnid = markTypeUnid;
    }

    /**
     * 获取扣分值
     *
     * @return mark_value - 扣分值
     */
    public Double getMarkValue() {
        return markValue;
    }

    /**
     * 设置扣分值
     *
     * @param markValue 扣分值
     */
    public void setMarkValue(Double markValue) {
        this.markValue = markValue;
    }

    /**
     * 获取报警等级
     *
     * @return level - 报警等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置报警等级
     *
     * @param level 报警等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取事件发生时间
     *
     * @return system_dtime - 事件发生时间
     */
    public Date getSystemDtime() {
        return systemDtime;
    }

    /**
     * 设置事件发生时间
     *
     * @param systemDtime 事件发生时间
     */
    public void setSystemDtime(Date systemDtime) {
        this.systemDtime = systemDtime;
    }

    /**
     * 获取消息来源
     *
     * @return message_source - 消息来源
     */
    public Integer getMessageSource() {
        return messageSource;
    }

    /**
     * 设置消息来源
     *
     * @param messageSource 消息来源
     */
    public void setMessageSource(Integer messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * 获取评分类型名称
     *
     * @return name - 评分类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置评分类型名称
     *
     * @param name 评分类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取最大分值
     *
     * @return max_mark - 最大分值
     */
    public Double getMaxMark() {
        return maxMark;
    }

    /**
     * 设置最大分值
     *
     * @param maxMark 最大分值
     */
    public void setMaxMark(Double maxMark) {
        this.maxMark = maxMark;
    }

    /**
     * @return domain_name
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * @param domainName
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return LEFT_INX
     */
    public Long getLeftInx() {
        return leftInx;
    }

    /**
     * @param leftInx
     */
    public void setLeftInx(Long leftInx) {
        this.leftInx = leftInx;
    }

    /**
     * @return RIGHT_INX
     */
    public Long getRightInx() {
        return rightInx;
    }

    /**
     * @param rightInx
     */
    public void setRightInx(Long rightInx) {
        this.rightInx = rightInx;
    }

    /**
     * 获取名称
     *
     * @return aliasName - 名称
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * 设置名称
     *
     * @param aliasname 名称
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    /**
     * @return FACILITY_NAME
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * @param facilityName
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    /**
     * @return LOCATION
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
}