/**
 * Ejercicio 02 tema 04
 * 
 * Dependiendo de la hora introducida saluda acorde a esa hora del día.
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        String verde = "\033[32m";
        String blanco = "\033[37m";
        String rojo = "\033[31m";
        String celeste = "\033[36m";
        int hora;
        System.out.println(verde + "Este programa dice" + rojo + " buenos dias");
        System.out.println("\t\t   buenas tardes");
        System.out.print("\t\t   buenas noches" + verde);
        System.out.println(" dependiendo de la hora introducida." + blanco);
        System.out.println("¿Qué hora es? Por favor expresa solo la hora en número entre 0-24 >>");
        hora = Integer.parseInt(System.console().readLine());
        if(hora > 0 && hora < 24){
            if(hora >= 6 && hora <= 12){
                System.out.println(celeste + "¡¡BUENOS DÍAS!!" + blanco);
            }
            else if(hora >= 13 && hora <= 20){
                System.out.println(celeste + "¡¡BUENAS TARDES!!" + blanco);
            }
            else{
                System.out.println(celeste + "¡¡BUENAS NOCHES!!" + blanco);
            }
        }
        else{
            System.out.println(rojo + "ERROR : introduce un número entre 0 y 24" + blanco);
        }
}