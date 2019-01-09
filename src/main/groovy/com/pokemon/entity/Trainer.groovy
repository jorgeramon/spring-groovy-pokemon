package com.pokemon.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "trainers")
class Trainer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id

  @NotNull
  @Column(nullable = false)
  String name

  @NotNull
  @Column(nullable = false)
  Short level
}
