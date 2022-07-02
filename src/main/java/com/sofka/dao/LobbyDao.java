package com.sofka.dao;

import com.sofka.domain.Lobby;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import java.util.Optional;

/**
 * Interface que permite ralizar determinadas operaciones en la tabla
 * que contiene información a cerca del lobby.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface LobbyDao extends CrudRepository<Lobby, Long> {
    /**
     * Consulta para extraer el id de los lobby activo.
     */
    @Query("SELECT lob.id from Lobby lob where lob.actived='1'")
    Optional<Lobby> isLobbyActived();


}
