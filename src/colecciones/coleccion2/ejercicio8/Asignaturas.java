/**
 * Solución para el Ejercicio 8 de la Colección 2
 * @author Carlos Herrero
 */

package colecciones.coleccion2.ejercicio8;

//clase enumerada con los posibles cursos de una asignatura
	enum Curso {PRIMERO, SEGUNDO};

public class Asignaturas {
	
	
	
	//propiedades de la asignatura
	private String nombre;
	
	private int codigo;
	
	private Curso curso;
	
	//constructores
	public Asignaturas (String nombre, int codigo, Curso curso) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.curso = curso;
		
	}
	
	//métodos getXxX 
	
	public String getNombre() {
		return nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public Curso getCurso() {
		return curso;
	}
	
	//método para mostrar la información de la asignatura 
	public String dameInfo () {
		return "La asignatura "+this.getNombre()+ ", con el código "+ this.getCodigo()+
				", se cursa en "+ this.getCurso();
	}


}