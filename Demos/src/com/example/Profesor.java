package com.example;

import com.example.tipos.Grafico;
import com.example.tipos.Persistente;
import com.example.tipos.Persona;
import com.example.tipos.Todo;

public class Profesor extends Persona implements Todo {
	private double salario = 0;
//	private Profesor() {}
//	private Profesor(int i) {}
//	private Profesor(String i) {}
//	private Profesor(int i, int ii) {}
//	private Profesor(int i, String s) {}
	
	@Override
	public void calcula() {
		// TODO Auto-generated method stub
		
	}

	public Profesor(int edadLaboral, int id, String Nombre, String apellido, boolean interno) {
		super(edadLaboral, id, Nombre, apellido, interno);
		// TODO Auto-generated constructor stub
	}

	public Profesor(int id, String nombre, String apellido, double salario) {
		this(16, id, nombre, apellido, true);
		this.salario = salario;
	}

	public void salta() {
		super.salta();
		System.out.println("Salta profe");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Me han destruido");
		super.finalize();
	}
//	public static Profesor creaConEdad(int i) {
//		return new Profesor(i);
//	}
//	
//	public static Profesor creaConNombre(String i) {
//		return new Profesor(i);
//	}

	@Override
	public void pintate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dameNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
}
