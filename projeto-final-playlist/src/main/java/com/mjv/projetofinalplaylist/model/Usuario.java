package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;

@Entity //minha classe vai ser uma entidade no meu banco de dados, ou seja, uma tabela
@Table(name = "usuario") //colocar o nome na tabela
public class Usuario {

    @Id //serve para o jpa entender que esse atributo é uma Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //é para o Id seguir alguma estratégia de criação automatica do meu Id, ou seja, é um autoincremento
    private Integer idUsuario;

    private String nomeUsuario;
    private String email;

    @OneToMany //mostrando ao jpa o relacionamento entre entidades, nesse caso, um para muitos
    private Playlist playlist;

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }
}
