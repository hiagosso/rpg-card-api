package com.hiago.rpg_card.database.dto.response;

import com.hiago.rpg_card.database.model.CardCategory;

public record CardResponse(
        Long id,
        String title,
        Integer manaCost,
        CardCategory category,
        String description,
        String skill,
        Integer attack,
        Integer defense
) {
}
