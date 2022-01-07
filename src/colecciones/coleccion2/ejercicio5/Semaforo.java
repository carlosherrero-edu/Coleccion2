/**
 * Solución para el Ejercicio 5 de la Colección 2
 * @author Carlos Herrero
 */


package colecciones.coleccion2.ejercicio5;

public class Semaforo {

	// definifición de tipos enumerados
	
	enum Colores { ROJO, AMBAR, VERDE };
	
	// propiedades. Las dejamos con visibilidad de paquete para poder modificarlas desde otra clase
	
	 Colores color= Colores.ROJO;
	  boolean parpadeo= false;

	// metodos get

	public Colores getColor()
	{
		return this.color;
	}

	public boolean getParpadeo()
	{
		return this.parpadeo;
	}


}
