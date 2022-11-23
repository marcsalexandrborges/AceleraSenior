package br.atos.api_crud_analista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atos.api_crud_analista.model.Analista;
import br.atos.api_crud_analista.repository.AnalistaRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AnalistaController {

	@Autowired
	AnalistaRepository analistaRepository;

	@GetMapping("/analistas")
	public List<Analista> listarAnalista() {

		List<Analista> analistas = analistaRepository.findAll();
		return analistas;
	}

	@PostMapping("/cadastrarAnalista")
	public void cadastrarProgramador(@RequestBody Analista analista) {

		analistaRepository.save(analista);

	}

	@GetMapping(value = "/analista/{id}")
	public Analista buscarAnalista(@PathVariable long id) {

		Analista analista = analistaRepository.findById(id);

		return analista;
	}
	
	@DeleteMapping(value = "/analistaDelete/{id}" )
	public void deletarAnalista(@PathVariable long id) {
		
		Analista analista = analistaRepository.findById(id);
		analistaRepository.delete(analista);
		
	}
	
	@PutMapping("/editarAnalista")
	public void editarAnalista(@RequestBody Analista analista){
		
		analistaRepository.save(analista);
	}
	
}
