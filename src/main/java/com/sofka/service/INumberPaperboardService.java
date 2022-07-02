package com.sofka.service;

import com.sofka.domain.NumberPaperboard;
import java.util.List;

/**
 * Interface para estructuras del servicio para los números del cartón.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface INumberPaperboardService {
    /**
     * Método para listar los números en el cartón guardados.
     * @return Lista de números.
     */
    List<NumberPaperboard> list();
    /**
     * Método para guardar un número en el cartón.
     * @param numberPaperboard Número a guardar.
     * @return Número guardado.
     */
    NumberPaperboard save(NumberPaperboard numberPaperboard);
}
