package colecciones.coleccion2.ejercicio12;


public class Punto {
	
	//constantes finales
	private final double origenX=0.0;
	private final double origenY=0.0;
	
	//propiedades, que serán las coordenadas del punto
	private double coordX;
	private double coordY;
	
	// constructor sin parámetros
	public Punto(){
		this.coordX= origenX;
		this.coordY= origenY;
		
	}
	
	//constructor con parámetros
	public Punto(double x, double y){
		coordX= x;
		coordY= y;
	}

	//métodos getXxx y setXxx
	public double getCoordX() {
		return coordX;
	}

	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}

	public double getCoordY() {
		return coordY;
	}

	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	 // método para devolver en un solo string las coordenadas del punto
	public void infoPunto(){
		System.out.format("%n Punto ( Posición X  : %.2f,  Posición Y:  %.2f)", this.coordX, this.coordY);
	}
	
	//método para calcular la distancia a otro punto del que pasamos las coordenadas
	public double calcularDistancia (double otroX, double otroY){
		
		return Math.sqrt(Math.pow(this.getCoordX()-otroX, 2)+Math.pow(this.getCoordY()- otroY, 2));
	}
	
	//método para calcular la distancia al origen, usando sobrecarga
	public double calcularDistancia (){
			
		return Math.sqrt(Math.pow(this.getCoordX()-origenX, 2)+Math.pow(this.getCoordY()- origenY, 2));
	}
	
} // fin de la clase
	



