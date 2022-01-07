package colecciones.coleccion2.ejercicio9;

public class PruebaPunto {

	public static void main(String[] args) {
		//refencia a 4 objetos de la clase Punto, SIN CREARLOS
		Punto punto1,punto2, punto3, punto4;
		
		 //punto (0,0)
		punto1 = new Punto();
		// punto (1,5)
		punto2 = new Punto (1.0 ,5.0);
		//punto (8,20)
		punto3= new Punto (8.0, 20.0);
		
		//punto medio entre (1,5) y (8.20)
		punto4 =new Punto ( (1.0+8.0)/2   , (5.0+20.0)/2);
		
		//también podría haberse consruido de esta forma
		Punto punto5 = new Punto ((punto2.getCoordX()+punto3.getCoordX())/2, (punto2.getCoordY()+punto3.getCoordY())/2);
		
		punto1.dameInfoPunto();
		punto2.dameInfoPunto();
		punto3.dameInfoPunto();
		punto4.dameInfoPunto();
		//punto5.dameInfoPunto();
		

	}

}
