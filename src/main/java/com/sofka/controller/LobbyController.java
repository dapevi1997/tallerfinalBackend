package com.sofka.controller;

import com.sofka.domain.Barprogress;
import com.sofka.domain.Lobby;
import com.sofka.service.LobbyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Clase para establecer los controladores para manejar la tabla que guarda los
 * lobbies creados.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Slf4j
@RestController
public class LobbyController {

    /**
     * Inyección del servicio para tratar la tabla que almacena los lobbies que se han
     * creado.
     */
    @Autowired
    private LobbyService lobbyService;

    /**
     * API GET para obtener la lista de lobbies guardados.
     * @return Array de lobbies.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/lobby")
    public List<Lobby> list() {

        return lobbyService.list();
    }

    /**
     * API GET para saber si hay algún lobby activo.
     *
     * @return Lobby activo.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/isLobbieActived")
    public Optional<Lobby> isLobbieActived() {

        return lobbyService.isLobbieActived();
    }

    /**
     * API POST que permite crear un Lobby.
     * @param lobby Información de un lobby contenida en el objeto.
     * @return Lobby y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/lobby")
    public ResponseEntity<Lobby> toCreate(Lobby lobby) {
        lobbyService.save(lobby);
        return new ResponseEntity<>(lobby, HttpStatus.CREATED);
    }
    /**
     * API PATCH para actualizar el nombre del contacto.
     * @param lobby Contacto al que se le va a actualizar el nombre.
     * @param id Id del contacto al que se le va a actualizar el nombre.
     * @return Contacto con el nombre actualizado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PatchMapping(path = "/activated/lobby/{id}")
    public ResponseEntity<Lobby> toUpdateActived(Lobby lobby, @PathVariable("id") Long id) {
        lobbyService.updateLobbyActived(id,lobby);
        return new ResponseEntity<>(lobby, HttpStatus.OK);

    }
}
