package com.sofka.dao;

import com.sofka.domain.NumberPaperboard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NumberPaperboardDao extends CrudRepository<NumberPaperboard, Long> {
    /**
     * Consulta para modificar el nombre del contacto.
     */
    @Query("SELECT npa.number from NumberPaperboard npa where npa.gamerId=:id")
    List<String> numbersPaperboard(@Param(value = "id") int id);
}
