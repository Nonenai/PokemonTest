package com.pokemon.prueba.pruebaPokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pokemon.prueba.pruebaPokemon.model.Attack;
import com.pokemon.prueba.pruebaPokemon.model.OwnPokemon;
import com.pokemon.prueba.pruebaPokemon.model.SavagePokemon;
import com.pokemon.prueba.pruebaPokemon.model.Trainer;

@Controller
public class PokemonController {
	@Autowired
	private Trainer trainer;

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}

	@PostMapping("insert")
	public ModelAndView trainerInsert(Trainer trainerForm) {

		ModelAndView modelAndView = new ModelAndView("index");
		addPageData(trainerForm);
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}

	private void addPageData(Trainer trainerForm) {

		if (!StringUtils.isEmpty(trainerForm.getName())) {
			trainer.setName(trainerForm.getName());
		}

		if (!StringUtils.isEmpty(trainerForm.getPokemon())) {
			SavagePokemon savagePokemon = new SavagePokemon();
			OwnPokemon pokemon = new OwnPokemon();
			if (trainerForm.getPokemon().getSavage() == false) {
				pokemon.setName(trainerForm.getPokemon().getName());
				pokemon.setLevel(trainerForm.getPokemon().getLevel());
				pokemon.setHealth(trainerForm.getPokemon().getHealth());
				trainer.getPokemonTeam().addPokemon(pokemon);
			} else {
				savagePokemon.setName(trainerForm.getPokemon().getName());
				savagePokemon.setLevel(trainerForm.getPokemon().getLevel());
				savagePokemon.setHealth(trainerForm.getPokemon().getHealth());
				trainer.setSavagePokemon(savagePokemon);

			}

		}
		if (!StringUtils.isEmpty(trainerForm.getAttackAux())) {
			if (trainer.getPokemonTeam().getMainPokemon() != null) {
				OwnPokemon pokemon = trainer.getPokemonTeam().getMainPokemon();
				Attack currentAttack = new Attack();
				List<Attack> attackList = pokemon.getAttackList();
				currentAttack.setName(trainerForm.getAttackAux().getName());
				currentAttack.setDamage(trainerForm.getAttackAux().getDamage());
				attackList.add(currentAttack);
				pokemon.setAttackList(attackList);
			} else {
				System.out.println("No has establecido el pokemon principal");
			}
		}

	}

	@PostMapping("switchPokemon")
	public ModelAndView switchPokemon(Trainer trainerForm) {
		if (!trainer.getPokemonTeam().getPokemons().isEmpty()) {
			OwnPokemon pokemonTmp = this.trainer.getPokemonTeam().getMainPokemon();
			this.trainer.getPokemonTeam().setMainPokemon(trainer.getPokemonTeam().getPokemons().get(0));
			trainer.getPokemonTeam().getPokemons().remove(0);
			trainer.getPokemonTeam().getPokemons().add(pokemonTmp);
		} else {
			System.out.println("La lista de pokemon esta vacia");
		}
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}

	@PostMapping("switchAttack")
	public ModelAndView switchAttack(Trainer trainerForm) {
		if ((trainer.getPokemonTeam().getMainPokemon() != null)&&(!trainer.getPokemonTeam().getMainPokemon().getAttackList().isEmpty())) {
			Attack attackTmp = this.trainer.getPokemonTeam().getMainPokemon().getMainAttack();
			this.trainer.getPokemonTeam().getMainPokemon().setMainAttack(trainer.getPokemonTeam().getMainPokemon().getAttackList().get(0));
			trainer.getPokemonTeam().getMainPokemon().getAttackList().remove(0);
			trainer.getPokemonTeam().getMainPokemon().getAttackList().add(attackTmp);
		} else {
			System.out.println("No se ha establecido el pokemon principal");
		}
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}

	@PostMapping("executeMainAttack")
	public ModelAndView executeMainAttack(Trainer trainerForm) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}
}
