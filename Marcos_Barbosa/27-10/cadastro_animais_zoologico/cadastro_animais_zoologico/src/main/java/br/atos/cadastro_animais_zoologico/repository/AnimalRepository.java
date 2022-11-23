package br.atos.cadastro_animais_zoologico.repository;

import org.springframework.data.repository.CrudRepository;

import br.atos.cadastro_animais_zoologico.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

	//Iterable<Animal> findByCuidador(Cuidador cuidador);
	Animal findById(long id);

}

