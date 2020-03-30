package com.company.project.model; /**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2007-2019 Ttron Kidman. All rights reserved.
 */

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import java.util.LinkedList;
import java.util.List;

import static com.company.project.util.Format.formatAmount;


/**
 * @MR006 2019年5月22日
 */

public class Proportion implements FiremenConstants
{
    private static final long serialVersionUID = 8641602081304780962L;

    @XmlAttribute(name = KEY_AMOUNT)
    private double amount;

//    @XmlAttribute(name = ENTITY_KEY)
    private String key;

//    @XmlAttribute(name = KEY_NAME)
    private String name;

    @XmlAttribute(name = KEY_PERCENT)
    private double percent;

    @XmlTransient
    protected List<Proportion> subProportions = new LinkedList<>();

    @XmlAttribute(name = KEY_AMOUNT_TOTAL)
    private double totalAmount;

    private double weight;


    public void addProportion(Proportion proportion)
    {
        subProportions.add( proportion );
    }


    @XmlTransient
    public double getAmount()
    {
        return amount;
    }


    /**
     * @return the key
     */
    @XmlTransient
    public String getKey()
    {
        return key;
    }


    @XmlTransient
    public String getName()
    {
        return name;
    }


    @XmlTransient
    public double getPercent()
    {
        return percent;
    }


    @XmlElements({ @XmlElement(name = ENTITY_PROPORTION) })
    public List<Proportion> getSubProportions()
    {
        return subProportions;
    }


    @XmlTransient
    public double getTotalAmount()
    {
        return totalAmount;
    }


    @XmlTransient
    public double getWeight()
    {
        return weight;
    }


    public void setAmount(double amount)
    {
        this.amount = amount;
    }


    /**
     * @param key the key to set
     */
    public void setKey(String key)
    {
        this.key = key;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public void setPercent(double percent)
    {
        this.percent = formatAmount( percent );
    }


    public void setTotalAmount(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }


    public void setWeight(double weight)
    {
        this.weight = weight;
    }
}