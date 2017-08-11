package br.com.BrunoCosta.gameapi.repository;

import br.com.BrunoCosta.gameapi.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepository extends MongoRepository<Player, String>{
}
