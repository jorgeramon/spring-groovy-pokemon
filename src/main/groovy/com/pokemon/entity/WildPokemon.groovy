package com.pokemon.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column
import javax.persistence.ManyToOne
import javax.persistence.JoinColumn

@Entity
@Table(name = "wild_pokemon")
class WildPokemon {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id

  @NotNull
  @Column(name = "combat_power", nullable = false)
  Integer combatPower

  @ManyToOne
  @JoinColumn(name = "pokemon_id", referencedColumnName = "id", nullable = false)
  Pokemon pokemon

  @ManyToOne
  @JoinColumn(name = "trainer_id", referencedColumnName = "id", nullable = true)
  Trainer trainer
}
