package com.umkc.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.umkc.db.models.Pokemon;
import com.umkc.db.repository.PokemonRepository;

@RestController
public class PokemonRestController {

	@Autowired
	PokemonRepository pokeRepo;

	@RequestMapping("/findPokemon")
	public @ResponseBody List<Pokemon> extractPokemon() {
		return this.pokeRepo.findAll();
	}

}
