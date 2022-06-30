package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.domain.Gamer;
import com.sofka.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class GameController {
    /**
     * Inyección del servicio para tratar la tabla contactos.
     */
    @Autowired
    private GameService gameService;

    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/game")
    public List<Game> list() {
        return gameService.list();
    }
    /**
     * API POST que permite crear un contacto.
     * @param game Información de un contacto contenida en el objeto.
     * @return Contacto y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/game")
    public ResponseEntity<Game> toCreate(Game game) {
        gameService.save( game);
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }
}
