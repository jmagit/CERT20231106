package com.example.tipos;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EjemploLambdas {
	@FunctionalInterface
	interface Compara<T> {
		int comp(T a, T b);
	}
	void run() {
		class ComparaDesc implements Compara<String> {
			@Override
			public int comp(String a, String b) {
				return -a.compareTo(b);
			}
		}
		String cads[] = { "u", "O", "a" };
		
		cads = ordena(cads, new ComparaDesc());
		cads = ordena(cads, new Compara<String>() {
			@Override
			public int comp(String a, String b) {
				return a.compareTo(b);
			}
		});
		cads = ordena(cads, (a, b) -> a.compareTo(b));
		cads = ordena(cads, (a, b) -> -a.toUpperCase().compareTo(b.toUpperCase()));
		Predicate<Integer> fn = item -> { 
			return item > 100; 
			};
		
		BiFunction<String, String, Integer> cmpBiFunction = (a, b) -> -a.toUpperCase().compareTo(b.toUpperCase());
		if(fn.and(fn).test(7)) {
			
		}
		
	}
	String[] ordena(String[] t, Compara<String> comparador) {
		int i = 0, j = 0;
		// ...
		if(comparador.comp(t[i], t[j]) < 0) {
			// ...
		} else if(comparador.comp(t[i], t[j]) == 0) {
			//...
		} else {
			// ...
		}
		// ...
		return t;
	}

	/*
	String[] ordena(String[] t, Tipo tipo) {
		int i = 0, j = 0;
		// ...
		switch (tipo) {
		case value:
			
			break;

		default:
			break;
		}
		if(t[i] < t[j]) {
			// ...
		} else if(t[i] == t[j]) {
			//...
		} else {
			// ...
		}
		// ...
		return t;
	}

	/*
	String[] ordena(String[] t) {
		int i = 0, j = 0;
		// ...
		if(t[i] < t[j]) {
			// ...
		} else if(t[i] == t[j]) {
			//...
		} else {
			// ...
		}
		// ...
		return t;
	}
	String[] ordenaDesc(String[] t) {
		int i = 0, j = 0;
		// ...
		if(t[i] > t[j]) {
			// ...
		} else if(t[i] == t[j]) {
			//...
		} else {
			// ...
		}
		// ...
		return t;
	}
	*/
}
