package com.pokemon.prueba.pruebaPokemon.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Team {
	private OwnPokemon mainPokemon;
	private List<OwnPokemon> pokemons = new ArrayList<>();
	private int capacity =6;
	private int sumItems() {
		int sum = 0;
		for (OwnPokemon pokemon : getPokemons()) {
			try {
				sum ++;
			} catch (Exception e) {
			}
		}
		return sum;
	}

	public boolean isFull() {
		return capacity <= sumItems();
	}


	public void addPokemon(OwnPokemon pokemon) {
		
		if (isFull()) {
			System.out.println("no se pudo añadir el elemento " + pokemon.getName());
		} else {
			getPokemons().add(pokemon);
		}
	}


	public int spaceAvalaible() {
		return capacity - sumItems();
	}

	public  int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<OwnPokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<OwnPokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public OwnPokemon getMainPokemon() {
		return mainPokemon;
	}

	public void setMainPokemon(OwnPokemon mainPokemon) {
		this.mainPokemon = mainPokemon;
	}
}
