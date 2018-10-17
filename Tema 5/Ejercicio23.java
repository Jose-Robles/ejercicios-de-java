/**
 * Ejercicio 23 Tema 05
 * 
 * Cuenta los n�meros introducidos hasta llegar a 10000 y muestra la media de todos, el totaly el contador. 
 * 
 * @author Jos� Robles
 */
public class Ejercicio23 {

  public static void main(String[] args) {

    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numeroDeElementos + ".");
  }
}
