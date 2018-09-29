/**
 * Ejercicio 01 tema 04
 * 
 * Contiene el horario de clase e introduciendo el día de la semana te dice
 * la clase que tenemos a primera hora
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String verde = "\033[32m";
        String blanco = "\033[37m";
        String rojo = "\033[31m";
        String día;
        System.out.print(verde + "Este programa asume un día a la semana y devuelve");
        System.out.println(" la clase que tendríamos según el horario." + blanco);
        System.out.print("Introduce el día de la semana >>");
        día = System.console().readLine();
        boolean lunes = día.equals("Lunes")|| día.equals("lunes");
        boolean martes = día.equals("Martes")|| día.equals("martes");
        boolean casiMiercoles = día.equals("Miercoles")|| día.equals("miercoles");
        boolean miercoles = día.equals("Miércoles")|| día.equals("miércoles")|| casiMiercoles;
        boolean jueves = día.equals("Jueves")|| día.equals("jueves");
        boolean viernes = día.equals("Viernes")|| día.equals("viernes");
        boolean casiSabado = día.equals("sabado")|| día.equals("sábado");
        boolean sabado = día.equals("Sábado")|| día.equals("Sabado")|| casiSabado;
        boolean domingo = día.equals("Domingo")|| día.equals("domingo");
        if(lunes){
            System.out.print("\nLa primera clase que tendrás el lunes será : " + azul);
            System.out.println("Entornos de Desarrollo\n" + blanco);
        }
        else if(martes){
            System.out.print("\nLa primera clase que tendrás el martes será : " + morado);
            System.out.println("Sistemas informáticos\n" + blanco);
        }
        else if(miercoles){
            System.out.print("\nLa primera clase que tendrás el martes será : " + celeste);
            System.out.println("Programación\n" + blanco);
        }
        else if(jueves){
            System.out.print("\nLa primera clase que tendrás el martes será : " + celeste);
            System.out.println("Programación\n" + blanco);
        }
        else if(viernes){
            System.out.print("\nLa primera clase que tendrás el martes será : " + morado);
            System.out.println("Sistemas informáticos\n" + blanco);
        }
        else if(sabado || domingo){
            System.out.println(rojo + "\nObviamente no vas a tener clases los fines de semana...");
            System.out.println(blanco);
        }
        else{
            System.out.println("" + rojo);
            System.out.print("ERROR : Debes haberte equivocado escribiendo. Trata de escribir");
            System.out.println(" mejor la próxima vez que ejecutes este programa.\n" + blanco);
        }
    }
}