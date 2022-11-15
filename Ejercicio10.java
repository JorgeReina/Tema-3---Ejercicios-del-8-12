import java.util.Scanner;

/**
*
*	Ejercicio 10, Programa de un conversor de Mb a Kb.
* 
*	Nombre del archivo: Ejercicio10.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio10 {
	public static void main(String[] args) {
		
		//Definimos la clase de datos
		Scanner datos = new Scanner(System.in);
		
		//Definimos el valor de los Kb por cada Mb.
		int kiloBytes = 1000;
		
		//Pedimos al usuario que introduzca los Mb y lo guardamos en la clase datos.
		System.out.print("Introduce cuantos Mb quieres pasar a Kb: ");
		int megaBytes = datos.nextInt();
		
		//Definimos la formula de conversión.
		int conversor = megaBytes * kiloBytes;
		
		//Lo mostramos por pantalla.
		System.out.println("Los " + megaBytes + " Megabytes son " + conversor + "Kilobytes");
		
	}
}
