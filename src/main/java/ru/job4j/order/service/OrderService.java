package ru.job4j.order.service;

import ru.job4j.order.model.Order;

import java.util.List;
import java.util.Optional;

/**
 * Order service interface
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 06.05.23
 */
public interface OrderService {

    Order saveOrder(Order order);

    void updateOrder(Order order);

    List<Order> findAllOrders();

    Optional<Order> findOrderById(int orderId);

    void deleteOrder(Order order);

}
