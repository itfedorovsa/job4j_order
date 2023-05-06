package ru.job4j.order.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.job4j.order.model.Order;
import ru.job4j.order.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

/**
 * Order service layer
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 06.05.23
 */
@Service
@AllArgsConstructor
public class SimpleOrderService implements OrderService {

    private final OrderRepository store;

    @Override
    public Order saveOrder(Order order) {
        store.save(order);
        return order;
    }

    @Override
    public void updateOrder(Order order) {
        store.save(order);
    }

    @Override
    public List<Order> findAllOrders() {
        return store.findAll();
    }

    @Override
    public Optional<Order> findOrderById(int orderId) {
        return store.findById(orderId);
    }

    @Override
    public void deleteOrder(Order order) {
        store.delete(order);
    }

}
