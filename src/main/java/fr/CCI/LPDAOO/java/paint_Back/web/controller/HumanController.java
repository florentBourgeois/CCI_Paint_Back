package fr.CCI.LPDAOO.java.paint_Back.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.Human;
import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.DAO.HumanDAO;
import fr.CCI.LPDAOO.java.paint_Back.model.shapes.petitmodel.DAO.HumanDAO_Impl;

@RestController
public class HumanController {

	@Autowired
	HumanDAO repo;
	
	@GetMapping(value= "/humans")
	public List<Human> getHumans(){
		return repo.findAll();
	}
	
	@GetMapping(value= "/humans/{id}")
	public Optional<Human> getOneHuman(@PathVariable int id){
		return repo.findById((long) id);
	}
	
	
	@PostMapping(value= "/humans")
	public Human postHumans(@RequestBody Human h){
		return repo.save(h);
	}
	
	
	@DeleteMapping(value= "/humans/{id}")
	public ResponseEntity<Human> delHuman(@PathVariable int id) {
		if(repo.findAll().size() < id)
			return ResponseEntity.badRequest().build();
		
		repo.deleteById((long) id);
		return ResponseEntity.ok().build();
	}
	
}
