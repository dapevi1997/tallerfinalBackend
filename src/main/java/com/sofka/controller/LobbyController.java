package com.sofka.controller;

import com.sofka.domain.Lobby;
import com.sofka.service.LobbyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Clase para establecer los controladores.
 *
 * @version 1.0.0 2022-06-26
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
     * Inyección del servicio para tratar la tabla contactos.
     */
    @Autowired
    private LobbyService lobbyService;

    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/lobby")
    public List<Lobby> list() {

        return lobbyService.list();
    }

    /**
     * API GET para obtener la lista de contactos guardados.
     *
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/isLobbieActived")
    public Optional<Lobby> isLobbieActived() {

        return lobbyService.isLobbieActived();
    }

    /**
     * API POST que permite crear un contacto.
     * @param lobby Información de un contacto contenida en el objeto.
     * @return Contacto y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/lobby")
    public ResponseEntity<Lobby> toCreate(Lobby lobby) {
        lobbyService.save(lobby);
        return new ResponseEntity<>(lobby, HttpStatus.CREATED);
    }
}
