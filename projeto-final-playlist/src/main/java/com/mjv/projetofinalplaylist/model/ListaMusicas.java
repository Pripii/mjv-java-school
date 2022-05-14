package com.mjv.projetofinalplaylist.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ListaMusicas")

public class ListaMusicas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idListaMusicas;
    @OneToMany //mostrando ao jpa o relacionamento entre entidades, nesse caso, um para muitos
    private List<Musica> musicas;

}
