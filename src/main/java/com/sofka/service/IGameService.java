package com.sofka.service;

import com.sofka.domain.Game;
import com.sofka.domain.Gamer;

import java.util.List;

public interface IGameService {
    /**
     * Método para listar los contactos guardados.
     * @return Lista de contactos.
     */
    List<Game> list();
    /**
     * Método para guardar un contacto.
     * @param game Contacto a guardar.
     * @return Contacto guardado.
     */
    Game save(Game game);
}
