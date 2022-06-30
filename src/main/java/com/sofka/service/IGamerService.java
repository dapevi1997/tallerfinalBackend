package com.sofka.service;

import com.sofka.domain.Gamer;
import com.sofka.domain.Lobby;

import java.util.List;

public interface IGamerService {
    /**
     * Método para listar los contactos guardados.
     * @return Lista de contactos.
     */
    List<Gamer> list();
    /**
     * Método para guardar un contacto.
     * @param gamer Contacto a guardar.
     * @return Contacto guardado.
     */
    Gamer save(Gamer gamer);
}
