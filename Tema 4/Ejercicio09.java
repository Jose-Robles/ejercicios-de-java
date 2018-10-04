/**
* Ejercicio 09 Tema 
* 
* Calcula la solución a una ecuación de segundo grado
*
* @author José Robles Bastidas
*/

public class Ejercicio09 {
  public static void main(String[] args) {
    double a;
    double b;
    double c;
    System.out.println("Este programa resuelve ecuaciones de segundo grado");
    System.out.println("Introduce el valor de a: ");
    a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b:");
    b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de c:");
    c = Double.parseDouble(System.console().readLine());
    if (a <= 0.0002 && a >= -0.0002){
      System.out.print("Introduce valores plausibles, osea,  más grandes.");
    } else if(a!=0) {
    double total1;
    total1 = (-b + Math.sqrt ((b*b)-(4*a*c))) / 2*a;
    
    double total2;
    total2 = (-b - Math.sqrt ((b*b)-(4*a*c))) / 2*a;

    System.out.println("El primer número introducido es " + a);
    System.out.println("El segundo numero introducido es  " + b);
    System.out.println("El tercer numero introducido es  " + c);
    System.out.println("El resultado de su operacion al hacer la formula en positivo es  :" + total1);
    System.out.println("El resultado de su operacion al hacer la formula en negativo es  :" + total2);
    }
  } 
}
