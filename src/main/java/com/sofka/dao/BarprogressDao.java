package com.sofka.dao;


import com.sofka.domain.Barprogress;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


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
     * Consulta para modificar el atributo var de la tabla que contiene información de la
     * barra de progreso.
     * @param id Id del lobby.
     * @param var Nuevo valor.
     */
    @Modifying
    @Query("update Barprogress bar set bar.var = :var where bar.idLobby=:id")
    void updateVar(@Param(value = "id") int id, @Param(value = "var") int var);
    /**
     * Consulta para obtener el valor actual de la variable que guarda el progreso de la barra.
     */
    @Query("SELECT bar.var from Barprogress bar where bar.idLobby=:idLobby")
    String var(@Param(value = "idLobby") int idLobby);
}
