package com.example;

public class Calculadora {
	public double suma(double o1, double o2) {
		return o1 + o2;
	}
	public double avg(double o1, double o2, double ...resto) {
		double result = o1 + o2;
		for(var d: resto) result += d;
		return result / (resto.length + 2);
	}
	public double avg(int o1, int o2, int ...resto) {
		int result = o1 + o2;
		for(var d: resto) result += d;
		return result / (resto.length + 2);
	}
	public double avg(int o1, int o2, int o3) {
		int result = o1 + o2 + o3;
		return result / 3;
	}
}
