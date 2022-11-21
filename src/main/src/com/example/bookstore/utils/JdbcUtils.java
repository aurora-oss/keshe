package com.example.bookstore.utils;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {

    private static DruidDataSource dataSource;
    static {
        try {
            Properties properties = new Properties();
            // 读取jdbc.properties属性配置文件
            // 从流中加载数据
            properties.load(JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            // 创建数据库连接池
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * 获取数据库链接池中的链接*/
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /*
    * 关闭链接，放回数据库连接池*/
    public static void close(Connection connection)
    {
        if(connection!= null)
        {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
