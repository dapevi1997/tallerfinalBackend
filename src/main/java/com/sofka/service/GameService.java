package com.sofka.service;

import com.sofka.dao.GameDao;

import com.sofka.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Clase para configurar los servicios para el juego.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class GameService implements IGameService {
    /**
     * Inyección de la clase GameDao.
     */
    @Autowired
    private GameDao gameDao;

    /**
     * Servicio para obtener la lista de juegos guardados en la base de datos.
     * @return Juegos guardados.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Game> list() {

        return (List<Game>) gameDao.findAll();
    }

    /**
     * Servicio para guardar un juego.
     * @param game Juego a guardar.
     * @return Juego guardado.
     */
    @Override
    @Transactional
    public Game save(Game game) {

        return gameDao.save(game);
    }
}
