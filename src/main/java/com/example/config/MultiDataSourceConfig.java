package com.example.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 定义一个 MultiDataSourceConfig 类，对两个不同的数据源进行加载
 */
@Configuration
public class MultiDataSourceConfig {
    //必须指明一个为默认的主数据源，使用注解：@Primary。我们以第一个数据源为例，讲解如何将数据源注入到对应的 mapper 中。
    @Primary
    @Bean(name = "oneDataSource")
    @ConfigurationProperties("spring.datasource.druid.one")
    public DataSource dataSourceOne() {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setConnectionProperties("config.decrypt=true;config.decrypt.key=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIbfYkHoyhnRPvfFobZJMWVbPJtTW4vvIo9FF/Mff/m7vZK9I93CBFrSCYtK9mp5XSOe+xEqcugMasnUN2EqAkMCAwEAAQ==");

//        Properties properties = new Properties();
//        properties.put("config.decrypt","true");
//        properties.put("config.decrypt.key","MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIbfYkHoyhnRPvfFobZJMWVbPJtTW4vvIo9FF/Mff/m7vZK9I93CBFrSCYtK9mp5XSOe+xEqcugMasnUN2EqAkMCAwEAAQ==");
//        dataSource.setConnectProperties(properties);
        return dataSource;
    }


    @Bean(name = "twoDataSource")
    @ConfigurationProperties("spring.datasource.druid.two")
    public DataSource dataSourceTwo() {
        DruidDataSource druidDataSource = DruidDataSourceBuilder.create().build();
//        Properties properties = new Properties();
//        properties.put("config.decrypt","true");
        druidDataSource.setConnectionProperties("config.decrypt=true;config.decrypt.key=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIbfYkHoyhnRPvfFobZJMWVbPJtTW4vvIo9FF/Mff/m7vZK9I93CBFrSCYtK9mp5XSOe+xEqcugMasnUN2EqAkMCAwEAAQ==");
//        properties.put("config.decrypt.key","MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIbfYkHoyhnRPvfFobZJMWVbPJtTW4vvIo9FF/Mff/m7vZK9I93CBFrSCYtK9mp5XSOe+xEqcugMasnUN2EqAkMCAwEAAQ==");
//        druidDataSource.setConnectProperties(properties);
        return druidDataSource;
    }
}
