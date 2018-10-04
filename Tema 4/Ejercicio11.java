/**
* Ejercicio 11 Tema 04
* 
* Calcula los segundos que faltan para llegar a medianoche
*
* @author José Robles Bastidas
*/

public class Ejercicio11 {
  public static void main(String[] args) {

    //Pedir los valores de la hora y minutos
    System.out.println("Este programa calcula los segundos que faltan para que llegue la media noche.");
    String linea;
    System.out.println("Introduce la hora actual: ");
    linea = System.console().readLine();
    int hora;
    hora = Integer.parseInt( linea );
    String lineados;
    System.out.println("Introduce los minutos actuales: ");
    lineados = System.console().readLine();
    int minutos;
    minutos = Integer.parseInt( lineados );
    int horasSegundos;
    horasSegundos = hora * 3600;
    int minutosSegundos;
    minutosSegundos = minutos * 60;
    int totalSegundos;
    totalSegundos = (horasSegundos) + (minutosSegundos);
    int segundosAlDia;
    segundosAlDia = 86400;
    int total;
    total = segundosAlDia - totalSegundos;
    System.out.println("Para que llegue la media noche quedan: ");
    System.out.println(total + "  segundos");
      
    
    
  }
}















