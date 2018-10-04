/**
* Ejercicio 14 Tema 04
* 
* Calcula si un numero es par o impar y si es divisible entre 5.
*
* @author José Robles Bastidas
*/
public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println("Este programa calcula si un número es par y si es divisible entre 5.");
		System.out.println("Dime un número : ");
		int a = Integer.parseInt(System.console.readLine());
		boolean par;
		boolean entreCinco;
		if(a%2 != 0){
			par = false;
		} else{
			par = true;
			entreCinco = false;
		}
		if(a >= 5 && a%5 ==0 && entreCinco == null){
			entreCinco = true;
		}
		System.out.println("El resultado es que ");
	}
}
