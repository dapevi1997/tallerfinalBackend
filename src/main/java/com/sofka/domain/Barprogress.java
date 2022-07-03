package com.sofka.domain;

import lombok.Data;
import  javax.persistence.Entity;
import  javax.persistence.Table;
import  javax.persistence.Column;
import  javax.persistence.Id;
import  javax.persistence.GeneratedValue;
import  javax.persistence.GenerationType;
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
@Table(name = "barprogress"  )
public class Barprogress implements Serializable {
    /**
     * Configurar el id de las filas.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Referencia del id de la tabla.
     */
    @Column(name = "bar_id")
    private Long id;
    /**
     * Referencia del campo gam_finished de la tabla.
     */
    @Column(name = "bar_var")
    private int var;
    /**
     * Referencia del campo gam_finished de la tabla.
     */
    @Column(name = "lob_id")
    private int idLobby;
}
