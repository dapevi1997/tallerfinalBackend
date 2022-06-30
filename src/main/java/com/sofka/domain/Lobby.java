package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Clase refernciar una tabla SQL a objetos.
 *
 * @version 1.0.0 2022-06-26
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Data
@Entity
@Table(name = "lobby")
public class Lobby implements Serializable {
    /**
     * Configurar el id de las filas.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Referencia del id de la tabla.
     */
    @Column(name = "lob_id")
    private Long id;
    /**
     * Referencia del campo con_name de la tabla.
     */
    @Column(name = "lob_actived")
    private String actived;


}
