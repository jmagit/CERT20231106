package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculadora implements ICalculadora {
	private double toDouble(double o) {
		return (new BigDecimal(o))
				.setScale(16, RoundingMode.HALF_DOWN)
				.doubleValue();
	}
	
	@Override
	public double suma(double o1, double o2) {
		return o1 + o2;
	}
	@Override
	public double avg(double o1, double o2, double ...resto) {
		double result = o1 + o2;
		for(var d: resto) result += d;
		return result / (resto.length + 2);
	}
	@Override
	public double avg(int o1, int o2, int ...resto) {
		int result = o1 + o2;
		for(var d: resto) result += d;
		return result / (resto.length + 2);
	}
	@Override
	public double avg(int o1, int o2, int o3) {
		int result = o1 + o2 + o3;
		return result / 3;
	}
}
