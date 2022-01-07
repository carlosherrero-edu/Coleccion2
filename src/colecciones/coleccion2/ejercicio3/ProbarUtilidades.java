/**
@author Carlos Herrero
*/
package colecciones.coleccion2.ejercicio3;

/*
* Si se importan las enumeraciones, no es necesario referirse a ellas anteponiendo el nombre de la clase de Utilidades
* En caso contrario - comenntando la línea import- , debe antecederse con el nombre
* Cada utilidad genera su propio archivo .class  (de hecho son clases especiales)
* Por ello se importan como si "Utilidades" fuese un "paquete" que las contiene
*/

import colecciones.coleccion2.ejercicio3.Utilidades.*;

public class ProbarUtilidades{
	
	public static void main ( String [] args) {
		
				//declaramos e instanciamos varios elementos de cad uno de los tipos enumerados
				DiasLaborables unDia = DiasLaborables.MIERCOLES;
				
				ColoresPrimarios unColor = ColoresPrimarios.VERDE;
				
				// sin utilizar import, debe hacerse de esta forma:
				
				Utilidades.IdiomasEmbajadores unIdioma = Utilidades.IdiomasEmbajadores. ITALIANO;
				
				Utilidades.DocumentosVotar unDocumento = Utilidades.DocumentosVotar. PASAPORTE;
				
				// a continuación, mostramos sus valoes por pantalla
				
				System.out.println ("Mi día favorito es el ..." + unDia);
				
				System.out.println ("Mi color favorito es el ..." + unColor);
				
				System.out.println ("Este año voy a estudiar ..." + unIdioma);
				
				System.out.println("En las próximas elecciones votaré con el .." + unDocumento);
				
		
		
	
	
	}//fin del método main
	
} //fin de la clase

