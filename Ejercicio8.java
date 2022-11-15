import java.util.Scanner;

/**
*
*	Ejercicio 8, Programa que calcula el salario semanal de un empleado en función
* de las horas trabajadas.
* 
*	Nombre del archivo: Ejercicio8.java
*
*	@author Jorge Reina Romero
*
*/

public class Ejercicio8 {
	public static void main(String[] args) {
		
		//Definimos nuestra clase.
		Scanner horas = new Scanner(System.in);
		
		//Definimos el precio por cada hora.
		int eurosHora = 12;
		
		//pedimos al usuario que introduzca las horas trabajadas.
		System.out.print("Introduce las horas trabajadas esta semana: ");
		
		//Definimos la variable de horas que trabaja y la formula para calcualar el salario.
		int horasTrabajadas = horas.nextInt();
		int salario = eurosHora * horasTrabajadas;
		
		//Lo mostramos por pantalla.
		System.out.println("Tu salaraio semanal es de: " + salario + " Euros.");
		
	}
}
