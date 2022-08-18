package com.praticaintegrada.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praticaintegrada.entities.Patrimonio;
import com.praticaintegrada.repositories.PatrimonioRepository;

@Service
public class PatrimonioService {
	
	@Autowired
	private PatrimonioRepository repository;
	
	public List<Patrimonio>findAll(){
		return repository.findAll();
	}
	
	public Patrimonio findById(Long id) {
		Optional<Patrimonio> obj = repository.findById(id);
		return obj.get();
	}
}
