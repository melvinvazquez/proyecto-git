package com.ittg.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ittg.api.dao.IClienteDao;

@Controller
public class ClienteController {
	@Autowired
	private IClienteDao clienteDao;
	@RequestMapping(value="/listar",method=RequestMethod.GET)
public String listar(Model model) {
	model.addAttribute("titulos","listado de clientes");
	model.addAttribute("clientes",clienteDao.findAll());
	return "listar";
}
}
