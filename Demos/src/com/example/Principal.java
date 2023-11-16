package com.example;

import java.lang.annotation.Annotation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.example.ejemplos.EjemploGenericos;
import com.example.exceptions.*;
import com.example.repositorios.RepositoryPersonaImp;
import com.example.repositorios.RepositoryPersonaMock;
import com.example.tipos.Alumno;
import com.example.tipos.Color;
import com.example.tipos.Departamento;
import com.example.tipos.Empleado;
import com.example.tipos.Factura;
import com.example.tipos.Persona;
import com.example.tipos.Profesor;

/**
 * La clase principal
 */
public class Principal {
	private final static Logger LOGGER = Logger.getLogger(Principal.class.getName());

	/**
	 * Método principal que arranca la aplicacion
	 * 
	 * @param args argumentos de la linea de comando
	 */
	public static void main(String[] args) {
		LOGGER.setLevel(Level.SEVERE);
		// System.out.println("Hola clase");
		LOGGER.info("Arranco la aplicacion");
		var app = new Principal();
		app.listas();
		// System.out.println("Termino");
		LOGGER.info("Termino la aplicacion");
	}

	void paralelo() {
//		List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		listOfIntegers.parallelStream()
//			.map(p -> p * p)
//			.sequential()
//			.sorted()
//			.forEach(System.out::println);
	}
	void mapas() {
		Map<Integer, Persona> conj = new HashMap<>();
		var profe = new Profesor(1, "Profe1", "p1", false, LocalDate.of(1980, 1, 1), 2000);
		conj.put(1, profe);
		conj.put(2,new Alumno(2, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.put(3,new Alumno(3, "a3", "a3", false, LocalDate.of(2009, 12, 12), List.of(5,10)));
		conj.put(4,new Alumno(4, "a4", "a4", false, LocalDate.of(2005, 5, 4), List.of(10, 8, 5,10)));
		conj.put(1,new Alumno(1, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.put(22,new Profesor(22, "Profe2", "p2", false, LocalDate.of(2000, 1, 1), 1000));
		conj.put(33,new Alumno(33, "a33", "a1", false));

		System.out.println(conj.get(1));
	}
	void listas() {
		List<Persona> conj = new ArrayList<>();
		var profe = new Profesor(1, "Profe1", "p1", false, LocalDate.of(1980, 1, 1), 2000);
		conj.add(profe);
		conj.add(new Profesor(22, "Profe2", "p2", false, LocalDate.of(2000, 1, 1), 1000));
		conj.add(1, new Alumno(2, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.add(new Alumno(3, "a3", "a3", false, LocalDate.of(2009, 12, 12), List.of(5,10)));
		conj.add(new Alumno(4, "a4", "a4", false, LocalDate.of(2005, 5, 4), List.of(10, 8, 5,10)));
		conj.add(new Alumno(1, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.add(new Alumno(33, "a33", "a1", false));
		System.out.println(conj.get(1));
		conj.remove(0);
		System.out.println(conj.get(1));
		
	}	
	void colecciones() {
		Set<Persona> conj = new HashSet<>();
		var profe = new Profesor(1, "Profe1", "p1", false, LocalDate.of(1980, 1, 1), 2000);
		conj.add(profe);
		conj.add(new Alumno(2, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.add(new Alumno(3, "a3", "a3", false, LocalDate.of(2009, 12, 12), List.of(5,10)));
		conj.add(new Alumno(4, "a4", "a4", false, LocalDate.of(2005, 5, 4), List.of(10, 8, 5,10)));
		conj.add(new Alumno(1, "a1", "a1", false, LocalDate.of(1999, 1, 1), List.of(1,2,3)));
		conj.add(new Profesor(22, "Profe2", "p2", false, LocalDate.of(2000, 1, 1), 1000));
		conj.add(new Alumno(33, "a33", "a1", false));
//		System.out.println(conj.size());
//		for(var p: conj) {
//			System.out.println(p);
//		}
//		if(conj.contains(profe))
//			conj.remove(new Profesor(1, "xx", "", false, LocalDate.of(2000, 1, 1), 0));
//		System.out.println(conj.size());
//		for(var p: conj) {
//			System.out.println(p);
//		}
		//var query = 
//				.forEach(System.out::println);
		var total = conj.stream()
				.filter(p -> p instanceof Profesor)
				.map(p -> (Profesor)p)
				.mapToDouble(p -> p.getSalario())
				.average();
//		System.out.println(total);
//		conj.stream()
//			.filter(p -> p instanceof Alumno)
//			.map(p -> (Alumno)p)
//			.forEach(a -> System.out.println(a.toString() + " " + a.notaMedia()));
//		System.out.println(conj.stream()
//			.filter(p -> p instanceof Alumno)
//			.map(p -> (Alumno)p)
//			.flatMapToDouble(p -> p.getNotas().stream().mapToDouble(n->(double)n))
//			.average()
//		);
//		conj.stream()
//		.filter(p -> p.hasEdad())
//		.forEach(a -> System.out.println(a.toString() + " " + a.getEdad()));
//		conj.stream()
//		.filter(p -> p instanceof Alumno && p.hasEdad() && p.getEdad() >= 18)
//		//.dropWhile(p -> p instanceof Alumno && p.hasEdad() && p.getEdad() < 18)
//		//.takeWhile(p -> p instanceof Alumno && p.hasEdad() && p.getEdad() < 18)
//		.map(p -> (Alumno)p)
//		.sorted((a, b) -> -(int)(a.notaMedia() - b.notaMedia()))
//		.forEach(System.out::println);
//		System.out.println(".................");
//		int pag = 0, rows = 3;
//		conj.stream()
//			.skip(pag * rows)
//			.limit(rows)
//		    .sorted((a, b) -> a.getId() - b.getId())
//			.forEach(System.out::println);
		System.out.println(conj.stream().filter(p -> p.getId() == 33).findFirst().get());
//		conj.stream()
//		.filter(p -> p instanceof Alumno)
//		.map(p -> (Alumno)p)
//		.forEach(a -> a.addNota(10));
		sum = 0;
		conj.stream()
			.filter(p -> p instanceof Alumno)
			.map(p -> (Alumno)p)
			.peek(a -> sum += a.notaMedia())
			.forEach(a -> System.out.println(a.toString() + " " + a.notaMedia()));
		System.out.println(sum);
		sum = 0;
		
//		System.out.println(conj.stream()
//			.filter(p -> p instanceof Alumno)
//			.map(p -> ((Alumno)p).notaMedia())
//			.anyMatch(p -> p < 5)
//			? "Todos aprovados" : "Hay suspendidos"
//		);
//		System.out.println(conj.stream()
//			.filter(p -> p instanceof Alumno)
//			.map(p -> ((Alumno)p).notaMedia())
//			.reduce(0.0, (acumulado, actual) -> acumulado + actual));

		boolean soloMenores = false, paginado = true;
		int pag = 0, rows = 3;
		var query = conj.stream()
				.filter(p -> p instanceof Alumno)
				.map(p -> (Alumno)p);
		if(soloMenores)
			query = query.filter(p -> p.hasEdad() && p.getEdad() < 18);
		if(paginado)
			query = query
				.skip(pag * rows)
				.limit(rows);
		
		query.forEach(System.out::println);

	}
		double sum = 0.0;

	void ejemplos8() {
		var cad = "x";
		for(int i = 0; i < 100; i++) {
		 cad += "x";
		}
		System.out.println(cad);
		var sb = new StringBuilder("x");
		for(int i = 0; i < 100; i++) {
			sb.append("x");
		}
		System.out.println(sb.toString());
		
		var dep = new Departamento();
		System.out.println(dep.getLista()[0]);
		dep.getLista()[0] = new Empleado(1, "El", "Pesao", 3000);
		dep.getLista()[0].setApellido("Grilllloo");
		System.out.println(dep.getLista()[0].getApellido());
		System.out.println(dep.getLista()[0]);
		var e1 = new Empleado(1, "Manda", "Mas", 6000); 
		var e2 = new Empleado(1, "MA"+"nda", "Mas", 6000);
//		System.out.println(e1 == e2 ? "SI" : "No");
		System.out.println(e1.equals(e2) ? "SI" : "NO");
		System.out.println(e1.hashCode() == e2.hashCode() ? "SI" : "NO");
		System.out.println(e1.compareTo(e2) == 0 ? "SI" : "NO");
//		System.out.println(e1.getNombre()==e2.getNombre() ? "SI" : "No");
//		System.out.println(e1.getNombre().equals(e2.getNombre()) ? "SI" : "No");
//		System.out.println(dep.getJefe());
//		var emp = dep.getJefe();
//		emp.setSalario(0);
//		System.out.println(dep.getJefe());
		
		Comparator<Empleado> com = (a, b) -> a.getNombre().compareToIgnoreCase(b.getNombre());
		System.out.println(com.compare(e1, e2) == 0 ? "SI" : "NO");
		
	}
	void cotilla() {
		Color color;
		com.example.tipos.Color ccColor;
//		for(var m : Calculadora.class.getDeclaredMethods())
//			System.out.println(m.getName());
		try {
			var p = new Profesor(0, "Pepito", "Grillo", 1);
			//p.setSalario(-1);
			for(var m : p.getClass().getDeclaredFields())
				System.out.println(m.getName());
			var attr = p.getClass().getDeclaredField("salario");
			attr.setAccessible(true);
			attr.set(p, -1);
			System.out.println(p.getSalario());
			Annotation[] anotaciones = p.getClass().getAnnotations();
			for(var m : p.getClass().getAnnotations())
				System.out.println(m.annotationType().getName());
			
			System.out.println(p.getClass().getAnnotation(Autor.class).nombre());
		} catch (Exception e) {
			LOGGER.severe(e.getMessage());
		}
	}

	void ejemplos7() {
		try {
			var p = new Profesor(0, null, "Grillo", 0);
			p.setApellido("Grillo");
			System.out.println(p.getNombre().toUpperCase());
			p.setfNacimiento(LocalDate.of(2024, 11, 15));
			try {
				System.out.println(p.getfNacimiento().isEmpty() ? "No hay fecha" : p.getfNacimiento().get().getYear());
			} catch (NoSuchElementException e) {
			}
			if (p.hasEdad())
				System.out.println(p.getEdad());
			p.clearNacimiento();

			calcula();
		} catch (CalculadoraException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			LOGGER.severe(e.getMessage());
		} catch (Exception e) {
			LOGGER.severe(e.getMessage());
		}

	}

	void calcula() throws CalculadoraException {
		try (var calc = new Calculadora()) {
			calc.close();
			System.out.println(calc.suma(0.1, 0.2));
			System.out.println(calc.suma(1, -0.9));
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

	record Coordenada(int x, int y, int z) {
	}

	void ejemplos6() {
		var cads = List.of("u", "O", "a");
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
		// p = new EjemploGenericos.Elemento<Integer>("28", "Madrid");
		var g = new EjemploGenericos.Elemento<Character, String>('M', "Mujer");
		var otro = new EjemploGenericos.Elemento<String, Character>("Mujer", 'M');
		g.setKey('H');
		;
		Object object = 4; // new Integer(4)
		int i = 1 + (int) object; // object.value()
		object = "4";
		System.out.println(Integer.parseInt((String) object) + 2);
		object = p;
		if (object instanceof EjemploGenericos.Elemento v) {
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
