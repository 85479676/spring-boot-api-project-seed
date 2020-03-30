package com.company.project.model;

import javax.xml.bind.annotation.XmlAttribute;

public class MetadataType implements FiremenConstants {

    @XmlAttribute(name = "channel")
    private String channel;


    private int id;


    private String key;


    private String name;


    private String tag;


    public String getChannel() {
        return channel;
    }


    public int getId() {
        return id;
    }


    public String getKey() {
        return key;
    }


    public String getName() {
        return name;
    }


        public String getTag() {
        return tag;
    }


    public void setChannel(String channel) {
        this.channel = channel;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setKey(String key) {
        this.key = key;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setTag(String tag) {
        this.tag = tag;
    }
}
