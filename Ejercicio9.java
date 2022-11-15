import java.util.Scanner;

/**
*
*	Ejercicio 9, Programa que calcula el volumen de un cono.
* 
*	Nombre del archivo: Ejercicio9.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio9 {
	public static void main(String[] args) {
		
		//Definimos la clase volumen.
		Scanner volumen = new Scanner(System.in);
		
		//Le pedimos al usuario el radio y la altura del cono y lo almacenamos en la clase volumen.
		System.out.print("Introduce el radio y con un espacio la altura del cono: ");
		int radio = volumen.nextInt();
		int altura = volumen.nextInt();
		
		//Especificamos el valor de pi y tambien especificamos la furmala del volumen del cono.
		double pi = 3.1415;
		double formula = (pi*(radio*radio)*altura)/3;
		
		//Lo mostramos por pantalla.
		System.out.println("El volumen del cono es: " + (float)formula + " Cm3.");
		
	}
}
