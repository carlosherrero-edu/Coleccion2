/**
 * Solución para el Ejercicio 8 de la Colección 2
 * @author Carlos Herrero
 */

package colecciones.coleccion2.ejercicio8;

//import Ejercicio28.Asignaturas;

public class PruebaAsignaturas {
	
	public static void main (String[] args) {
		
		Asignaturas asignatura1 = new Asignaturas("Lenguajes de Marcas", 201, Curso.PRIMERO);
		
		Asignaturas asignatura2 = new Asignaturas("Desarrollo de entorno servidor", 221, Curso.SEGUNDO);
		
		System.out.println(asignatura1.dameInfo());
		
		System.out.println(asignatura2.dameInfo());
	}
}