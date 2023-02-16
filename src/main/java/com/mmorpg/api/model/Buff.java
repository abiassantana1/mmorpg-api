package com.mmorpg.api.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Buff {
    @Id
    private Long id;
    @Embedded
    private Status status;
}
