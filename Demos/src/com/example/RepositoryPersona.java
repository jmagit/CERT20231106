package com.example;

import java.util.List;

import com.example.tipos.Persona;

public interface RepositoryPersona {
	List<Persona> getAll();
	Persona getOne(int id);
	Persona add(Persona item);
	Persona modify(Persona item);
	Persona delete(Persona item);
	Persona delete(int id);
}
