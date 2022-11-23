package br.atos.cadastro_animais_zoologico.repository;

import org.springframework.data.repository.CrudRepository;

import br.atos.cadastro_animais_zoologico.model.Cuidador;

public interface CuidadorRepository extends CrudRepository<Cuidador, Long> {
	Cuidador findById(long id);
}
