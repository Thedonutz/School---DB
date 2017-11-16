package com.umkc.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.umkc.db.models.City;
import com.umkc.db.models.Evolved;
import com.umkc.db.models.Gym;
import com.umkc.db.models.GymMembers;
import com.umkc.db.models.Nature;
import com.umkc.db.models.PokeDex;
import com.umkc.db.models.Pokemon;
import com.umkc.db.models.PokemonOfType;
import com.umkc.db.models.PokemonOrigin;
import com.umkc.db.models.PokemonType;
import com.umkc.db.models.Professor;
import com.umkc.db.models.Region;
import com.umkc.db.models.Trainer;
import com.umkc.db.repository.CityRepo;
import com.umkc.db.repository.EvolvedRepo;
import com.umkc.db.repository.GymMemberRepo;
import com.umkc.db.repository.GymRepo;
import com.umkc.db.repository.NatureRepo;
import com.umkc.db.repository.PokedexRepo;
import com.umkc.db.repository.PokemonOriginRepo;
import com.umkc.db.repository.PokemonRepo;
import com.umkc.db.repository.PokemonTypeRepo;
import com.umkc.db.repository.ProfessorRepo;
import com.umkc.db.repository.RegionRepo;
import com.umkc.db.repository.TrainerRepo;
import com.umkc.db.repository.TypeRepo;

@RestController
public class PokemonRestController {

	@Autowired
	PokemonRepo pokemon;
	@Autowired
	CityRepo city;
	@Autowired
	EvolvedRepo evolved;
	@Autowired
	GymMemberRepo gymMember;
	@Autowired
	GymRepo gym;
	@Autowired
	NatureRepo nature;
	@Autowired
	PokedexRepo pokedex;
	@Autowired
	PokemonOriginRepo origin;
	@Autowired
	PokemonTypeRepo pokemonType;
	@Autowired
	ProfessorRepo professor;
	@Autowired
	RegionRepo region;
	@Autowired
	TrainerRepo trainer;
	@Autowired
	TypeRepo type;

	@RequestMapping("/pokemon")
	public @ResponseBody List<Pokemon> extractPokemon() {
		return this.pokemon.findAll();
	}
	
	@RequestMapping("/city")
	public @ResponseBody List<City> extractcity() {
		return this.city.findAll();
	}
	
	@RequestMapping("/evolved")
	public @ResponseBody List<Evolved> evolved() {
		return this.evolved.findAll();
	}
	
	@RequestMapping("/member")
	public @ResponseBody List<GymMembers> gymMembers() {
		return this.gymMember.findAll();
	}
	
	@RequestMapping("/gym")
	public @ResponseBody List<Gym> gym() {
		return this.gym.findAll();
	}
	
	@RequestMapping("/nature")
	public @ResponseBody List<Nature> natures() {
		return this.nature.findAll();
	}
	
	@RequestMapping("/pokedex")
	public @ResponseBody List<PokeDex> pokedex() {
		return this.pokedex.findAll();
	}
	
	@RequestMapping("/origin")
	public @ResponseBody List<PokemonOrigin> origin() {
		return this.origin.findAll();
	}
	
	@RequestMapping("/pokemontype")
	public @ResponseBody List<PokemonOfType> pokemonType() {
		return this.pokemonType.findAll();
	}
	
	@RequestMapping("/professor")
	public @ResponseBody List<Professor> professor() {
		return this.professor.findAll();
	}
	
	@RequestMapping("/region")
	public @ResponseBody List<Region> region() {
		return this.region.findAll();
	}
	
	@RequestMapping("/trainer")
	public @ResponseBody List<Trainer> trainer() {
		return this.trainer.findAll();
	}
	
	@RequestMapping("/type")
	public @ResponseBody List<PokemonType> type() {
		return this.type.findAll();
	}
	

}
