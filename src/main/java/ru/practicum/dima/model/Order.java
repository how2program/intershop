package ru.practicum.dima.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
    Long id;
    List<Item> items;
    LocalDateTime placedAt;
    BigDecimal totalPrice;
}
