package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;

@Entity
@Table(name = "playlist")

public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPlaylist;
    private String nomePlaylist;

    @OneToOne //mostrando ao jpa o relacionamento entre entidades, nesse caso, um para um
    private ListaMusicas lista;

    public Integer getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Integer idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public ListaMusicas getLista() {
        return lista;
    }

    public void setLista(ListaMusicas lista) {
        this.lista = lista;
    }
}
