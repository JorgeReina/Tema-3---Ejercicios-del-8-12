import java.util.Scanner;

/**
*
*	Ejercicio 11, Programa de un conversor de Kb a Mb.
* 
*	Nombre del archivo: Ejercicio11.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio11 {
	public static void main(String[] args) {
		
		//Definimos la clase de datos
		Scanner datos = new Scanner(System.in);
		
		//Definimos el valor de los Mb por cada Kb.
		double megaBytes = 0.001;
		
		//Pedimos al usuario que introduzca los Kb y lo guardamos en la clase datos.
		System.out.print("Introduce cuantos Kb quieres pasar a Mb: ");
		int kiloBytes = datos.nextInt();
		
		//Definimos la formula de conversión.
		double conversor = kiloBytes * megaBytes;
		
		//Lo mostramos por pantalla.
		System.out.println("Los " + kiloBytes + " Kilobytes son " + conversor + "Megabytes");
		
	}
}
