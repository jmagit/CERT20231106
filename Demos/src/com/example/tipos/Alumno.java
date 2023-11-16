package com.example.tipos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
	private List<Integer> notas = new ArrayList<>();
	
	public Alumno(int edadLaboral, int id, String Nombre, String apellido, boolean interno) {
		super(edadLaboral, id, Nombre, apellido, interno);
		// TODO Auto-generated constructor stub
	}

	public Alumno(int id, String nombre, String apellido, boolean interno, LocalDate fNacimiento, List<Integer> notas) {
		super(id, nombre, apellido, interno, fNacimiento);
		this.notas = notas;
	}

	public Alumno(int id, String nombre, String apellido, boolean interno) {
		this(16, id, nombre, apellido, interno);
	}

	public List<Integer> getNotas() {
		return notas.stream().toList();
	}
	@Override
	public void calcula() {
		// TODO Auto-generated method stub
		
	}

	public void addNota(int nota) {
		if(0 > nota || nota > 10)
			throw new IllegalArgumentException("Nota fuera de rango");
		notas.add(nota);
	}
	public double notaMedia() {
		return notas.stream().mapToDouble(item -> (double)item).average().orElse(0);
	}

	@Override
	public String toString() {
		return "Alumno [notas=" + notas + ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getfNacimiento()=" + getfNacimiento() + "]";
	}
	
}
