package com.sofka.service;

import com.sofka.domain.Lobby;

import java.util.List;

/**
 * Clase para configurar los servicios.
 *
 * @version 1.0.0 2022-06-26
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface ILobbyService {
    /**
     * Método para listar los contactos guardados.
     * @return Lista de contactos.
     */
    List<Lobby> list();
    /**
     * Método para guardar un contacto.
     * @param lobby Contacto a guardar.
     * @return Contacto guardado.
     */
    Lobby save(Lobby lobby);


}
