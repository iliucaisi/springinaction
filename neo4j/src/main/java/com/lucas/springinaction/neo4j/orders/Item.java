package com.lucas.springinaction.neo4j.orders;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Getter
@Setter
@NodeEntity
public class Item {
    @Id
    private Long id;
    private Order order;
    private String product;
    private double price;
    private int quantity;
}
