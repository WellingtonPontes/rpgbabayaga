package com.rpg.baba.yaga.rpgbabayaga.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpg.baba.yaga.rpgbabayaga.model.Personagem;

public interface PersonagemRepository  extends JpaRepository< Personagem , Long>{
    
}
