package com.hiago.rpg_card.service;

import com.hiago.rpg_card.database.dto.request.CardRequest;
import com.hiago.rpg_card.database.dto.response.CardResponse;
import com.hiago.rpg_card.database.dto.response.PageResponse;
import com.hiago.rpg_card.database.model.CardEntity;
import com.hiago.rpg_card.database.repository.CardRepository;
import com.hiago.rpg_card.mapper.CardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository repository;
    private final CardMapper mapper;

    public CardResponse create(CardRequest request){
        var entity = mapper.toEntity(request);
        var saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    public PageResponse<CardResponse> findAll(int page, int size) {

        Page<CardEntity> result =
                repository.findAll(PageRequest.of(page, size));

        List<CardResponse> content = result.getContent()
                .stream()
                .map(mapper::toResponse)
                .toList();

        return new PageResponse<>(
                content,
                result.getNumber(),
                result.getSize(),
                result.getTotalElements(),
                result.getTotalPages()
        );
    }
}