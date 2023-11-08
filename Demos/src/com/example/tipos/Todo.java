package com.example.tipos;

public interface Todo extends Grafico, Persistente {
	default String dameNombre(){
		System.out.println("El mio");
		return null;
	}

}
