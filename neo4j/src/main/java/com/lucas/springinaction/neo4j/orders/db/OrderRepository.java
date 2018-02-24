package com.lucas.springinaction.neo4j.orders.db;

import com.lucas.springinaction.neo4j.orders.Order;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
public interface OrderRepository {
    List<Order> findByCustomer(String customer);
    List<Order> findByCustomerLike(String customer);
    List<Order> findByCustomerAndType(String customer, String type);
    List<Order> getByType(String type);
//    @Query("{customer:'Chuck Wagon'}")
    List<Order> findChucksOrders();
}
