package com.sofka.dao;

import com.sofka.domain.Game;
import com.sofka.domain.Lobby;
import org.springframework.data.repository.CrudRepository;

public interface GameDao extends CrudRepository<Game, Long> {

}
