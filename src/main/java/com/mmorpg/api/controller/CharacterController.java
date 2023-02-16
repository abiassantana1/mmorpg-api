package com.mmorpg.api.controller;

import com.mmorpg.api.model.Character;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/character")
    public List<Character> listar(){
        return manager.createNamedQuery("from Character", Character.class)
                .getResultList();
    }
}
