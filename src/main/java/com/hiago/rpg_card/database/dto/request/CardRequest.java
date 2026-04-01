package com.hiago.rpg_card.database.dto.request;

import com.hiago.rpg_card.database.model.CardCategory;

public record CardRequest(

        String title,
        Integer manaCost,
        CardCategory category,
        String description,
        String skill,
        Integer attack,
        Integer defense
) {
}
