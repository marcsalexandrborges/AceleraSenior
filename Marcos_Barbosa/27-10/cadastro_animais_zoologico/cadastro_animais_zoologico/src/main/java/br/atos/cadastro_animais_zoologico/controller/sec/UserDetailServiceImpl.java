package br.atos.cadastro_animais_zoologico.controller.sec;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.atos.cadastro_animais_zoologico.model.UserModel;
import br.atos.cadastro_animais_zoologico.repository.UserRepository;



@Service // Indicar que uma classe de serviço
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {	

	private UserRepository userRepository;



	public UserDetailServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	

//Responsavel por carregar o o usuario buscando o seu nome no banco de dados ou seja caso o usuario não seja encontrado através do userName o mesmo não será carregado.
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserModel userModel = userRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Usuario não Encontrado" + username));                       
		
		return new User(userModel.getUsername(), userModel.getPassword(),true,true,true,true, userModel.getAuthorities() );
	}

}