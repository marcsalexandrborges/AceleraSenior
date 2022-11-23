package br.atos.api_crud_entidade.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.atos.api_crud_entidade.model.Pessoa;

@Repository
	public interface PessoaRepository extends CrudRepository<Pessoa, Long> {}

	

