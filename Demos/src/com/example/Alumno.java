package com.example;

import com.example.tipos.Persona;

public class Alumno extends Persona {
	private int[] notas = new int[10];
	
	public Alumno(int edadLaboral, int id, String Nombre, String apellido, boolean interno) {
		super(edadLaboral, id, Nombre, apellido, interno);
		// TODO Auto-generated constructor stub
	}

	public Alumno(int id, String nombre, String apellido, boolean interno) {
		this(16, id, nombre, apellido, interno);
	}


	@Override
	public void calcula() {
		// TODO Auto-generated method stub
		
	}

}
