/**
 * Solución para el Ejercicio 7 de la Colección 2
 * @author Carlos Herrero
 */


package colecciones.coleccion2.ejercicio7;

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
			this.setEstado(  EstadosSemaforo.ROJO);
			this.setParpadea(false);
			
		}
		
		
		public Semaforo ( EstadosSemaforo estado,   boolean parpadea) {
		    	//usamos los métodos set para asignar los valores
			setEstado(estado);
			setParpadea(  parpadea);
			
		}
		
		
		//métodos set para modificar las propiedades
		public void  setEstado( EstadosSemaforo estado) {
			this.estado = estado;
		}
		
		public void setParpadea(boolean parpadea ){
			 this.parpadea = parpadea;
		}
		
		
		//métodos get() para recuperar las propiedades
		public EstadosSemaforo getEstado() {
			return this.estado;
		}
		
		public boolean getParpadea() {
			return this.parpadea;
		}

	}  // fin de la clase.