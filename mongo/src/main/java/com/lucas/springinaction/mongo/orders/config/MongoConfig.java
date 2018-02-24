package com.lucas.springinaction.mongo.orders.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.lucas.springinaction.mongo.orders.db")
public class MongoConfig extends AbstractMongoConfiguration {
    @Override
    public MongoClient mongoClient() {
        return new MongoClient();
    }

    @Override
    protected String getDatabaseName() {
        return "OrderDB";
    }
}
