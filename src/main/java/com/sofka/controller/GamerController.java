package com.sofka.controller;


import com.sofka.domain.Gamer;
import com.sofka.service.GamerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Clase que contiene los controladores para las APIs relacionadas con la tabla que contiene
 * información de los jugadores.
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
public class GamerController {
    /**
     * Inyección del servicio para tratar la tabla que almacena información de los
     * jugadores.
     */
    @Autowired
    private GamerService gamerService;

    /**
     * API GET para obtener la lista de jugadores guardados.
     * @return Array de jugadores.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/gamers")
    public List<Gamer> list() {

        return gamerService.list();
    }
    /**
     * API POST que permite crear un jugador.
     * @param gamer Información de un jugador contenida en el objeto.
     * @return Jugador y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/gamer")
    public ResponseEntity<Gamer> toCreate(Gamer gamer) {
        gamerService.save( gamer);
        return new ResponseEntity<>(gamer, HttpStatus.CREATED);
    }
    /**
     * API GET para obtener la lista de jugadores guardados en cierto lobby.
     * @return Array de jugadores el el lobby especificado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/gamer/lobby/{id}")
    public List<String> listGamersIntoLobby(@PathVariable("id") int id) {

        return gamerService.gamerIntoLobby(id);
    }
}
