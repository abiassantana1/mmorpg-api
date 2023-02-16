package com.mmorpg.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int level;
    private Status status;
    private Inventory inventory;
    private Skill skill;
    private Buff buff;
    private Equip equips;
    private int positionx;
    private int positiony;
    private int positionz;
}
