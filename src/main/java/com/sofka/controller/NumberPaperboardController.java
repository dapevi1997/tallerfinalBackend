package com.sofka.controller;

import com.sofka.domain.Game;
import com.sofka.domain.NumberBlackboard;
import com.sofka.domain.NumberPaperboard;
import com.sofka.service.GameService;
import com.sofka.service.NumberPaperboardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    /**
     * API GET para obtener la lista de contactos guardados.
     * @return Array de contactos.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping(path = "/numbersPaperboard/gamer/{id}")
    public List<String> listNumbersInPaperboard(@PathVariable("id") int id) {

        return numberPaperboardService.numbersPaperboard(id);
    }
    /**
     * API POST que permite crear un contacto.
     * @param numberPaperboard Información de un contacto contenida en el objeto.
     * @return Contacto y respuesta de creado.
     */
    @CrossOrigin(origins = "http://localhost:3000/")
    @PostMapping(path = "/numberPaperboard")
    public ResponseEntity<NumberPaperboard> toCreate(NumberPaperboard numberPaperboard) {
        numberPaperboardService.save( numberPaperboard);
        return new ResponseEntity<>(numberPaperboard, HttpStatus.CREATED);
    }
}
