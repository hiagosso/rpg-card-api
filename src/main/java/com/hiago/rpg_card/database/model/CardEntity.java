package com.hiago.rpg_card.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CardEntity {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer manaCost;

    @Column(nullable = false)
    private CardCategory category;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String skill;

    @Column(nullable = false)
    private Integer attack;

    @Column(nullable = false)
    private Integer defense;

}
