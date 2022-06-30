package com.sofka.dao;

import com.sofka.domain.Gamer;
import com.sofka.domain.Lobby;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GamerDao extends CrudRepository<Gamer, Long> {
    /**
     * Consulta para modificar el nombre del contacto.
     */
    @Query("SELECT gam.email from Gamer gam where gam.lobbyId=:id")
    List<String> gamersIntoLobby(@Param(value = "id") int id);
}
