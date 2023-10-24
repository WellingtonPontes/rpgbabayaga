package com.rpg.baba.yaga.rpgbabayaga.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "tb_habilidade")
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    @Column(columnDefinition = "TEXT")
    private String descricao;

    @ManyToMany(mappedBy = "habilidades")
    private Set<Personagem> personagem = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Personagem> getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Set<Personagem> personagem) {
        this.personagem = personagem;
    }
}
