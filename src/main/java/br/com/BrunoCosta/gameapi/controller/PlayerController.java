package br.com.BrunoCosta.gameapi.controller;


import br.com.BrunoCosta.gameapi.model.Player;
import br.com.BrunoCosta.gameapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    PlayerRepository playerRepository;
    @Autowired


    @GetMapping(value = "/")
    public List<Player> findAll(){
        return playerRepository.findAll();
    }

    @PostMapping(value = "/")
    public void salvar(@RequestBody Player player){
        playerRepository.save(player);
    }
}
