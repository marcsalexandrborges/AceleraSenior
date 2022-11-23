package br.atos.cadastro_animais_zoologico.controller.sec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {
	
	//Responsavel por filtrar os acessos HTTP da aplicação e é usado para personalizar os acessos de acordo com o perfil do usuario.
		@Bean
		public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			
			http.csrf().disable().authorizeRequests()
			.antMatchers(HttpMethod.GET, "/").permitAll()
			.antMatchers(HttpMethod.GET,"/cadastrarCuidador").hasRole("ADMIN")
			.antMatchers(HttpMethod.POST, "/cadastraCuidador").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and().formLogin().permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/sair"));
			
			return http.build();
		}
		
		// Converte a senha em Cript
		@Bean
		public PasswordEncoder passwordEncoder() {
			return new BCryptPasswordEncoder();
		}
	
	

}
