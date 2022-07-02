package com.sofka.service;


import com.sofka.dao.NumberPaperboardDao;
import com.sofka.domain.NumberPaperboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Clase para configurar los servicios para los números de los cartones.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class NumberPaperboardService implements INumberPaperboardService{
    /**
     * Inyección de la clase NumberPaperboardDao
     */
    @Autowired
    private NumberPaperboardDao numberPaperboardDao;

    /**
     * Servicio para obtener la lista de números en el cartón de los jugadores.
     * @return Números en los cartones.
     */
    @Override
    @Transactional(readOnly = true)
    public List<NumberPaperboard> list() {

        return (List<NumberPaperboard>) numberPaperboardDao.findAll();
    }

    /**
     * Servicio para obtener la lista de números en el cartón para determinado jugador.
     * @param id Id del cartón.
     * @return Lista de números en el cartón.
     */
    @Transactional(readOnly = true)
    public List<String> numbersPaperboard(int id){
        return numberPaperboardDao.numbersPaperboard(id);
    }
    /**
     * Servicio para guardar un número.
     * @param numberPaperboard Número a guardar.
     * @return Número guardado.
     */
    @Override
    @Transactional
    public NumberPaperboard save(NumberPaperboard numberPaperboard) {

        return numberPaperboardDao.save(numberPaperboard);
    }
}
