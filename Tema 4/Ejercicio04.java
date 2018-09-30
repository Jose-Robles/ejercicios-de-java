/**
 * Ejercicio 04 tema 04
 * 
 * Calcula el dinero que ganaríamos en una semana dada
 * incluyendo las horas extras que se pagan más caras.
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        String celeste = "\033[36m";
        String morado = "\033[35m";
        int precioHora = 12; //definimos la variable que ya conocemos
        float diasLaborables;
        float horasDiarias;
        float horasTotales;
        System.out.println(naranja + "¡Vamos a calcular tu salario semanal!");
        System.out.println(blanco + "Primero dime cuántos días trabajas de la semana en total >>");
        diasLaborables = Float.parseFloat(System.console().readLine());
        System.out.println("Ahora por favor dime cuántas horas trabajas durante esos días >>");
        horasDiarias = Float.parseFloat(System.console().readLine());
        horasTotales = (horasDiarias*diasLaborables);
        System.out.println(naranja + "⚙ " + celeste + "⚙ " + morado + "⚙" + blanco);
        if (horasTotales > 40){
            float horasExtra = (horasTotales-40)*16;
            System.out.print("Tu salario semanal asciende a un total de: ");
            System.out.print(azul + ((40*precioHora) + (horasExtra)) + " € \n" + blanco);
        }
        else {
            System.out.print("Tu salario semanal asciende a un total de: ");
            System.out.print(azul + (diasLaborables*horasDiarias*precioHora) + " € \n" + blanco);
        }

    }
}