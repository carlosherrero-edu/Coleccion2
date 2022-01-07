package colecciones.coleccion2.ejercicio15;

public class PruebaPunto {

	public static void main(String[] args) {
		// construyo el punto (3,4) y su simétrico (-3, -4)
		
		Punto punto1 = new Punto (3.0,  4.0);
		
		Punto punto2 = new Punto (-3.0,  -4.0);
		
		//muestro la información de los puntos
		punto1.infoPunto();
		punto2.infoPunto();
		
		System.out.format ("%n Distancia de PUnto 1 al 0,0:  %.2f",punto1.calcularDistancia());
		
		System.out.format ("%n Distancia de PUnto 1 a sí mismo %.2f",punto1.calcularDistancia(punto1));
		
		System.out.format ("%n Distancia de Punto 1 a Punto 2:  %.2f",punto1.calcularDistancia ( punto2));
		
		System.out.format ("%n Distancia de Punto 2 a Punto 1:  %.2f",punto2.calcularDistancia ( punto1));
		

	} //fin del main

}
