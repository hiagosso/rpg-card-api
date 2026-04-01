package com.hiago.rpg_card.mapper;

import com.hiago.rpg_card.database.dto.request.CardRequest;
import com.hiago.rpg_card.database.dto.response.CardResponse;
import com.hiago.rpg_card.database.model.CardEntity;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {

    public CardEntity toEntity(CardRequest request) {
        return new CardEntity(
                null,
                request.title(),
                request.manaCost(),
                request.category(),
                request.description(),
                request.skill(),
                request.attack(),
                request.defense()
        );
    }

    public CardResponse toResponse(CardEntity card) {
        return new CardResponse(
                card.getId(),
                card.getTitle(),
                card.getManaCost(),
                card.getCategory(),
                card.getDescription(),
                card.getSkill(),
                card.getAttack(),
                card.getDefense()
        );
    }
}