package com.sofka.service;

import com.sofka.dao.GamerDao;
import com.sofka.domain.Gamer;
import com.sofka.domain.Lobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GamerService implements IGamerService {

    /**
     * Inyección de la clase ContactDao
     */
    @Autowired
    private GamerDao gamersDao;

    @Override
    @Transactional(readOnly = true)
    public List<Gamer> list() {
        return (List<Gamer>) gamersDao.findAll();
    }

    /**
     * Servicio para guardar un contacto.
     * @param gamer Contacto a guardar.
     * @return Contacto guardado.
     */
    @Override
    @Transactional
    public Gamer save(Gamer gamer) {

        return gamersDao.save(gamer);
    }

    @Transactional(readOnly = true)
    public List<String> gamerIntoLobby(int id){
        return gamersDao.gamersIntoLobby(id);
    }
}
