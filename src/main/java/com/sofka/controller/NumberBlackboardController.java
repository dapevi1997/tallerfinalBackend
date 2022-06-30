package com.sofka.controller;

import com.sofka.domain.Gamer;
import com.sofka.domain.NumberBlackboard;
import com.sofka.service.GamerService;
import com.sofka.service.NumberBlanckboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    public List<String> listGamersIntoLobby(@PathVariable("id") int id) {

        return numberBlanckboardService.numbersBlackboard(id);
    }
}
