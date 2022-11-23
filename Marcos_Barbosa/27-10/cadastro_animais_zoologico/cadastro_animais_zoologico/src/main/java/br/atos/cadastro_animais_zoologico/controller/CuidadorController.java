package br.atos.cadastro_animais_zoologico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.atos.cadastro_animais_zoologico.model.Cuidador;
import br.atos.cadastro_animais_zoologico.model.Jaula;
import br.atos.cadastro_animais_zoologico.model.Animal;
import br.atos.cadastro_animais_zoologico.repository.CuidadorRepository;
import br.atos.cadastro_animais_zoologico.repository.JaulaRepository;
import br.atos.cadastro_animais_zoologico.repository.AnimalRepository;

@Controller
public class CuidadorController {

	@Autowired // Inicializa a classe CuidadorRepository em todas as chamadas
	CuidadorRepository cuidadorRepository;

	AnimalRepository AnimalRepository;

	// Acessa a pagina de cadastrar o Cuidador
	@RequestMapping(value = "/cadastrarCuidador", method = RequestMethod.GET) // Direciona o usuario para a pagina
																				// cadastroTitularHtml.html
	public String cadastroCuidador() {

		return "cadastroCuidadorHtml";
	}

	// Metodo POST acionado pelo formulario de cadastrar um novo titular
	@RequestMapping(value = "/cadastrarCuidador", method = RequestMethod.POST) // Metodo post que recebe a entidade
	// Metodo post que recebe a entidade
	public String cadastroCuidador(Cuidador cuidador) {
		cuidadorRepository.save(cuidador);
		return "redirect:/cuidadoresTabela";
	}

	// Responsavel por direcionar e listar todos os cuidadores que foram encontrados
	// no banco de dados
	@RequestMapping(value = "/cuidadoresTabela") // Metodo get que envia a lista de titulares
	public ModelAndView listarCuidadores() {
		ModelAndView cuidadorModelAndView = new ModelAndView("listarCuidadoresHtml"); // Objeto que recebe o "endereço
																						// // de uma pagina HTML" e um
																						// ou // mais objetos que também
																						// podem // ser uma lista.
		Iterable<Cuidador> cuidadores = cuidadorRepository.findAll(); // Busca todos cuidadors no banco de dados
		cuidadorModelAndView.addObject("cuidadores", cuidadores);// Adiciona a lista de cuidadors no objeto
																	// "ModelAndView";

		return cuidadorModelAndView;

	}

	// Responsavel por deletar um cuidador com base no ID que está sendo enviado no
	// PATH (URL)
	@RequestMapping(value = "/deletarCuidador/{id}", method = RequestMethod.GET)
	public String deletarCuidadorMetodo(@PathVariable("id") long idReq) {
		Cuidador cuidador = cuidadorRepository.findById(idReq); // Buscar o cuidador pelo ID
		cuidadorRepository.delete(cuidador); // Acionar o metodo de deletar da classe CRUD REPOSITORY

		return "redirect:/cuidadoresTabela";

	}

	// Responsavel por direcionar o usuario para o formulario de edição que já esta
	// preenchido com os dados do cuidador selecionado
	@RequestMapping(value = "/editarCuidador/{id}", method = RequestMethod.GET)
	public ModelAndView editarCuidadorMetodo(@PathVariable("id") long idReq) {
		Cuidador cuidador = cuidadorRepository.findById(idReq);

		ModelAndView cuidadorAndView = new ModelAndView("editarcuidador");
		cuidadorAndView.addObject("cuidador", cuidador);

		return cuidadorAndView;
	}

	@PostMapping(value = "/atualizarcuidador")
	public String atualizarCuidador(Cuidador cuidador) {
		long id = cuidador.getId();
		cuidadorRepository.save(cuidador);

		return "redirect:/cuidadorsTabela";

	

	}
}
