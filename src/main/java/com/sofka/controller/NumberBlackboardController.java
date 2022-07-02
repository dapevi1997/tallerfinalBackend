package com.sofka.controller;


import com.sofka.domain.NumberBlackboard;
import com.sofka.service.NumberBlanckboardService;
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
 * información de los números del tablero.
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
public class NumberBlackboardController {
    /**
     * Inyección del servicio para tratar la tabla que contiene los números
     * mostrados en el tablero.
     */
    @Autowired
    private NumberBlanckboardService numberBlanckboardService;

    /**
     * API GET para obtener la lista de contactos números para el tablero.
     * @return Array de números para el tablero.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersBlackboard")
    public List<NumberBlackboard> list() {

        return numberBlanckboardService.list();
    }
    /**
     * API GET para obtener la lista de números guardados para cierto juego.
     * @return Array de números según el id del juego.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersBlackboard/game/{id}")
    public List<String> listNumbersInBlakcboard(@PathVariable("id") int id) {

        return numberBlanckboardService.numbersBlackboard(id);
    }
    /**
     * API POST que permite crear un número para el tablero.
     * @param numberBlackboard Información de un número para el tablero contenida en el objeto.
     * @return Número para el tablero y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/numberBlackboard")
    public ResponseEntity<NumberBlackboard> toCreate(NumberBlackboard numberBlackboard) {
        numberBlanckboardService.save( numberBlackboard);
        return new ResponseEntity<>(numberBlackboard, HttpStatus.CREATED);
    }
}
