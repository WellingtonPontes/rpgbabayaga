package com.rpg.baba.yaga.rpgbabayaga.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tb_tributo")
public class Tributo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "personagem_id")
    private Personagem personagem;

    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int carisma;
    private int percepcao;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Personagem getPersonagem() {
        return personagem;
    }
    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getDestreza() {
        return destreza;
    }
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }
    public int getConstituicao() {
        return constituicao;
    }
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public int getPercepcao() {
        return percepcao;
    }
    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }
    
}
