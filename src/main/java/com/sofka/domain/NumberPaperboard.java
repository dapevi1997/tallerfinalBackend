package com.sofka.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "numberpaperboard")
public class NumberPaperboard implements Serializable {
    /**
     * Configurar el id de las filas.
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Referencia del id de la tabla.
     */
    @Column(name = "npa_id")
    private Long id;
    /**
     * Referencia del campo con_name de la tabla.
     */
    @Column(name = "npa_number")
    private String number;
    /**
     * Referencia del campo con_number de la tabla.
     */
    @Column(name = "gamer_gam_id")
    private int gamerId;
}
