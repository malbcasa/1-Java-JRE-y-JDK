
public class EjemploCondicionales2 {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		/*if (edad >= 18 || cantidadPersonas >=2) {
			System.out.println("Usted puede entrar");
		}*/
		
		boolean esPareja = cantidadPersonas > 1;
		
		System.out.println("El valor de la condicion es: " + esPareja);
		
		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar");
		}
		else {
				System.out.println("Usted no puede entrar");
		}
					
	}
}
