package com.sofka.dao;

import com.sofka.domain.NumberBlackboard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface que permite ralizar determinadas operaciones en la tabla
 * que contiene información a cerca de los números en el tablero.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface NumberBlackboardDao extends CrudRepository<NumberBlackboard, Long> {
    /**
     * Consulta para extraer los números del tablero según el id del juego.
     */
    @Query("SELECT nbl.number from NumberBlackboard nbl where nbl.gameId=:id")
    List<String> numbersBlackboard(@Param(value = "id") int id);
}
