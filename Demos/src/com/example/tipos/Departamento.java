package com.example.tipos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Departamento {
	Empleado jefe = new Empleado(1, "Manda", "Mas", 6000);
	List<Empleado> lista = new ArrayList<Empleado>();
	Set<Empleado> conjunto = new HashSet<>();
	public Departamento() {
		// TODO Auto-generated constructor stub
	 lista.add(new Empleado(2, "Pepito", "Grillo", 1000));
	 lista.add(0, jefe);
	 lista.add(new Empleado(2, "Pepito", "Grillo", 1000));
	 conjunto.add(new Empleado(2, "Pepito", "Grillo", 1000));
	 conjunto.add(jefe);
	 conjunto.add(new Empleado(2, "Pepito", "Grillo", 1000));
	}
	
	public Empleado getJefe() {
		return jefe.clone();
	}

	public Empleado[] getLista() {
		return (Empleado[]) lista.toArray();
	}
//	public void setLista(Empleado[] lista) {
//		this.lista = lista;
//	}
	
	

}
