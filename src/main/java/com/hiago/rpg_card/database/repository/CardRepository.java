package com.hiago.rpg_card.database.repository;

import com.hiago.rpg_card.database.model.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {
}
