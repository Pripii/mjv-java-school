package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;

@Entity
@Table(name = "musica")

public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMusica;
    private String Titulo;
    private Double Duração;
    private String Autores;
    private GeneroMusical genero;
}
