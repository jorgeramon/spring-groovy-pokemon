package com.pokemon.service.impl

import com.pokemon.entity.Trainer
import com.pokemon.service.TrainerService
import com.pokemon.repository.TrainerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrainerServiceImpl implements TrainerService {

  @Autowired
  private final TrainerRepository trainerRepository

  @Override
  List<Trainer> findAll() {
    trainerRepository.findAll()
  }

  @Override
  Trainer findById(int id) {
    trainerRepository.findById id
  }
}
