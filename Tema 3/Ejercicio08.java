/**
 * Ejercicio 08 tema 03
 * 
 * Calcula el área de un rectángulo introduciendo la longitud de los lados
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        int precioHora = 12; //definimos la variable que ya conocemos
        float diasLaborables;
        float horasDiarias;
        System.out.println(naranja + "¡Vamos a calcular tu salario semanal!");
        System.out.println("Para ello supondré que cobras 12 euros la hora. \n");
        System.out.println(blanco + "Primero dime cuántos días trabajas de la semana en total >>");
        diasLaborables = Float.parseFloat(System.console().readLine());
        System.out.println("Ahora por favor dime cuántas horas trabajas durante esos días >>");
        horasDiarias = Float.parseFloat(System.console().readLine());
        System.out.println("⚙ ⚙ ⚙");
        System.out.print("Tu salario semanal asciende a un total de: ");
        System.out.print(azul + (diasLaborables*horasDiarias*precioHora) + " € \n" + blanco);

    }
}