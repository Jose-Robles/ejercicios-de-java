/**
 * Ejercicio 28 Tema 05
 * 
 * Calcula el factorial de un número introducido. 
 * 
 * @author José Robles
 */
public class Ejercicio28 {

  public static void main(String[] args) {
    
    int numeroIntroducido;
    do {
      System.out.print("Por favor, introduzca un nÃºmero entero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < 0) {
        System.out.println("El nÃºmero introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println(numeroIntroducido + "! = " + factorial);
    }
  }
}
