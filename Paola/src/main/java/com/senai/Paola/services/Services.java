package com.senai.Paola.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Paola.entities.Cliente;
import com.senai.Paola.repositories.repository;

@Service
public class Services {
	private final repository clienteRepository ;

@Autowired
	public Services(repository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	
	public Cliente getClienteById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
	
	//listar todos os produtos 
	public List<Cliente> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	} 


}