package com.sofka.service;

import com.sofka.domain.Barprogress;
import com.sofka.domain.Gamer;

import java.util.Optional;

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
     * Método para guardar un jugador.
     * @param barprogress Jugador a guardar.
     * @return Jugador guardado.
     */
    Barprogress save(Barprogress barprogress);

}
