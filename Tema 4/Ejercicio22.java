/**
 * Ejercicio 22 Tema 04
 * 
 * Calcula cuánto tiempo queda en minutos para el fin de semana
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio22 {
    public static void main(String[] args) {
        int minParaFinde;
        boolean salir = false;
        System.out.println("¿Qué día de la semana es hoy?");
        String diaSemana = System.console().readLine().toUpperCase();
        System.out.println("¿Y qué hora es? (Solo la hora en 24 horas)");
        int hora = Integer.parseInt(System.console().readLine());
        if (hora >24) {
            diaSemana = "";
        }
        System.out.println("¿Y los minutos? (Solo los minutos)");
        int minutos = Integer.parseInt(System.console().readLine());
        if (minutos > 59) {
            diaSemana = "";            
        }
        switch (diaSemana) {
            case "LUNES":
                minParaFinde =+ ((((24*4) + hora - 15)*60) - minutos);
                break;
            case "MARTES":
                minParaFinde =+ ((((24*3) + hora - 15)*60) - minutos);
                break;
            case "MIERCOLES":
            case "MIÉRCOLES":
                minParaFinde =+ ((((24*2) + hora - 15)*60) - minutos);
                break;
            case "JUEVES":
                minParaFinde =+ (((24 + hora - 15)*60) - minutos);
                break;
            case "VIERNES":
                minParaFinde =+ (((hora - 15)*60) - minutos);
                break;
            default:
                System.out.println("Asegurate de introducir correctamente los datos");
                salir = true;
                break;
        }
        if (!salir) {
            System.out.print("Pues para que llegue el finde quedan... ");
            System.out.println(minParaFinde + " minutos.");
        }
        
    }
}