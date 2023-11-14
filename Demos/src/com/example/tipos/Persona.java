package com.example.tipos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Persona {
	public static final int EDAD_JUBILACION = 67;
	public final int EDAD_LABORAL;
	
	private static int contador = 0;
	
	private int id;
	private String nombre, apellido;
	boolean interno = true;
	LocalDate fNacimiento;
	
	private transient Integer edad = null;
		
	static {
		contador = 0;
	}
	
//	public Persona() {
//		EDAD_LABORAL = 16;
//	}

	public Persona(int edadLaboral, int id, String Nombre, String apellido, boolean interno) {
		super();
		EDAD_LABORAL = edadLaboral;
		this.id = id;
		setNombre(Nombre);
		this.apellido = apellido;
		this.interno = interno;
	}
	public Persona(int id, String nombre, String apellido, boolean interno) {
		this(16, id, nombre, apellido, interno);
	}

	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		if(nombre == null || "".equals(nombre.trim())) throw new IllegalArgumentException("Nombre invalido");
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	protected LocalDate getfNacimiento() {
		return fNacimiento;
	}
	protected void setfNacimiento(LocalDate fNacimiento) {
		this.fNacimiento = fNacimiento;
		this.edad = (int) fNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);;
	}
	protected int getEdad() {
		return edad;
	}

	protected void salta() {
		System.out.println("Salta persona");
	}

	public void otro() {
		salta();

	}

	public Persona otroMas() {
		return this;

	}


	public static void reset() {
		contador = 0;
	}

	public abstract void calcula();
	
	public <T> T generico(T param) {
		return param;
	}
}
