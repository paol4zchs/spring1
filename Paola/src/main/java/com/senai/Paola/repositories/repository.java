package com.senai.Paola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Paola.entities.Cliente;

public interface repository extends JpaRepository <Cliente, Long> {
	

}
