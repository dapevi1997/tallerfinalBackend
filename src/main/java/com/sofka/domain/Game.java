package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "game")
public class Game implements Serializable {
    /**
     * Configurar el id de las filas.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Referencia del id de la tabla.
     */
    @Column(name = "gam_id")
    private Long id;
    /**
     * Referencia del campo con_name de la tabla.
     */
    @Column(name = "gam_finished")
    private String finished;
    /**
     * Referencia del campo con_number de la tabla.
     */
    @Column(name = "gam_winner_email")
    private String email;
    /**
     * Referencia del campo con_email de la tabla.
     */
    @Column(name = "lobby_lob_id")
    private int lobbyId;
}
