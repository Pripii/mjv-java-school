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
}
