package com.sofka.dao;

import com.sofka.domain.Game;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

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
     * Consulta para modificar el nombre del contacto.
     * @param id Id del contacto al que se le modificará el nombre.
     * @param finished Nuevo nombre.
     */
    @Modifying
    @Query("update Game gam set gam.finished = :finished where gam.id=:id")
    void updateGameFinished(@Param(value = "id") Long id, @Param(value = "finished") String finished);
    /**
     * Consulta para modificar el nombre del contacto.
     * @param id Id del contacto al que se le modificará el nombre.
     * @param email Nuevo nombre.
     */
    @Modifying
    @Query("update Game gam set gam.email = :email where gam.id=:id")
    void updateIdWinner(@Param(value = "id") Long id, @Param(value = "email") String email);
    /**
     * Consulta para extraer los números del tablero según el id del juego.
     */
    @Query("SELECT gam.email from Game gam where gam.id=:id")
    String idWinner(@Param(value = "id") Long id);

}
