package com.closset.study.flyway

import com.zaxxer.hikari.HikariDataSource
import org.h2.tools.Server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@SpringBootApplication
class FlywayApplication

fun main(args: Array<String>) {
    runApplication<FlywayApplication>(*args)
}
