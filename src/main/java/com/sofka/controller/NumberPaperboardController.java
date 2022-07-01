package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.domain.NumberPaperboard;
import com.sofka.service.GameService;
import com.sofka.service.NumberPaperboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class NumberPaperboardController {
    /**
     * Inyección del servicio para tratar la tabla contactos.
     */
    @Autowired
    private NumberPaperboardService numberPaperboardService;

    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersPaperboard")
    public List<NumberPaperboard> list() {
        return numberPaperboardService.list();
    }
}
