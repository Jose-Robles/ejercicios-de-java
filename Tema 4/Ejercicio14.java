/**
 * Ejercicio 14 Tema 04
 * 
 * Calcula si un número es par o impar y si es divisible entre 5.
 *
 * @author José Robles Bastidas
*/
public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Este programa calcula si un número es par y si es divisible entre 5.");
		System.out.println("Dime un número : ");
		int a = Integer.parseInt(System.console.readLine());
		if(a%2 != 0){
			if(a%5==0){
				System.out.println("El resultado es que el número es impar y divisible entre 5");
			} else{
				System.out.println("El resultado es que el número es impar y no divisible entre 5");
			}
		} else{
			if(a%5 == 0){
				System.out.println("El resultado es que el número es par y divisible entre 5")
			} else{
				System.out.println("El resultado es que el número es par y no divisible entre 5");
			}
		}