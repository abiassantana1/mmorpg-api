package com.mmorpg.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class StacableItem implements Item{
    private String name;
    private String Type;
    //private  Requirement requirements;

}
