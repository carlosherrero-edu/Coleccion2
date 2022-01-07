/**
 * Solución para el Ejercicio 7 de la Colección 2
 * @author Carlos Herrero
 */

package colecciones.coleccion2.ejercicio7;


public class PruebaSemaforo {

	public static void main(String[] args) {
	    
	    	//creamos los 2 objetos semáforo
        	Semaforo sema1= new Semaforo();
        	Semaforo sema2= new Semaforo(EstadosSemaforo.AMBAR, true);
        	
        	//mostramos sus propiedades
        	System.out.println("Semáforo 1:");
        	System.out.println("\t Estado: "+sema1.getEstado() +"\t ¿Parpadea?: "+ sema1.getParpadea());
        	
        	
        	System.out.println("\nSemáforo 2:");
        	System.out.println("\t Estado: "+sema2.getEstado() +"\t ¿Parpadea?: "+ sema2.getParpadea());


	}
}