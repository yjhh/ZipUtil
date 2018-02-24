package com.zipHandle;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.DriverManager;

/**
 * create by Yao 2017/12/28 12:10
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class Eureka {

    public static void main(String[] args){
        SpringApplication.run(Eureka.class);
    }

//    @Bean
//    public DataSource setDataSource(){
//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setPassword("123456");
//        dataSource.setPort(3306);
//        dataSource.setUser("root");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
//        dataSource.setCharacterEncoding("UTF-8");
////        DriverManager.getConnection()
//        return dataSource;
//    }

//    @Bean
//    public IRule rule(){
//        //随机数
//        RandomRule rule = new RandomRule();
//        //轮询
////        RoundRobinRule rule = new RoundRobinRule();
//        return rule;
//    }

}
