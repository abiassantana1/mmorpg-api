package com.mmorpg.api.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Status {
    private int strength;
    private int dexterity;
    private int intelligence;
}
