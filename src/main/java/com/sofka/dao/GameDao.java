package com.sofka.dao;

import com.sofka.domain.Game;
import org.springframework.data.repository.CrudRepository;

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

}
