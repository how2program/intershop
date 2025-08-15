package ru.practicum.dima.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.dima.model.Item;

public interface ItemDao extends JpaRepository<Item, Long> {
}
