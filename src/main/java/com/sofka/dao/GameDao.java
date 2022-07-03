package com.sofka.dao;

import com.sofka.domain.Game;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Interface que permite ralizar determinadas operaciones en la tabla
 * que contiene información a cerca del juego.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface GameDao extends CrudRepository<Game, Long> {
    /**
     * Consulta para modificar el estado del juego.
     * @param id Id del juego al que se le modificará el estado.
     * @param finished Nuevo estado.
     */
    @Modifying
    @Query("update Game gam set gam.finished = :finished where gam.id=:id")
    void updateGameFinished(@Param(value = "id") Long id, @Param(value = "finished") String finished);
    /**
     * Consulta para modificar el id del lobby.
     * @param id Id del juego.
     * @param email Nuevo id.
     */
    @Modifying
    @Query("update Game gam set gam.email = :email where gam.id=:id")
    void updateIdWinner(@Param(value = "id") Long id, @Param(value = "email") String email);
    /**
     * Consulta para el id del lobby en curso.
     */
    @Query("SELECT gam.email from Game gam where gam.id=:id")
    String idWinner(@Param(value = "id") Long id);
    /**
     * Consulta para extraer el id del juego.
     */
    @Query("SELECT gam.id from Game gam where gam.lobbyId=:idLobby")
    String isLobby(@Param(value = "idLobby") int idLobby);

}
