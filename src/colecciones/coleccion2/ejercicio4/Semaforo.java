
package colecciones.coleccion2.ejercicio4;

public class Semaforo {

	// definifición de tipos enumerados
	
	enum Colores { ROJO, AMBAR, VERDE };
	
	// propiedades
	
	private Colores color= Colores.ROJO;
	private boolean parpadeo= false;


	// metodos set
	
	public void SetColor(Colores color)
	{
		this.color=color;
	}

	public void SetParpadeo(boolean parpadeo)
	{
		this.parpadeo=parpadeo;
	}

	// metodos get

	public Colores getColor()
	{
		return this.color;
	}

		public boolean getParpadeo()
	{
		return this.parpadeo;
	}


}
