/**
 * Solución para el Ejercicio 6 de la Colección 2
 * @author Carlos Herrero
 */

package colecciones.coleccion2.ejercicio6;

	//Clase enumerada definida fuera de la clase principal
	enum EstadosSemaforo {
		ROJO,
		AMBAR,
		VERDE
		};


public class Semaforo{
	
		//definición de las propiedades
		
		private EstadosSemaforo estado ;
		private boolean parpadea;
		
		// definición de constructores
		
		public Semaforo () {
			this.estado =  EstadosSemaforo.ROJO;
			this.parpadea = false;
			
		}
		
		
		public Semaforo ( EstadosSemaforo estado,   boolean parpadea) {
			this. estado = estado;
			this.parpadea = parpadea;
			
		}
		
		
		//métodos que necesito 
		public EstadosSemaforo getEstado() {
			return this.estado;
		}
		
		//métodos que necesito 
		public boolean getParpadea() {
			return this.parpadea;
		}
		
		//método main() de prueba
		public static void main( String[] args) {
		    
		    Semaforo sema1= new Semaforo();
		    Semaforo sema2 = new Semaforo(EstadosSemaforo.VERDE, false);
		    
		    //visualizamos su estado
		    System.out.println ("El estado del Semáforo 1 es : " + sema1.getEstado());
		    System.out.println ("El estado del Semáforo 2 es : " + sema2.getEstado());
		}

	}  // fin de la clase.