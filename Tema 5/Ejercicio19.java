/**
 * Ejercicio 19 Tema 05
 * 
 * Crea una pir·mide maciza a partir de ciertos valores requeridos 
 * 
 * @author JosÈ Robles
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura de la pir√°mide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el car√°cter de relleno: ");
    String relleno = System.console().readLine();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la l√≠nea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
