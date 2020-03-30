package com.company.project.redis;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class PropertyResources {
    private static final PropertyResources instance = new PropertyResources();
    private HashMap<String, String> properties = new HashMap();

    public static PropertyResources getInstance() {
        return instance;
    }

    public HashMap<String, String> getProperties() {
        return this.properties;
    }

    public void reLoadProperty() {
        Properties prop = new Properties();

        try {
            String path = (new File(".")).getCanonicalPath() + "/config/application-dev.properties";
            InputStream in = new BufferedInputStream(new FileInputStream(path));
            prop.load(in);
            Iterator it = prop.stringPropertyNames().iterator();

            while (it.hasNext()) {
                String key = (String) it.next();
                this.properties.put(key, prop.getProperty(key).trim());
            }

            in.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public PropertyResources() {
        this.reLoadProperty();
    }

    public static void main(String[] args) {
        getInstance();
    }
}
