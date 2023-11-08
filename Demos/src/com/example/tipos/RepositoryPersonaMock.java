package com.example.tipos;

import java.util.List;

import com.example.RepositoryPersona;

public class RepositoryPersonaMock implements RepositoryPersona {

	@Override
	public List<Persona> getAll() {
		System.out.println("Soy el falso");
		return null;
	}

	@Override
	public Persona getOne(int id) {
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
	public Persona delete(Persona item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
