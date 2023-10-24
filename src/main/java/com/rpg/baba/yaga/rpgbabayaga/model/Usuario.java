package com.rpg.baba.yaga.rpgbabayaga.model;


import java.util.Set;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;
    private String senha;

    @OneToMany(mappedBy = "usuario") // Mapeie o relacionamento pelo nome da propriedade em 'Personagem'
    private Set<Personagem> personagens;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
