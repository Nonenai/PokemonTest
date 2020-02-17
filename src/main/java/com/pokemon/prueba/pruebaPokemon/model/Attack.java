package com.pokemon.prueba.pruebaPokemon.model;

import org.springframework.stereotype.Component;

@Component
public class Attack {
	private String name;
	private Integer damage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDamage() {
		return damage;
	}
	public void setDamage(Integer damage) {
		this.damage = damage;
	}
}
