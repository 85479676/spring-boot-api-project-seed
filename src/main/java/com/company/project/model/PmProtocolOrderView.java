package com.company.project.model;

import javax.persistence.*;

@Table(name = "pm_protocol_order_view")
public class PmProtocolOrderView {
    /**
     * 协议命令
     */
    private String orders;

    /**
     * 协议名名称
     */
    private String name;

    /**
     * 协议命令唯一标识
     */
    @Id
    private String unid;

    /**
     * 协议命令对应的协议
     */
    @Column(name = "protocol_unid")
    private String protocolUnid;

    /**
     * 协议命令回复内容
     */
    @Column(name = "answer_order")
    private String answerOrder;

    /**
     * 删除标识
     */
    @Column(name = "flag_del")
    private Boolean flagDel;

    /**
     * 报警标识，默认不报警，0正常数据，非零异常数据
     */
    @Column(name = "is_alarm")
    private Short isAlarm;

    /**
     * 协议名称
     */
    @Column(name = "protocol_name")
    private String protocolName;

    /**
     * 获取协议命令
     *
     * @return orders - 协议命令
     */
    public String getOrders() {
        return orders;
    }

    /**
     * 设置协议命令
     *
     * @param orders 协议命令
     */
    public void setOrders(String orders) {
        this.orders = orders;
    }

    /**
     * 获取协议名名称
     *
     * @return name - 协议名名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置协议名名称
     *
     * @param name 协议名名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取协议命令唯一标识
     *
     * @return unid - 协议命令唯一标识
     */
    public String getUnid() {
        return unid;
    }

    /**
     * 设置协议命令唯一标识
     *
     * @param unid 协议命令唯一标识
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }

    /**
     * 获取协议命令对应的协议
     *
     * @return protocol_unid - 协议命令对应的协议
     */
    public String getProtocolUnid() {
        return protocolUnid;
    }

    /**
     * 设置协议命令对应的协议
     *
     * @param protocolUnid 协议命令对应的协议
     */
    public void setProtocolUnid(String protocolUnid) {
        this.protocolUnid = protocolUnid;
    }

    /**
     * 获取协议命令回复内容
     *
     * @return answer_order - 协议命令回复内容
     */
    public String getAnswerOrder() {
        return answerOrder;
    }

    /**
     * 设置协议命令回复内容
     *
     * @param answerOrder 协议命令回复内容
     */
    public void setAnswerOrder(String answerOrder) {
        this.answerOrder = answerOrder;
    }

    /**
     * 获取删除标识
     *
     * @return flag_del - 删除标识
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * 设置删除标识
     *
     * @param flagDel 删除标识
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }

    /**
     * 获取报警标识，默认不报警，0正常数据，非零异常数据
     *
     * @return is_alarm - 报警标识，默认不报警，0正常数据，非零异常数据
     */
    public Short getIsAlarm() {
        return isAlarm;
    }

    /**
     * 设置报警标识，默认不报警，0正常数据，非零异常数据
     *
     * @param isAlarm 报警标识，默认不报警，0正常数据，非零异常数据
     */
    public void setIsAlarm(Short isAlarm) {
        this.isAlarm = isAlarm;
    }

    /**
     * 获取协议名称
     *
     * @return protocol_name - 协议名称
     */
    public String getProtocolName() {
        return protocolName;
    }

    /**
     * 设置协议名称
     *
     * @param protocolName 协议名称
     */
    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }
}