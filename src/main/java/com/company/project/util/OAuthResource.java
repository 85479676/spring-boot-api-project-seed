package com.company.project.util;


import javax.servlet.ServletContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class OAuthResource {


    private static final String KEY_BUNDLE_DATASOURCE = null;
    //    private static final String KEY_BUNDLE_DATASOURCE = null;
    protected ServletContext servletContext;


    protected Connection getConnection() {
        DataSource dataSource = (DataSource) servletContext.getAttribute(KEY_BUNDLE_DATASOURCE);
        Connection connection = null;
        if (dataSource == null) {
            throw new IllegalStateException("OSGi bundle jdbc pool has not been registered.");
        }

        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.getLocalizedMessage();
        }

        return connection;
    }


}
