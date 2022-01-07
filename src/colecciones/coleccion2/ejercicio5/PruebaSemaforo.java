/**
 * Solución para el Ejercicio 5 de la Colección 2
 * @author Carlos Herrero
 */


package colecciones.coleccion2.ejercicio5;


public class PruebaSemaforo {

	public static void main(String[] args) {
        	Semaforo semaforo = new Semaforo();
        
        	System.out.println("El semáforo está en: "+semaforo.getColor());
        	
        	//se cmabia el estado directamente
        	semaforo.color = Semaforo.Colores.AMBAR;
        	// con un import se podría haber llamado con Colores.AMBAR
        	System.out.println("El semáforo ahora  está en: "+semaforo.getColor());


	}
}