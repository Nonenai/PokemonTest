package com.pokemon.prueba.pruebaPokemon.model;

public class SavagePokemon extends Pokemon{
	private Boolean catchable = false;
	
	public SavagePokemon() {
		super();
		
		
	}

	public Boolean getCatchable() {
		return catchable;
	}

	public void setCatchable(Boolean catchable) {
		this.catchable = catchable;
	}
}
