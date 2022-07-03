package com.sofka.dao;


import com.sofka.domain.Barprogress;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface para guardar y obtener progreso de la barra de espera.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
public interface BarprogressDao extends CrudRepository<Barprogress,Long> {
    /**
     * Consulta para modificar el nombre del contacto.
     * @param id Id del contacto al que se le modificará el nombre.
     * @param var Nuevo nombre.
     */
    @Modifying
    @Query("update Barprogress bar set bar.var = :var where bar.idLobby=:id")
    void updateVar(@Param(value = "id") int id, @Param(value = "var") int var);
    /**
     * Consulta para extraer los números del tablero según el id del juego.
     */
    @Query("SELECT bar.var from Barprogress bar where bar.idLobby=:idLobby")
    String var(@Param(value = "idLobby") int idLobby);
}
