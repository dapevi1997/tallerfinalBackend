package com.sofka.service;

import com.sofka.dao.NumberBlackboardDao;
import com.sofka.dao.NumberPaperboardDao;
import com.sofka.domain.Game;
import com.sofka.domain.NumberBlackboard;
import com.sofka.domain.NumberPaperboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NumberPaperboardService implements INumberPaperboardService{
    /**
     * Inyección de la clase ContactDao
     */
    @Autowired
    private NumberPaperboardDao numberPaperboardDao;

    @Override
    @Transactional(readOnly = true)
    public List<NumberPaperboard> list() {

        return (List<NumberPaperboard>) numberPaperboardDao.findAll();
    }
    @Transactional(readOnly = true)
    public List<String> numbersPaperboard(int id){
        return numberPaperboardDao.numbersPaperboard(id);
    }
    /**
     * Servicio para guardar un contacto.
     * @param numberPaperboard Contacto a guardar.
     * @return Contacto guardado.
     */
    @Override
    @Transactional
    public NumberPaperboard save(NumberPaperboard numberPaperboard) {

        return numberPaperboardDao.save(numberPaperboard);
    }
}
