package com.pokemon.service

import com.pokemon.entity.WildPokemon

interface WildPokemonService {

  List<WildPokemon> findByTrainer(int trainerId)
}
