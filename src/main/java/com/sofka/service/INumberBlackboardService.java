package com.sofka.service;

import com.sofka.domain.NumberBlackboard;
import java.util.List;

/**
 * Interface para estructuras del servicio para los números del tablero.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface INumberBlackboardService {
    /**
     * Método para listar los números en el tablero guardados.
     * @return Lista de números.
     */
    List<NumberBlackboard> list();
    /**
     * Método para guardar un número.
     * @param numberBlackboard Número a guardar.
     * @return Número guardado.
     */
    NumberBlackboard save(NumberBlackboard numberBlackboard);
}
