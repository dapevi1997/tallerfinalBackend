package com.sofka.service;

import com.sofka.dao.LobbyDao;
import com.sofka.domain.Barprogress;
import com.sofka.domain.Lobby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Clase para configurar los servicios para el lobby.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class LobbyService implements ILobbyService{

    /**
     * Inyección de la clase LobbyDao
     */
    @Autowired
    private LobbyDao lobbyDao;

    /**
     * Servicio para listar los lobbies guardados.
     * @return Lista de contactos.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Lobby> list() {

        return (List<Lobby>) lobbyDao.findAll();
    }

    /**
     * Servicio para obtener el id del lobby activo si lo hay.
     * @return Id del lobby activo.
     */
    @Transactional
    public Optional<Lobby> isLobbieActived(){
        return lobbyDao.isLobbyActived();
    }

    /**
     * Servicio para guardar un lobby.
     * @param lobby Lobby a guardar.
     * @return Lobby guardado.
     */
    @Override
    @Transactional
    public Lobby save(Lobby lobby) {

        return lobbyDao.save(lobby);
    }
    /**
     * Servicio para actualizar el nombre de un contacto.
     * @param id Id del lobby.
     * @param lobby Contacto con el nombre actualizado.
     */
    @Transactional
    public void updateLobbyActived(Long id, Lobby lobby){

        lobbyDao.updateLobbyActived(id, lobby.getActived());
    }
}
