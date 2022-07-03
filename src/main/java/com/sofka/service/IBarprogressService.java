package com.sofka.service;

import com.sofka.domain.Barprogress;


/**
 * Interface para estructurar servicios de la barra de progreso.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface IBarprogressService {
    /**
     * Método para guardar una barra de progreso.
     * @param barprogress Barra de progreso a guardar.
     * @return Barra de progreso guardada.
     */
    Barprogress save(Barprogress barprogress);

}
