package br.atos.cadastro_animais_zoologico.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.atos.cadastro_animais_zoologico.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{
	Optional<UserModel> findByUserName(String userName);

}
