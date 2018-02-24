package com.lucas.springinaction.neo4j.orders.config;

import org.neo4j.driver.v1.GraphDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.repository.config.Neo4jRepositoryConfigurationExtension;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "com.lucas.springinaction.neo4j.orders.db")
public class Neo4jConfig extends Neo4jRepositoryConfigurationExtension{
    public Neo4jConfig() {
    }

    @Bean
    public GraphDatabase graphDatabase() {
        return new GraphDatabase();
    }
}
