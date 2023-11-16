package com.example.tipos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;
import java.util.Optional;

public abstract class Persona implements Comparable<Persona> {
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
	public Persona(int id, String nombre, String apellido, boolean interno, LocalDate fNacimiento) {
		this(16, id, nombre, apellido, interno);
		setfNacimiento(fNacimiento);
	}

	public int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		if(nombre == null || "".equals(nombre.trim())) 
			throw new IllegalArgumentException("Nombre invalido");
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		assert apellido != null : "El apellido esta a nulo";
		this.apellido = apellido;
	}
	
	
	public Optional<LocalDate> getfNacimiento() {
		if(fNacimiento == null)
			return Optional.empty();
		else {
			return Optional.of(fNacimiento);
		}
//		return Optional.ofNullable(fNacimiento);
	}
	public void setfNacimiento(LocalDate fNacimiento) {
		if(fNacimiento == null)
			throw new IllegalArgumentException("Es obligatoria la fecha");
		this.fNacimiento = fNacimiento;
		this.edad = (int) fNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
		assert edad >= 0 : "Error calculo de edad";
	}
	public void clearNacimiento() {
		this.fNacimiento = null;
		this.edad = -1;
	}
	public boolean hasEdad() {
		return fNacimiento != null;
	}

	public int getEdad() {
		if(fNacimiento == null)
			throw new IllegalArgumentException("Es obligatoria la fecha");
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
	@Override
	public int compareTo(Persona o) {
		return edad - o.edad;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Persona))
			return false;
		Persona other = (Persona) obj;
		return id == other.id;
	}
	
}
