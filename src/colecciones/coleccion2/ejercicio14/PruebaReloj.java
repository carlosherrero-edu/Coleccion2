package colecciones.coleccion2.ejercicio14;


public class PruebaReloj {

	public static void main(String[] args) {
		
		Reloj r1=new Reloj();
		Reloj r2=new Reloj(18, 50,14);
		
		System.out.println("Reloj 1: " +r1.mostrarHora());
		System.out.println("Reloj 2: " +r2.mostrarHora());
		
		r1.ponerHora(15, 25);
		r2.ponerHora2(14, 45, 34);
		
		System.out.println("Reloj 1: " +r1.mostrarHora());
		System.out.println("Reloj 2: " +r2.mostrarHora());
	}

}
