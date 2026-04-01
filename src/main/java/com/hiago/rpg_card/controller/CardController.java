package com.hiago.rpg_card.controller;

import com.hiago.rpg_card.database.dto.request.CardRequest;
import com.hiago.rpg_card.database.dto.response.CardResponse;
import com.hiago.rpg_card.database.dto.response.PageResponse;
import com.hiago.rpg_card.mapper.CardMapper;
import com.hiago.rpg_card.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/cards")
public class CardController {


    public final CardService cardService;
    public final CardMapper cardMapper;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public PageResponse<CardResponse> list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        return cardService.findAll(page, size);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CardResponse insert(@RequestBody CardRequest cardRequest){
        return cardService.create(cardRequest);

    }
}
