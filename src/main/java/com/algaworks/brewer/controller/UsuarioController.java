package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.brewer.model.Usuario;

@Controller
public class UsuarioController {	
		
		@RequestMapping("/usuarios/novo")
		public String novo(Usuario usuario) {		
			return "usuario/CadastroUsuario";
		}
}
