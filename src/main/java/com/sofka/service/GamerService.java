package com.sofka.service;

import com.sofka.dao.GamerDao;
import com.sofka.domain.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


/**
 * Clase para configurar los servicios para los jugadores.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class GamerService implements IGamerService {

    /**
     * Inyección de la clase GamerDao
     */
    @Autowired
    private GamerDao gamersDao;

    /**
     * Servicio para obtener los jugadores.
     * @return Lista de jugadores
     */
    @Override
    @Transactional(readOnly = true)
    public List<Gamer> list() {
        return (List<Gamer>) gamersDao.findAll();
    }

    /**
     * Servicio para guardar un jugador.
     * @param gamer Jugador a guardar.
     * @return Jugador guardado.
     */
    @Override
    @Transactional
    public Gamer save(Gamer gamer) {

        return gamersDao.save(gamer);
    }

    /**
     * Servicio para retornar los correos de los jugadores dentro de un lobby.
     * @param id Id del lobby
     * @return Lista de correos.
     */
    @Transactional(readOnly = true)
    public List<String> gamerIntoLobby(int id){

        return gamersDao.gamersIntoLobby(id);
    }
}
