package com.sofka.controller;

import com.sofka.domain.Barprogress;
import com.sofka.domain.Game;
import com.sofka.service.BarprogressService;
import com.sofka.service.GameService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
public class BarprogressController {
    /**
     * Inyección del servicio para tratar la tabla que contiene los datos del juego.
     */
    @Autowired
    private BarprogressService barprogressService;

    /**
     * API POST que permite crear un juego.
     * @param barprogress Información de un juego contenida en el objeto.
     * @return Juego y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/barProgress")
    public ResponseEntity<Barprogress> toCreate(Barprogress barprogress) {
        barprogressService.save( barprogress);
        return new ResponseEntity<>(barprogress, HttpStatus.CREATED);
    }
    /**
     * API PATCH para actualizar el nombre del contacto.
     * @param barprogress Contacto al que se le va a actualizar el nombre.
     * @param id Id del contacto al que se le va a actualizar el nombre.
     * @return Contacto con el nombre actualizado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PatchMapping(path = "/bar/lobby/{id}")
    public ResponseEntity<Barprogress> toUpdateVar(Barprogress barprogress, @PathVariable("id") int id) {
        barprogressService.updateVar(id,barprogress);
        return new ResponseEntity<>(barprogress, HttpStatus.OK);

    }
    /**
     * API GET para obtener la lista de números guardados para cierto juego.
     * @return Array de números según el id del juego.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/var/lobby/{id}")
    public String var(@PathVariable("id") int idLobby) {

        return barprogressService.var(idLobby);
    }


}
