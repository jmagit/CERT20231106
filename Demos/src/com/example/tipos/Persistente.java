package com.example.tipos;

public interface Persistente {
	default void guardate() {
		System.out.println("Por defecto");
	}
	default String dameNombre(){
		System.out.println("Por defecto");
		return null;
	}
}
