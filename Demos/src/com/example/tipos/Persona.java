package com.example.tipos;

public abstract class Persona {
	public static final int EDAD_JUBILACION = 67;
	public final int EDAD_LABORAL;
	private static int contador = 0;
	private int id;
	private String nombre, apellido;
	boolean interno = true;

	public Persona() {
		EDAD_LABORAL = 16;
	}

	public Persona(int eDAD_LABORAL, int id, String nombre, String apellido, boolean interno) {
		super();
		EDAD_LABORAL = eDAD_LABORAL;
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.interno = interno;
	}

	protected void salta(int i) {
		System.out.println("Salta persona");
	}

	public void otro() {
		salta();

	}

	public static void reset() {
		contador = 0;
	}

	public abstract void calcula();
}
