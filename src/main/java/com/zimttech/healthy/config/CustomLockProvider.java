package com.zimttech.healthy.config;

import net.javacrumbs.shedlock.core.LockConfiguration;
import net.javacrumbs.shedlock.core.LockProvider;
import net.javacrumbs.shedlock.core.SimpleLock;
import net.javacrumbs.shedlock.provider.jdbctemplate.JdbcTemplateLockProvider;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Optional;

public class CustomLockProvider implements LockProvider {

    private final JdbcTemplateLockProvider delegate;

    public CustomLockProvider(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        this.delegate = new JdbcTemplateLockProvider(jdbcTemplate);
    }
    @Override
    public Optional<SimpleLock> lock(LockConfiguration lockConfiguration) {
        return delegate.lock(lockConfiguration);
    }
}
