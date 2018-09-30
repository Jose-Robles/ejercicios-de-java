/**
 * Ejercicio 03 tema 04
 * 
 * Dependiendo del número introducido devuelve el día de la semana correspondiente.
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String verde = "\033[32m";
        String blanco = "\033[37m";
        String rojo = "\033[31m";
        String celeste = "\033[36m";
        int día;
        System.out.print(verde + "\nEste programa devuelve un día de la semana");
        System.out.println(" a partir de un número dado." + blanco);
        System.out.println("Introduce un número >>");
        día = Integer.parseInt(System.console().readLine());
        if(día >= 1 && día <= 7){
            if(día == 1){
                System.out.println(celeste + "El día correspondiente es Lunes" + blanco);
            }
            if(día == 2){
                System.out.println(celeste + "El día correspondiente es Martes" + blanco);
            }
            if(día == 3){
                System.out.println(celeste + "El día correspondiente es Miércoles" + blanco);
            }
            if(día == 4){
                System.out.println(celeste + "El día correspondiente es Jueves" + blanco);
            }
            if(día == 5){
                System.out.println(celeste + "El día correspondiente es Viernes" + blanco);
            }
            if(día == 6){
                System.out.println(celeste + "El día correspondiente es Sábado" + blanco);
            }
            if(día == 7){
                System.out.println(celeste + "El día correspondiente es Domingo" + blanco);
            }
        }
        else{
            System.out.println(rojo +"ERROR : el número debe estar entre 1 y 7 incluidos"+ blanco);
        }
    }
}