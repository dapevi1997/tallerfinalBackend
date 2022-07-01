package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.domain.Gamer;
import com.sofka.domain.NumberBlackboard;
import com.sofka.service.GamerService;
import com.sofka.service.NumberBlanckboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class NumberBlackboardController {
    /**
     * Inyección del servicio para tratar la tabla contactos.
     */
    @Autowired
    private NumberBlanckboardService numberBlanckboardService;

    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersBlackboard")
    public List<NumberBlackboard> list() {

        return numberBlanckboardService.list();
    }
    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersBlackboard/game/{id}")
    public List<String> listNumbersInBlakcboard(@PathVariable("id") int id) {

        return numberBlanckboardService.numbersBlackboard(id);
    }
    /**
     * API POST que permite crear un contacto.
     * @param numberBlackboard Información de un contacto contenida en el objeto.
     * @return Contacto y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/numberBlackboard")
    public ResponseEntity<NumberBlackboard> toCreate(NumberBlackboard numberBlackboard) {
        numberBlanckboardService.save( numberBlackboard);
        return new ResponseEntity<>(numberBlackboard, HttpStatus.CREATED);
    }
}
