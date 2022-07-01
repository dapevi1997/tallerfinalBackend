package com.sofka.service;


import com.sofka.dao.NumberBlackboardDao;
import com.sofka.domain.Game;
import com.sofka.domain.Gamer;
import com.sofka.domain.NumberBlackboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NumberBlanckboardService implements INumberBlackboardService{

    /**
     * Inyección de la clase ContactDao
     */
    @Autowired
    private NumberBlackboardDao numberBlackboardDao;

    @Override
    public List<NumberBlackboard> list() {
        return (List<NumberBlackboard>) numberBlackboardDao.findAll();
    }
    @Transactional(readOnly = true)
    public List<String> numbersBlackboard(int id){
        return numberBlackboardDao.numbersBlackboard(id);
    }
    /**
     * Servicio para guardar un contacto.
     * @param numberBlackboard Contacto a guardar.
     * @return Contacto guardado.
     */
    @Override
    @Transactional
    public NumberBlackboard save(NumberBlackboard numberBlackboard) {

        return numberBlackboardDao.save(numberBlackboard);
    }
}
