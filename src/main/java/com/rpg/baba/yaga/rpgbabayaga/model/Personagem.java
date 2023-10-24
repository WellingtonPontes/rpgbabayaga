package com.rpg.baba.yaga.rpgbabayaga.model;


import jakarta.persistence.*;
import java.util.Set;
import java.util.Date;




@Entity
@Table(name = "tb_personagem")
public class Personagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private String nome;
    private Double dinheiro;
    private int vida_maxima;
    private int vida_atual;
    private int sanidade;
    private String apelido;
    private String cargo;
    private Date idade;
    private String nascionalidade;

    @Column(columnDefinition = "TEXT")
    private String desc_historia;

    @ManyToMany
    @JoinTable(
        name = "personagem_habilidade",
        joinColumns = @JoinColumn(name = "id_personagem"),
        inverseJoinColumns = @JoinColumn(name = "id_habilidade")
    )

    private Set<Habilidade> habilidades;

    @OneToMany(mappedBy = "personagem")
    private Set<Items> items;

    @OneToOne(mappedBy = "personagem")
    private Tributo tributos;


    public Set<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Set<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public Set<Items> getItems() {
        return items;
    }

    public void setItems(Set<Items> items) {
        this.items = items;
    }

    public Tributo getTributos() {
        return tributos;
    }

    public void setTributos(Tributo tributos) {
        this.tributos = tributos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVida_maxima() {
        return vida_maxima;
    }

    public void setVida_maxima(int vida_maxima) {
        this.vida_maxima = vida_maxima;
    }

    public int getVida_atual() {
        return vida_atual;
    }

    public void setVida_atual(int vida_atual) {
        this.vida_atual = vida_atual;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        this.sanidade = sanidade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getIdade() {
        return idade;
    }

    public void setIdade(Date idade) {
        this.idade = idade;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public String getDesc_historia() {
        return desc_historia;
    }

    public void setDesc_historia(String desc_historia) {
        this.desc_historia = desc_historia;
    }



}
