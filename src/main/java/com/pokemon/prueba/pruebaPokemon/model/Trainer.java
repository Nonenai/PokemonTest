package com.pokemon.prueba.pruebaPokemon.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {
	private String name;
	private OwnPokemon pokemon;
	private SavagePokemon savagePokemon;
	@Autowired
	private Attack attackAux;
	@Autowired
	private Team pokemonTeam;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public OwnPokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(OwnPokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Team getPokemonTeam() {
		return pokemonTeam;
	}

	public void setPokemonTeam(Team pokemonTeam) {
		this.pokemonTeam = pokemonTeam;
	}

	public Attack getAttackAux() {
		return attackAux;
	}

	public void setAttackAux(Attack attackAux) {
		this.attackAux = attackAux;
	}

	public SavagePokemon getSavagePokemon() {
		return savagePokemon;
	}

	public void setSavagePokemon(SavagePokemon savagePokemon) {
		this.savagePokemon = savagePokemon;
	}
	
}
