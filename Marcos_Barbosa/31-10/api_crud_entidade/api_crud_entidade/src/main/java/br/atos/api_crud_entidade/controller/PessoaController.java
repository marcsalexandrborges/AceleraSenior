package br.atos.api_crud_entidade.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atos.api_crud_entidade.model.Pessoa;
import br.atos.api_crud_entidade.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	

    @Autowired
    private PessoaRepository pessoaRepository;
    
    @GetMapping
    public List<Pessoa> findAllPessoas() {
        return (List<Pessoa>) pessoaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findPessoaById1(@PathVariable(value = "id") long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);

        if(pessoa.isPresent()) {
            return ResponseEntity.ok().body(pessoa.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
   
    @PostMapping
    public Pessoa savePessoa1(@Validated @RequestBody Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }
    
    
}


