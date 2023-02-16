package com.mmorpg.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {
    private Item item;
    private Long gold;
}
