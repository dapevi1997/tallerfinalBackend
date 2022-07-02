package com.sofka.service;

import com.sofka.domain.Game;
import java.util.List;

/**
 * Interface para estructuras del servicio para el juego.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface IGameService {
    /**
     * Método para listar los juegos guardados.
     * @return Lista de juegos.
     */
    List<Game> list();
    /**
     * Método para guardar un juego.
     * @param game Juego a guardar.
     * @return Juego guardado.
     */
    Game save(Game game);
}
