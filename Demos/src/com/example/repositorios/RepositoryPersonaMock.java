package com.example.repositorios;

import java.util.List;

import com.example.tipos.Persona;


public class RepositoryPersonaMock implements PersonaRepository {

	@Override
	public List<Persona> getAll() {
		System.out.println("Soy el falso");
		return null;
	}

	@Override
	public Persona getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona add(Persona item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona modify(Persona item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Persona item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBy(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
