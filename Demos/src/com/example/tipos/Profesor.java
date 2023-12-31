package com.example.tipos;

import java.time.LocalDate;

import com.example.Autor;

@Autor(nombre = "Yo mismo")
public class Profesor extends Persona implements Todo {
	private double salario = 0;
//	private Profesor() {}
//	private Profesor(int i) {}
//	private Profesor(String i) {}
//	private Profesor(int i, int ii) {}
//	private Profesor(int i, String s) {}
	
	@Override
	@Autor(nombre = "Otro")
	public void calcula() {
		// TODO Auto-generated method stub
		
	}

	public Profesor(@Autor(nombre = "Otro") int edadLaboral, int id, String Nombre, String apellido, boolean interno) {
		super(edadLaboral, id, Nombre, apellido, interno);
		// TODO Auto-generated constructor stub
	}

	public Profesor(int id, String nombre, String apellido, double salario) {
		this(16, id, nombre, apellido, true);
		setSalario(salario);
	}

	public Profesor(int id, String nombre, String apellido, boolean interno, LocalDate fNacimiento, double salario) {
		super(id, nombre, apellido, interno, fNacimiento);
		this.salario = salario;
	}

	@Deprecated
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario < 0)
			throw new IllegalArgumentException("No puede ser negativo");
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

	@Override
	public String toString() {
		return "Profesor [salario=" + salario + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getfNacimiento()=" + getfNacimiento() + "]";
	}
	
}
