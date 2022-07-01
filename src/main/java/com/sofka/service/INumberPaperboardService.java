package com.sofka.service;


import com.sofka.domain.NumberBlackboard;
import com.sofka.domain.NumberPaperboard;

import java.util.List;

public interface INumberPaperboardService {
    /**
     * Método para listar los contactos guardados.
     * @return Lista de contactos.
     */
    List<NumberPaperboard> list();
    /**
     * Método para guardar un contacto.
     * @param game Contacto a guardar.
     * @return Contacto guardado.
     */
    /**
     * Método para guardar un contacto.
     * @param numberPaperboard Contacto a guardar.
     * @return Contacto guardado.
     */
    NumberPaperboard save(NumberPaperboard numberPaperboard);
}
