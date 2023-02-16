package com.mmorpg.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Log {
    @Id
    private Long id;
    @OneToOne
    private Account accountId;
    private LocalDateTime dateTime;
}
