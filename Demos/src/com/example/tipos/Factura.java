package com.example.tipos;

import java.util.List;

public class Factura {
	public static enum Estado { PENDIENTE, CANCELADA, PAGADA }
	private int numero;
	private List<Linea> lineas;
	
	public class Linea {
		private int numeroLinea, cantidad, producto;
		private double precio;
		// private int numeroFactura;
		
		public int getNumeroFactura() {
			return numero;
		}

		public int getNumeroLinea() {
			return numeroLinea;
		}

		public void setNumeroLinea(int numeroLinea) {
			this.numeroLinea = numeroLinea;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			if(cantidad == this.cantidad) return;
			if(cantidad <= 0) throw new IllegalArgumentException("Tiene que ser mayor que 0");
			this.cantidad = cantidad;
		}

		public int getProducto() {
			return producto;
		}

		public void setProducto(int producto) {
			this.producto = producto;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public List<Linea> getLineas() {
			return lineas;
		}
	}
}
