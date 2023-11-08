package com.example;

public enum DiasLaborables {
	LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5);
	private byte valor;
	DiasLaborables(int valor) {
		this.valor = (byte)valor;
	}
	public byte getValue() { return valor; }
	public static DiasLaborables getEnum(byte valor) {
		switch (valor) {
		case 1: return LUNES;
		case 2: return MARTES;
		case 3: return MIERCOLES;
		case 4: return JUEVES;
		case 5: return VIERNES;
		default:
			throw new IllegalArgumentException("No es un dia valido");
		}
	}
}
