/**
 * Ejercicio 36 Tema 05
 * 
 * Comprueba si un n˙mero intorducido es o no capic˙a. 
 * 
 * @author JosÈ Robles
 */
public class Ejercicio36 {

  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un n√∫mero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    // Voltea el n√∫mero introducido.
    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    if (volteado == numeroIntroducido) {
      System.out.println("El " + numeroIntroducido + " es capic√∫a");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capic√∫a");
    }
  }
}
