package com.sofka.service;

import com.sofka.dao.BarprogressDao;
import com.sofka.dao.GamerDao;
import com.sofka.domain.Barprogress;
import com.sofka.domain.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Clase para configurar los servicios para los jugadores.
 *
 * @version 1.0.0 2022-07-02
 *
 * @author DANIEL PEREZ VITOLA - dapevi97@gmail.com
 *
 * @since 1.0.0
 *
 */
@Service
public class BarprogressService implements IBarprogressService {
    /**
     * Inyección de la clase GamerDao
     */
    @Autowired
    private BarprogressDao barprogressDao;

    /**
     * Servicio para guardar un jugador.
     * @param barprogress Jugador a guardar.
     * @return Jugador guardado.
     */
    @Override
    @Transactional
    public Barprogress save(Barprogress barprogress) {

        return barprogressDao.save(barprogress);
    }
    /**
     * Servicio para actualizar el nombre de un contacto.
     * @param id Id del lobby.
     * @param barprogress Contacto con el nombre actualizado.
     */
    @Transactional
    public void updateVar(int id, Barprogress barprogress){

        barprogressDao.updateVar(id, barprogress.getVar());
    }
    /**
     * Servicio para obtener la lista números en un determinado tablero.
     * @param idLobby Id del tablero
     * @return Números en el tablero
     */
    @Transactional(readOnly = true)
    public String var(int idLobby){

        return barprogressDao.var(idLobby);
    }

}
