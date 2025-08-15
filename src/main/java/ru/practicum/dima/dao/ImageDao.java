package ru.practicum.dima.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.dima.model.Image;

public interface ImageDao extends JpaRepository<Image, Long> {
}
