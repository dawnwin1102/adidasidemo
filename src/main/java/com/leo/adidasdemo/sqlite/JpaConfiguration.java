//package com.leo.adidasdemo.sqlite;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.Resource;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import java.util.Map;
//
///**
// * @author wuweifeng wrote on 2018/3/2.
// */
//@Configuration
//@EnableJpaRepositories
//public class JpaConfiguration {
//    @Resource
//    private JpaProperties jpaProperties;
//
//    @Autowired
//    @Bean
//    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean(@Qualifier(value =
//            "EmbeddeddataSource") DataSource dataSource, EntityManagerFactoryBuilder builder) {
//        return builder.dataSource(dataSource)
//                .packages("com.mindata.blockchain.core.model")
//                .properties(getVendorProperties(dataSource))
//                .build();
//    }
//
//    private Map<String, String> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
//
//}
