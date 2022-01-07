package colecciones.coleccion2.ejercicio12;

public class PruebaPunto {

	public static void main(String[] args) {
		// construyo el punto (3,4)
		
		Punto punto1 = new Punto (3.0,  4.0);
		
		//imprimo el punto
		punto1.infoPunto();
		
		System.out.format ("%n Distancia al 0,0:  %.2f",punto1.calcularDistancia());
		
		System.out.format ("%n Distancia al simétrico:  %.2f",punto1.calcularDistancia ( -3.0, -4.0));
		
		System.out.format ("%n Distancia al 2,-3:  %.2f",punto1.calcularDistancia (2.0, -3.0));
		

	} //fin del main

}
