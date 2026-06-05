package com.sesac.ai_backend.repository;

import com.sesac.ai_backend.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNameContaining(String keyword);
}
