package com.company.project.model;

import javax.persistence.*;

@Table(name = "ma_mark_type")
public class MaMarkType {
    @Id
    private String unid;

    /**
     * 评分类型名称
     */
    private String name;

    /**
     * 最大分值
     */
    @Column(name = "max_mark")
    private Double maxMark;

    /**
     * 所属单位
     */
    @Column(name = "domain_unid")
    private String domainUnid;

    /**
     * 大类分类
     */
    private Integer type;

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
     * 获取大类分类
     *
     * @return type - 大类分类
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置大类分类
     *
     * @param type 大类分类
     */
    public void setType(Integer type) {
        this.type = type;
    }
}