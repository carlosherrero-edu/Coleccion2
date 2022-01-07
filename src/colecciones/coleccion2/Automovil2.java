/**
 * Solución para el Ejercicio 2 de la Colección 2
 * @author Carlos Herrero
 */

package colecciones.coleccion2;

public class Automovil2 {
    
    //indicamos los tipos enumerados que vamos a usar
    enum TipoPintura { METALIZADA, NO_METALIZADA};
    
    enum TipoAutomovil {MINI, UTILITARIO, FAMILIAR,DEPORTIVO};

    
    //propiedades de la clase
    private String modelo;
    private String color;
    private TipoPintura pintura;
    private int año;
    private TipoAutomovil tipo;

    
    //métodos de la clase
    public String leePropiedades() {
	return   "Modelo :"+modelo+" * Color: "+color;
    }
    
    //prueba creando un objeto
    public static void main(String[] args) {
	
	Automovil2 miAuto= new Automovil2();
	miAuto.modelo="Renault Scenic";
	miAuto.color = "Azul oscuro";

	
	System.out.println( "Información de mi automóvil \n " + miAuto.leePropiedades());

    

    
}
    

}
