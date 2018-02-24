package com.lucas.springinaction.mongo.orders.db;

import com.lucas.springinaction.mongo.orders.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findByCustomer(String customer);
    List<Order> findByCustomerLike(String customer);
    List<Order> findByCustomerAndType(String customer, String type);
    List<Order> getByType(String type);
    @Query("{customer:'Chuck Wagon'}")
    List<Order> findChucksOrders();
}
