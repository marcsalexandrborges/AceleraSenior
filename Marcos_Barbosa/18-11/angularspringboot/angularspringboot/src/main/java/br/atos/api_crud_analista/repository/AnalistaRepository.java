package br.atos.api_crud_analista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.atos.api_crud_analista.model.Analista;

@Repository
public interface AnalistaRepository extends JpaRepository<Analista, Long> {
	
	Analista findById(long id);

}
