package com.algaworks.titulos.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.titulos.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	
}
