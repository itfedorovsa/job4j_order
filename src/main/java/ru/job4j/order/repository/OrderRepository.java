package ru.job4j.order.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.order.model.Order;

import java.util.List;

/**
 * Order Spring Data repository interface
 *
 * @author itfedorovsa (itfedorovsa@gmail.com)
 * @version 1.0
 * @since 06.05.23
 */
public interface OrderRepository extends CrudRepository<Order, Integer> {

    List<Order> findAll();

}
