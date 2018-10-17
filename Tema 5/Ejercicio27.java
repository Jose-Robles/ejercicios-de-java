/**
 * Ejercicio 27 Tema 05
 * 
 * Muestra, suma y cuenta los múltiplos de 3 entre el número 1 y un número introducido. 
 * 
 * @author José Robles
 */
public class Ejercicio27 {

  public static void main(String[] args) {
      
    System.out.print("Introduzca un nÃºmero entero mayor que 1: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int cuenta = 0;
    int suma = 0;
    
    for (int i = 1; i < numeroIntroducido; i++) {
      if ((i % 3) == 0) {
        System.out.print(i + " ");
        cuenta++;
        suma += i;
      }
    }
        
    System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + cuenta);
    System.out.println(" mÃºltiplos de 3 y suman " + suma);
  }
}
