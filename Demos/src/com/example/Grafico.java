package com.example;

public interface Grafico {
	void pintate();
	default String dameNombre(){
		System.out.println("Por defecto");
		return null;
	}
}
