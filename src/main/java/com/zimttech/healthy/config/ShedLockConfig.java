package com.zimttech.healthy.config;

import net.javacrumbs.shedlock.core.LockProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

import static com.zimttech.healthy.config.DatasourceConfig.PRIMARY_DATASOURCE;

@Configuration
public class ShedLockConfig {
    @Bean
    public LockProvider lockProvider(@Qualifier(PRIMARY_DATASOURCE) DataSource dataSource) {
        return new CustomLockProvider(dataSource);
    }
}
