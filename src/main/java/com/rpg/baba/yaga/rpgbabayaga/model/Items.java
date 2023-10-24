package com.rpg.baba.yaga.rpgbabayaga.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_items")
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "personagem_id") // Nome da coluna alterado
    private Personagem personagem;

    private String nome;
    @Column(columnDefinition = "TEXT")
    private String desc_descricao;
    private Double preco;



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
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDesc_descricao() {
        return desc_descricao;
    }
    public void setDesc_descricao(String desc_descricao) {
        this.desc_descricao = desc_descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }


}
