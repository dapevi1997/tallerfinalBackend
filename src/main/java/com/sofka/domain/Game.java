package com.sofka.domain;

import lombok.Data;
import  javax.persistence.Entity;
import  javax.persistence.Table;
import  javax.persistence.Id;
import  javax.persistence.GeneratedValue;
import  javax.persistence.GenerationType;
import  javax.persistence.Column;
import java.io.Serializable;

/**
 * Clase referenciar una tabla SQL a objetos.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
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
     * Referencia del campo gam_finished de la tabla.
     */
    @Column(name = "gam_finished")
    private String finished;
    /**
     * Referencia del campo gam_winner_email de la tabla.
     */
    @Column(name = "gam_winner_email")
    private String email;
    /**
     * Referencia del campo lobby_lob_id de la tabla.
     */
    @Column(name = "lobby_lob_id")
    private int lobbyId;
}
