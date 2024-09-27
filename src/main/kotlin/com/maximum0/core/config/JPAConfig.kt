package com.maximum0.core.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean

@Configuration
class JPAConfig {
    @Bean
    fun transactionManager(entityManagerFactory: LocalContainerEntityManagerFactoryBean): JpaTransactionManager {
        val transactionManager = JpaTransactionManager()
        transactionManager.entityManagerFactory = entityManagerFactory.`object`
        return transactionManager
    }
}