package com.sofka.service;

import com.sofka.dao.GameDao;

import com.sofka.domain.Game;
import com.sofka.domain.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService implements IGameService {
    /**
     * Inyección de la clase ContactDao
     */
    @Autowired
    private GameDao gameDao;

    @Override
    @Transactional(readOnly = true)
    public List<Game> list() {
        return (List<Game>) gameDao.findAll();
    }

    /**
     * Servicio para guardar un contacto.
     * @param game Contacto a guardar.
     * @return Contacto guardado.
     */
    @Override
    @Transactional
    public Game save(Game game) {

        return gameDao.save(game);
    }
}
