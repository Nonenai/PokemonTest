package com.pokemon.prueba.pruebaPokemon.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Pokemon {
	private String name;
	private Integer level;
	private Integer health;
	private Boolean savage;
	private Attack mainAttack;
	private List<Attack> attackList = new ArrayList<Attack>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public List<Attack> getAttackList() {
		return attackList;
	}

	public void setAttackList(List<Attack> attackList) {
		this.attackList = attackList;
	}

	public Boolean getSavage() {
		return savage;
	}

	public void setSavage(Boolean type) {
		this.savage = type;
	}

	public Attack getMainAttack() {
		return mainAttack;
	}

	public void setMainAttack(Attack mainAttack) {
		this.mainAttack = mainAttack;
	}




}
