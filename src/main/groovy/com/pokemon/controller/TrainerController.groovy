package com.pokemon.controller

import com.pokemon.entity.Trainer
import com.pokemon.entity.WildPokemon
import com.pokemon.service.TrainerService
import com.pokemon.service.WildPokemonService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping('/trainers')
class TrainerController {

  @Autowired
  private final TrainerService trainerService

  @Autowired
  private final WildPokemonService wildPokemonService

  @RequestMapping(method = RequestMethod.GET)
  List<Trainer> findAll() {
    trainerService.findAll()
  }

  @RequestMapping(value = '/{id}/pokemon', method = RequestMethod.GET)
  List<Trainer> findCaughtPokemon(@PathVariable('id') int id) {
    wildPokemonService.findByTrainer id
  }

  @RequestMapping(value = '/{id}', method = RequestMethod.GET)
  Trainer findById(@PathVariable('id') int id) {
    trainerService.findById id
  }
}
