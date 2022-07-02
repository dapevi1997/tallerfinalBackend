package com.sofka.dao;

import com.sofka.domain.Gamer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Interface que permite ralizar determinadas operaciones en la tabla
 * que contiene información a cerca del jugador.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface GamerDao extends CrudRepository<Gamer, Long> {
    /**
     * Consulta para extraer los correos de los jugadores según el id del lobby.
     */
    @Query("SELECT gam.email, gam.id from Gamer gam where gam.lobbyId=:id")
    List<String> gamersIntoLobby(@Param(value = "id") int id);
}
