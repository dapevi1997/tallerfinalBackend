package com.sofka.controller;


import com.sofka.domain.NumberPaperboard;
import com.sofka.service.NumberPaperboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Clase que contiene los controladores para las APIs relacionadas con la tabla que contiene
 * información de los números del cartón de los jugadores.
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
public class NumberPaperboardController {
    /**
     * Inyección del servicio para tratar la tabla que contiene información de los
     * números de los cartones de los jugadores.
     */
    @Autowired
    private NumberPaperboardService numberPaperboardService;

    /**
     * API GET para obtener la lista de números en los cartones de los jugadores.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersPaperboard")
    public List<NumberPaperboard> list() {
        return numberPaperboardService.list();
    }
    /**
     * API GET para obtener la lista de números en los cartones según el id de un jugador.
     * @return Array de números.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersPaperboard/gamer/{id}")
    public List<String> listNumbersInPaperboard(@PathVariable("id") int id) {

        return numberPaperboardService.numbersPaperboard(id);
    }
    /**
     * API POST que permite crear un número para un cartón.
     * @param numberPaperboard Información de un número contenida en el objeto.
     * @return Número y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/numberPaperboard")
    public ResponseEntity<NumberPaperboard> toCreate(NumberPaperboard numberPaperboard) {
        numberPaperboardService.save( numberPaperboard);
        return new ResponseEntity<>(numberPaperboard, HttpStatus.CREATED);
    }
}
