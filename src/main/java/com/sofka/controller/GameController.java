package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.domain.Lobby;
import com.sofka.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase que contiene los controladores para las APIs relacionadas con la tabla que contiene
 * información de los juegos.
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
public class GameController {
    /**
     * Inyección del servicio para tratar la tabla que contiene los datos del juego.
     */
    @Autowired
    private GameService gameService;

    /**
     * API GET para obtener la lista de juegos.
     * @return Array de juegos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/game")
    public List<Game> list() {
        return gameService.list();
    }
    /**
     * API POST que permite crear un juego.
     * @param game Información de un juego contenida en el objeto.
     * @return Juego y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/game")
    public ResponseEntity<Game> toCreate(Game game) {
        gameService.save( game);
        return new ResponseEntity<>(game, HttpStatus.CREATED);
    }
    /**
     * API PATCH para actualizar el nombre del contacto.
     * @param game Contacto al que se le va a actualizar el nombre.
     * @param id Id del contacto al que se le va a actualizar el nombre.
     * @return Contacto con el nombre actualizado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PatchMapping(path = "/finished/game/{id}")
    public ResponseEntity<Game> toUpdateGameFinish(Game game, @PathVariable("id") Long id) {
        gameService.updateGameFinished(id,game);
        return new ResponseEntity<>(game, HttpStatus.OK);

    }
    /**
     * API PATCH para actualizar el nombre del contacto.
     * @param game Contacto al que se le va a actualizar el nombre.
     * @param id Id del contacto al que se le va a actualizar el nombre.
     * @return Contacto con el nombre actualizado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PatchMapping(path = "/idWinner/game/{id}")
    public ResponseEntity<Game> toUpdateIdWinner(Game game, @PathVariable("id") Long id) {
        gameService.updateIdWinner(id,game);
        return new ResponseEntity<>(game, HttpStatus.OK);

    }
    /**
     * API GET para obtener la lista de números guardados para cierto juego.
     * @return Array de números según el id del juego.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/idWinner/game/{id}")
    public String idWinner(@PathVariable("id") Long id) {

        return gameService.idWinner(id);
    }
    /**
     * API GET para obtener la lista de números guardados para cierto juego.
     * @return Array de números según el id del juego.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/idGame/game/{idLobby}")
    public String isLobby(@PathVariable("idLobby") int idLobby) {

        return gameService.isLobby(idLobby);
    }
}
