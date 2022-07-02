package com.sofka.dao;

import com.sofka.domain.NumberPaperboard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface que permite ralizar determinadas operaciones en la tabla
 * que contiene información a cerca del los números en el cartón de los
 * jugadores.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface NumberPaperboardDao extends CrudRepository<NumberPaperboard, Long> {
    /**
     * Consulta para extraer los números de los cartones según el id del jugador.
     */
    @Query("SELECT npa.number from NumberPaperboard npa where npa.gamerId=:id")
    List<String> numbersPaperboard(@Param(value = "id") int id);
}
