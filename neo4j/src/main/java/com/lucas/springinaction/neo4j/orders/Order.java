package com.lucas.springinaction.neo4j.orders;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Getter
@Setter
@NodeEntity
public class Order {
    @Id
    private String id;
    private String customer;
    private String type;
    @Relationship(type = "HAS_ITEMS")
    private Set<Item> items = Sets.newLinkedHashSet();
}
