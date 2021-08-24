package com.example.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.Naming;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration("databaseTwoConfig")
@PropertySource("classpath:database_two_config.properties")
@ConfigurationProperties("database.two")
public class DatabaseTwoConfig extends HikariConfig implements Config {

  private DataSource dataSource;

  @PostConstruct
  public void postConstruct() {
    this.dataSource = new TransactionAwareDataSourceProxy(new HikariDataSource(this));
  }

  @Override
  public Dialect getDialect() {
    return new PostgresDialect();
  }

  @Override
  public DataSource getDataSource() {
    return this.dataSource;
  }

  @Override
  public Naming getNaming() {
    return Naming.SNAKE_LOWER_CASE;
  }

}