package com.company.project.model;

import javax.persistence.*;

@Table(name = "pm_protocol_item_view")
public class PmProtocolItemView {
    /**
     * 协议项唯一标识
     */
    @Id
    private String unid;

    /**
     * 协议项名称
     */
    private String name;

    /**
     * ָ协议项指令唯一标识
     */
    private String orders;

    /**
     * 别名唯一标识
     */
    @Column(name = "alias_unid")
    private String aliasUnid;

    /**
     * 大小端
     */
    @Column(name = "small_and_big")
    private Boolean smallAndBig;

    /**
     * 开始
     */
    private Integer start;

    /**
     * 长度
     */
    private Integer length;

    /**
     * 数据类型
     */
    @Column(name = "data_type")
    private Short dataType;

    /**
     * 是否参与解析
     */
    @Column(name = "is_content")
    private Boolean isContent;

    /**
     * 比例
     */
    private Double proportion;

    /**
     * 链接指令
     */
    @Column(name = "connect_order")
    private String connectOrder;

    /**
     * 链接序号
     */
    @Column(name = "connect_num")
    private Short connectNum;

    /**
     * 序号
     */
    private Short num;

    /**
     * 协议项编码
     */
    private String code;

    /**
     * 是否展示到页面
     */
    @Column(name = "is_show")
    private Boolean isShow;

    /**
     * 是否删除标识
     */
    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 名称
     */
    @Column(name = "pas_name")
    private String pasName;

    /**
     * 协议名名称
     */
    @Column(name = "por_name")
    private String porName;
    /**
     * 协议名名称
     */
    @Column(name = "pro_name")
    private String proName;

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 获取协议项唯一标识
     *
     * @return unid - 协议项唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置协议项唯一标识
     *
     * @param unid 协议项唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取协议项名称
     *
     * @return name - 协议项名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置协议项名称
     *
     * @param name 协议项名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取ָ协议项指令唯一标识
     *
     * @return orders - ָ协议项指令唯一标识
     */
    public String getOrders() {
        return orders;
    }

    /**
     * 设置ָ协议项指令唯一标识
     *
     * @param orders ָ协议项指令唯一标识
     */
    public void setOrders(String orders) {
        this.orders = orders;
    }

    /**
     * 获取别名唯一标识
     *
     * @return alias_unid - 别名唯一标识
     */
    public String getAliasUnid() {
        return aliasUnid;
    }

    /**
     * 设置别名唯一标识
     *
     * @param aliasUnid 别名唯一标识
     */
    public void setAliasUnid(String aliasUnid) {
        this.aliasUnid = aliasUnid;
    }

    /**
     * 获取大小端
     *
     * @return small_and_big - 大小端
     */
    public Boolean getSmallAndBig() {
        return smallAndBig;
    }

    /**
     * 设置大小端
     *
     * @param smallAndBig 大小端
     */
    public void setSmallAndBig(Boolean smallAndBig) {
        this.smallAndBig = smallAndBig;
    }

    /**
     * 获取开始
     *
     * @return start - 开始
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置开始
     *
     * @param start 开始
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获取长度
     *
     * @return length - 长度
     */
    public Integer getLength() {
        return length;
    }

    /**
     * 设置长度
     *
     * @param length 长度
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * 获取数据类型
     *
     * @return data_type - 数据类型
     */
    public Short getDataType() {
        return dataType;
    }

    /**
     * 设置数据类型
     *
     * @param dataType 数据类型
     */
    public void setDataType(Short dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取是否参与解析
     *
     * @return is_content - 是否参与解析
     */
    public Boolean getIsContent() {
        return isContent;
    }

    /**
     * 设置是否参与解析
     *
     * @param isContent 是否参与解析
     */
    public void setIsContent(Boolean isContent) {
        this.isContent = isContent;
    }

    /**
     * 获取比例
     *
     * @return proportion - 比例
     */
    public Double getProportion() {
        return proportion;
    }

    /**
     * 设置比例
     *
     * @param proportion 比例
     */
    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    /**
     * 获取链接指令
     *
     * @return connect_order - 链接指令
     */
    public String getConnectOrder() {
        return connectOrder;
    }

    /**
     * 设置链接指令
     *
     * @param connectOrder 链接指令
     */
    public void setConnectOrder(String connectOrder) {
        this.connectOrder = connectOrder;
    }

    /**
     * 获取链接序号
     *
     * @return connect_num - 链接序号
     */
    public Short getConnectNum() {
        return connectNum;
    }

    /**
     * 设置链接序号
     *
     * @param connectNum 链接序号
     */
    public void setConnectNum(Short connectNum) {
        this.connectNum = connectNum;
    }

    /**
     * 获取序号
     *
     * @return num - 序号
     */
    public Short getNum() {
        return num;
    }

    /**
     * 设置序号
     *
     * @param num 序号
     */
    public void setNum(Short num) {
        this.num = num;
    }

    /**
     * 获取协议项编码
     *
     * @return code - 协议项编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置协议项编码
     *
     * @param code 协议项编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取是否展示到页面
     *
     * @return is_show - 是否展示到页面
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * 设置是否展示到页面
     *
     * @param isShow 是否展示到页面
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * 获取是否删除标识
     *
     * @return flag_del - 是否删除标识
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * 设置是否删除标识
     *
     * @param flagDel 是否删除标识
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    /**
     * 获取名称
     *
     * @return pas_name - 名称
     */
    public String getPasName() {
        return pasName;
    }

    /**
     * 设置名称
     *
     * @param pasName 名称
     */
    public void setPasName(String pasName) {
        this.pasName = pasName;
    }

    /**
     * 获取协议名名称
     *
     * @return por_name - 协议名名称
     */
    public String getPorName() {
        return porName;
    }

    /**
     * 设置协议名名称
     *
     * @param porName 协议名名称
     */
    public void setPorName(String porName) {
        this.porName = porName;
    }
}