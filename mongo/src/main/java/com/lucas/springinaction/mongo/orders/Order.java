package com.lucas.springinaction.mongo.orders;

import com.google.common.collect.Sets;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Document
public class Order {
    @Id
    private String id;
    @Field("customer")
    private String customer;
    private String type;
    private Collection<Item> items = Sets.newLinkedHashSet();
}
