package com.sofka.service;

import com.sofka.domain.Gamer;
import java.util.List;

/**
 * Interface para estructuras del servicio para jugadores.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface IGamerService {
    /**
     * Método para listar los jugadores guardados.
     * @return Lista de jugadores.
     */
    List<Gamer> list();
    /**
     * Método para guardar un jugador.
     * @param gamer Jugador a guardar.
     * @return Jugador guardado.
     */
    Gamer save(Gamer gamer);
}
