package com.miguel.springmodule.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "connection")
public class DbConnectionProps {
    @Value(value = "jdbc:mysql://localhost:3306/jbossdatabase")
    private String url;

    @Value(value = "Miguel")
    private String username;

    @Value(value = "qwerty")
    private String password;

    @Value(value = "com.mysql.cj.jdbc.Driver")
    private String driverClassName;

    @Value(value = "java:jboss/datasources/MySqlDS")
    private String jndiName;

    public DbConnectionProps() {
    }

    public DbConnectionProps(String url, String username, String password, String driverClassName, String jndiName) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.driverClassName = driverClassName;
        this.jndiName = jndiName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getJndiName() {
        return jndiName;
    }

    public void setJndiName(String jndiName) {
        this.jndiName = jndiName;
    }
}
