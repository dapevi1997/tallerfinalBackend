package com.sofka.service;

import com.sofka.domain.Lobby;
import java.util.List;

/**
 * Interface para estructuras del servicio para el lobby.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface ILobbyService {
    /**
     * Método para listar los lobbies guardados.
     * @return Lista de lobbies.
     */
    List<Lobby> list();
    /**
     * Método para guardar un lobby.
     * @param lobby Lobby a guardar.
     * @return Lobby guardado.
     */
    Lobby save(Lobby lobby);


}
