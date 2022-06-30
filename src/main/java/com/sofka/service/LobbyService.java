package com.sofka.service;

import com.sofka.dao.LobbyDao;
import com.sofka.domain.Lobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LobbyService implements ILobbyService{

    /**
     * Inyección de la clase ContactDao
     */
    @Autowired
    private LobbyDao lobbyDao;

    /**
     * Servicio para listar los contactos guardados.
     * @return Lista de contactos.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Lobby> list() {
        return (List<Lobby>) lobbyDao.findAll();
    }

    @Transactional
    public Optional<Lobby> isLobbieActived(){
        return lobbyDao.isLobbyActived();
    }

    /**
     * Servicio para guardar un contacto.
     * @param lobby Contacto a guardar.
     * @return Contacto guardado.
     */
    @Override
    @Transactional
    public Lobby save(Lobby lobby) {

        return lobbyDao.save(lobby);
    }
}
