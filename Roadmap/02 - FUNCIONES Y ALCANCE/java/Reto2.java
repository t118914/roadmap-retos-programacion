package reto2;

public class Main {
	String texto1;
	String texto2;
	private static void imprimirTexto(String texto1, String texto2) {
		int vecesImprimidoNumero = 0;
		for(int i = 1; i < 101; i++) {
			if (((i % 3) == 0) && ((i % 5) == 0)) {
				System.out.println(texto1+texto2);
			}
			else if ((i % 3) == 0) {
				System.out.println(texto1);
			}
			else if ((i % 5) == 0) {
				System.out.println(texto2);
			}
			else {
				vecesImprimidoNumero++;
				System.out.println(i);
			}
		}
		System.out.println("La cantidad de veces que se ha impreso un numero es: " + vecesImprimidoNumero);
	}
	public static void main(String args[]) {
		imprimirTexto("hola","todos");
	}
}
