package com.sofka.controller;


import com.sofka.domain.Gamer;
import com.sofka.domain.Lobby;
import com.sofka.service.GamerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class GamerController {
    /**
     * Inyección del servicio para tratar la tabla contactos.
     */
    @Autowired
    private GamerService gamerService;

    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/gamers")
    public List<Gamer> list() {

        return gamerService.list();
    }
    /**
     * API POST que permite crear un contacto.
     * @param gamer Información de un contacto contenida en el objeto.
     * @return Contacto y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/gamer")
    public ResponseEntity<Gamer> toCreate(Gamer gamer) {
        gamerService.save( gamer);
        return new ResponseEntity<>(gamer, HttpStatus.CREATED);
    }
    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/gamer/lobby/{id}")
    public List<String> listGamersIntoLobby(@PathVariable("id") int id) {

        return gamerService.gamerIntoLobby(id);
    }
}
