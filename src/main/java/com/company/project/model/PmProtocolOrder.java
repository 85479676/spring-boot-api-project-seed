package com.company.project.model;

import javax.persistence.*;

@Table(name = "pm_protocol_order")
public class PmProtocolOrder {
    @Id
    @GeneratedValue(generator = "UUID")//自动生成UUID
    private String unid;

    /**
     * ????????
     */
    private String orders;

    /**
     * ????
     */
    private String name;

    /**
     * Э??Ψһ??ʶ
     */
    @Column(name = "protocol_unid")
    private String protocolUnid;

    /**
     * ?ظ?????
     */
    @Column(name = "answer_order")
    private String answerOrder;

    @Column(name = "flag_del")
    private Boolean flagDel;

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
     * 获取????????
     *
     * @return orders - ????????
     */
    public String getOrders() {
        return orders;
    }

    /**
     * 设置????????
     *
     * @param orders ????????
     */
    public void setOrders(String orders) {
        this.orders = orders;
    }

    /**
     * 获取????
     *
     * @return name - ????
     */
    public String getName() {
        return name;
    }

    /**
     * 设置????
     *
     * @param name ????
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取Э??Ψһ??ʶ
     *
     * @return protocol_unid - Э??Ψһ??ʶ
     */
    public String getProtocolUnid() {
        return protocolUnid;
    }

    /**
     * 设置Э??Ψһ??ʶ
     *
     * @param protocolUnid Э??Ψһ??ʶ
     */
    public void setProtocolUnid(String protocolUnid) {
        this.protocolUnid = protocolUnid;
    }

    /**
     * 获取?ظ?????
     *
     * @return answer_order - ?ظ?????
     */
    public String getAnswerOrder() {
        return answerOrder;
    }

    /**
     * 设置?ظ?????
     *
     * @param answerOrder ?ظ?????
     */
    public void setAnswerOrder(String answerOrder) {
        this.answerOrder = answerOrder;
    }

    /**
     * @return flag_del
     */
    public Boolean getFlagDel() {
        return flagDel;
    }

    /**
     * @param flagDel
     */
    public void setFlagDel(Boolean flagDel) {
        this.flagDel = flagDel;
    }
}