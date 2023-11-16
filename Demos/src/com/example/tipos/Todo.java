package com.example.tipos;

import com.example.Grafico;

public interface Todo extends Grafico, Persistente {
	default String dameNombre(){
		System.out.println("El mio");
		return null;
	}

}
