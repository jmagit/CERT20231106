package com.example;

import java.util.List;

import com.example.exceptions.CalculadoraException;
import com.example.tipos.EjemploGenericos;
import com.example.tipos.Factura;
import com.example.tipos.Persona;
import com.example.tipos.RepositoryPersonaImp;
import com.example.tipos.RepositoryPersonaMock;

/**
 * La clase principal
 */
public class Principal {

	/**
	 * Método principal que arranca la aplicacion
	 * 
	 * @param args argumentos de la linea de comando
	 */
	public static void main(String[] args) {
		System.out.println("Hola clase");
		var app = new Principal();
		app.ejemplos7();
		System.out.println("Termino");
	}

	void ejemplos7() {
		try {
			calcula();
		} catch (CalculadoraException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	void calcula() throws CalculadoraException {
		try(var calc=new Calculadora()) {
			calc.close();
			System.out.println(calc.divide(1.0, 0));
		} catch (ArithmeticException e) {
//		System.err.println("Division por 0");
			throw new CalculadoraException("Division por 0", e);
		} catch (Exception e) {
			System.err.println(e.getMessage());			
		}
//		var calc=new Calculadora();
//		try {
//			
//			System.out.println(calc.divide(1.0, 10));
//			System.out.println(calc.divide(1, 0));
//		} catch(ArithmeticException e) {
////			System.err.println("Division por 0");
//			throw new CalculadoraException("Division por 0", e);
//		} catch (Exception e) {
//			System.err.println(e.getMessage());
//		} finally {
//			try {
//				System.out.println(calc.divide(1.0, 0));
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//			System.out.println("Paso siempre");
//		}
	}
	void pinta(String cad) {
		 System.out.println(cad.toUpperCase());
	}
	
	class Punto {
		private int x, y;

		public Punto(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
	}
	record Coordenada(int x, int y, int z) {}
	
	void ejemplos6() {
		 var cads = List.of("u", "O", "a" );
		 var p = new Punto(10, 10);
		 p = new Punto(5, 10);
		 System.out.println(p);
		 var c = new Coordenada(10, 10, 5);
		 System.out.println(c);
//		 cads.forEach(item -> System.out.println(item));
//		 cads.forEach(System.out::println);
		 cads.forEach(this::pinta);
		
	}
	void ejemploG(EjemploGenericos.Elemento<? extends Persona, String> p) {
		p.getKey().getNombre();
	}
	void ejemplos5() {
		var lst1 = new EjemploGenericos.Lista<Persona>();
		lst1.add(new Profesor(0, null, null, 0));
		lst1.add(new Alumno(0, null, null, false));
		var profes = new EjemploGenericos.Lista<Profesor>();
		profes.add(new Profesor(0, null, null, 0));
		// profes.add(new Alumno(0, null, null, false));
		
		var p = new EjemploGenericos.Elemento<Integer, String>(28, "Madrid");
//		ejemploG(p);
		p.setKey(1);
		//p =  new EjemploGenericos.Elemento<Integer>("28", "Madrid");
		var g = new EjemploGenericos.Elemento<Character, String>('M', "Mujer");
		var otro = new EjemploGenericos.Elemento<String, Character>("Mujer", 'M');
		g.setKey('H');;
		Object object = 4; // new Integer(4)
		int i = 1 + (int)object; // object.value()
		object = "4";
		System.out.println(Integer.parseInt((String)object) + 2);
		object = p;
		if(object instanceof EjemploGenericos.Elemento v) {
			v.setKey("4");
		}
	}

	void ejemplos4() {
		byte diaDeLaSemana = 0;
		DiasDeLaSemana d1 = DiasDeLaSemana.DOMINGO;
		DiasLaborables d2 = DiasLaborables.LUNES;
		if (d1 == DiasDeLaSemana.LUNES) {

		}
		try {
			d2 = DiasLaborables.getEnum((byte) 5);

		} catch (Exception e) {
			System.err.println(e.getMessage());
			return;
		} finally {
			System.out.println("Paso siempre");
		}
		System.out.println(d2);
		ICalculadora calc = new Calculadora();
		System.out.println(calc.suma(1, 3));
		System.out.println(calc.avg(1, 2));
		System.out.println(calc.avg(1, 2, 3));
		var p = new Profesor(1, "Pepito", "Grillo", 2000.0);
		Persona.reset();
		p.otro();
		((Profesor) p).salta();
		p = null;
		System.runFinalization();
		System.out.println("Ni caso");
		var x = Factura.Estado.PENDIENTE;

		Repository<Persona, Integer> dao = new RepositoryPersonaImp();
		dao = new RepositoryPersonaMock();
		dao.getAll();
	}

	static void ejemplos3() {
		var i = 6;
		i += 4;
		i = i + 4;
		i = 4;
		System.out.println(((double) 5 / 0) * 0);
		System.out.println(0.1 + 0.2);
		System.out.println(1 - 0.9 + 2);
		boolean b = true;
		String s = "null";
		if (s != null && s.length() > 0) {
		}
		if (s.length() > i++) {
		}
		Object o = s;
		if (o instanceof String) {
			String x = (String) o;
			i = x.length();

		}
		if (o instanceof String x) {
			i = x.length();

		}
//		switch (o) {
//		case String x:
//			i = x.length();
//			
//		}
		switch (i) {
		case 1:
			i += 1;
		case 2, 3:
			i += 1;
			break;

		default:
			break;
		}
		s = switch (i) {
		case 1:
			yield "Lunes";
		case 2:
			yield "Marte";
		default:
			yield "Otro dia";
		} + " dia de lasema";
		s = switch (i) {
		case 1, 3, 5 -> "Inpar";
		case 2, 4, 6 -> "Marte";
		default -> "Otro dia";
		} + " dia de lasema";
	}

	static void ejemplos2() {
		int[] t = { 1, 2, 3 };
		System.out.println(t.length);
		t[1] = 666;
		System.out.println(t[1]);
		// t = new int[2];
		int tt[] = t.clone();
		t[1] = 666;
		System.out.println(t.length);
		System.out.println(t[1]);
		int m[][] = { { 1, 2 }, { 3, 4 } };
		m = new int[8][8];
		var aux = m[1];
		m[1] = m[0];
		m[0] = aux;
		System.out.println(m[1][1]);
		m[1] = t;
		System.out.println(m[0][2]);
		for (int k = 0, jj = 0; k < tt.length; k++, jj--) {

		}
		int k = 0;
		int i = 0;
		for (int item : tt) {
			i += item;
		}

//		eti:
//		while(true) {
//			//...
//			if(i < 0) break;
//			// ...
//			if(m.length > 10) break;
//			// ...
//			while(true) {
//				//...
//				break eti;
//				// ...
//				if(m.length > 10) break;
//				// ...
//				
//			}
//			switch (i) {
//			case 1:
//				i += 1;
//			case 2, 3:
//				i += 1;
//				break eti;
//
//			default:
//				break;
//			}
//		
//		}
//		while(i < 0) {
//			// ...
//			if(m.length <= 10) continue;
//				// ...
//				if(mm.length > 10) continue;
//				}
//				}
//			}
//		}

	}

	static void ejemplos1() {
		int a, b, c = 0;
		final int id; // = c * 10;
		short j = 1;
		a = b = (c = 1) + 1;
		a = j;
		j = 'a';
		j = (short) c;
		var s = 1;
		var x = System.getenv();
		b = 1;
		a = b + c;
		id = s - 1;
		System.out.println(id + "->" + (--s));
		// id = 2;
		Object object = "kk";
		String cad = Integer.toString(4);
		cad = (String) object;
	}

	/**
	 * Calcula el resultado de la opercion
	 * 
	 * @param a operando 1
	 * @param b operando 2
	 * @return resta de los operandos
	 */
	public double calcula(double a, double b) {
		return a - b;
	}

	private double suma(double opedador1, double opedador2) {
		return opedador1 + opedador2;
	}

}
