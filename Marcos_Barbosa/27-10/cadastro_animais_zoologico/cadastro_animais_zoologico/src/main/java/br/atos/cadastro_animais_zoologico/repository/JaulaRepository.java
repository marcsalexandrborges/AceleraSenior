package br.atos.cadastro_animais_zoologico.repository;

import org.springframework.data.repository.CrudRepository;

import br.atos.cadastro_animais_zoologico.model.Jaula;

public interface JaulaRepository extends CrudRepository<Jaula, Long> {
	//static Iterable<Jaula> findByCuidador(Cuidador cuidador) {
		// TODO Auto-generated method stub
		//return null;
	
	Jaula findById(long id);

	
	

}
