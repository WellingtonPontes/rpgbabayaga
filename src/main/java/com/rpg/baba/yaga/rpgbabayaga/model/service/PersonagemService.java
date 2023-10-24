package com.rpg.baba.yaga.rpgbabayaga.model.service;

import java.util.List;

import com.rpg.baba.yaga.rpgbabayaga.model.Personagem;

public interface PersonagemService {

    Personagem findById(long id);
    List<Personagem> findAll();
    Personagem crete(Personagem personagemCreate);
    Personagem update(long id, Personagem personagemUpdate);
    void delete(long id);
}
