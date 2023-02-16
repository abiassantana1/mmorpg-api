package com.mmorpg.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Equip implements Item{
    private String name;
    private String type;
   // private Requirement Requirements;
    private int quality;
    private Status status;
   // private Skill skill;
   // private Buff buff;

}
