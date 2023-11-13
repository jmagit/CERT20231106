package com.example.tipos;

public class EjemploGenericos {

	public static class Lista<T extends Persona> {
		public void add(T item) {
			
		}
	}

	public static class Elemento<K, V> {
 		private K key;
 		private V value;
		public Elemento(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
 	}
/*
	public static class Elemento {
 		private Object key;
 		private String value;
		public Elemento(Object key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		protected Object getKey() {
			return key;
		}
		protected void setKey(Object key) {
			this.key = key;
		}
		protected String getValue() {
			return value;
		}
		protected void setValue(String value) {
			this.value = value;
		}
 	}

/*
	public static class ElementoInt {
 		private int key;
 		private String value;
		public ElementoInt(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		protected int getKey() {
			return key;
		}
		protected void setKey(int key) {
			this.key = key;
		}
		protected String getValue() {
			return value;
		}
		protected void setValue(String value) {
			this.value = value;
		}
 	}
	public static class ElementoChar {
 		private char key;
 		private String value;
		public ElementoChar(char key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		protected char getKey() {
			return key;
		}
		protected void setKey(char key) {
			this.key = key;
		}
		protected String getValue() {
			return value;
		}
		protected void setValue(String value) {
			this.value = value;
		}
 	}
*/
}
