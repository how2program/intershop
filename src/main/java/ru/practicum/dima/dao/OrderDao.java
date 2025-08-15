package ru.practicum.dima.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.dima.model.Order;

public interface OrderDao extends JpaRepository<Order, Long> {
}
