package com.pokemon.service

import com.pokemon.entity.Trainer

interface TrainerService {

  List<Trainer> findAll()

  Trainer findById(int id)
}
