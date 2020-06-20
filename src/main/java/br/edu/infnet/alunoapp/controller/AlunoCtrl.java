package br.edu.infnet.alunoapp.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.infnet.alunoapp.modelo.Aluno;

@Controller
public class AlunoCtrl {

	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String hello(Model model) {
		model.addAttribute("msg", "Ola mvc");
		model.addAttribute("data", new Date());
		return "home";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Model model, Aluno aluno ) {
		//salvar aluno no banco
		model.addAttribute("aluno", aluno);
		return "lista";
	}
	
}