package br.atos.cadastro_cliente_petShop.repository;

import org.springframework.data.repository.CrudRepository;

import br.atos.cadastro_cliente_petShop.model.Cliente;
import br.atos.cadastro_cliente_petShop.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> { 
	Iterable<Pet> findByCliente(Cliente cliente);
	Pet findById(long id);
	

}
