package com.sofka.service;


import com.sofka.dao.NumberBlackboardDao;
import com.sofka.domain.NumberBlackboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Clase para configurar los servicios para los números del tablero.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class NumberBlanckboardService implements INumberBlackboardService{

    /**
     * Inyección de la clase NumberBlackboardDao
     */
    @Autowired
    private NumberBlackboardDao numberBlackboardDao;

    /**
     * Servicio para obtener la lista de números en el tablero.
     * @return Lista de números en el tablero.
     */
    @Override
    public List<NumberBlackboard> list() {
        return (List<NumberBlackboard>) numberBlackboardDao.findAll();
    }
    /**
     * Servicio para obtener la lista números en un determinado tablero.
     * @param id Id del tablero
     * @return Números en el tablero
     */
    @Transactional(readOnly = true)
    public List<String> numbersBlackboard(int id){

        return numberBlackboardDao.numbersBlackboard(id);
    }
    /**
     * Servicio para guardar un número en el tablero.
     * @param numberBlackboard Número a guardar.
     * @return Número guardado.
     */
    @Override
    @Transactional
    public NumberBlackboard save(NumberBlackboard numberBlackboard) {

        return numberBlackboardDao.save(numberBlackboard);
    }
}
