package com.senai.Paola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Paola.entities.Cliente;
import com.senai.Paola.services.Services;

@RestController
@RequestMapping("/clientes")
public class controller {

	private final Services clienteService;

	@Autowired
	public controller (Services clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente createProduct(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping
	public List<Cliente> getAllClientes(){
		return clienteService.getAllClientes();
	}
	
	@GetMapping("/{idcCliente}")
	public Cliente getProduto(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	@DeleteMapping
	public void deleteProduto(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
	
}