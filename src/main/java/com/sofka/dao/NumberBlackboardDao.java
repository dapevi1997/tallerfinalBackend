package com.sofka.dao;

import com.sofka.domain.NumberBlackboard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NumberBlackboardDao extends CrudRepository<NumberBlackboard, Long> {
    /**
     * Consulta para modificar el nombre del contacto.
     */
    @Query("SELECT nbl.number from NumberBlackboard nbl where nbl.gameId=:id")
    List<String> numbersBlackboard(@Param(value = "id") int id);
}
