package com.zimttech.healthy.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.sql.DataSource;
import javax.inject.Named;
@Configuration
@EnableJpaRepositories("com.zimttech.healthy")
@EnableTransactionManagement
public class DatasourceConfig {

    public static final String HEALTHY_JDBC_TEMPLATE="healthyDatasource";
    public static final String PRIMARY_DATASOURCE="primaryDatasource";
    @Bean(name = PRIMARY_DATASOURCE)
    @Primary
    public DataSource getDataSource(Environment environment) {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty("spring.datasource.jdbc.driverClassName"));
        dataSourceBuilder.url(environment.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getProperty("spring.datasource.username"));
        dataSourceBuilder.password(environment.getProperty("spring.datasource.password"));
        return dataSourceBuilder.build();
    }

    @Primary
    @Bean(name = HEALTHY_JDBC_TEMPLATE)
    public NamedParameterJdbcTemplate healthyJdbcTemplate(@Named(PRIMARY_DATASOURCE) DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }
}
