package com.example;

import java.util.Objects;

public class Empleado implements Cloneable, Comparable<Empleado> {
	private int id;
	private String nombre, apellido;
	private double salario = 0;
	private int[] vacaciones = new int[10];

	private double salarioBruto = 0;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(int id, String nombre, String apellido, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	private void algo() {
		salarioBruto = salario * 1.31;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return id == other.id;
	}

	@Override
	public Empleado clone() {
//		var copia = new Empleado();
//		copia.id = id;
//		copia.nombre = nombre;
//		copia.apellido = apellido;
//		copia.salario = salario;
//		copia.vacaciones = vacaciones.clone();
//		return copia;
		try {
			var copia = (Empleado) super.clone();
			copia.vacaciones = vacaciones.clone();
			return copia;
		} catch (CloneNotSupportedException e) {
			return null;
		}
//		try {
//			return (Empleado)super.clone();
//		} catch (CloneNotSupportedException e) {
//			return null;
//		}
	}

	@Override
	public int compareTo(Empleado o) {
		return id - o.id;
	}

}
