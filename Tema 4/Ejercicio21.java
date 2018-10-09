/**
 * Ejercicio 21 Tema 04
 * 
 * Calcula la evaluación de un trimestre
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("Vamos a calcular tu nota de la evaluación");
        System.out.println("Nota del primer control: ");
        double primerControl = Double.parseDouble(System.console().readLine());
        System.out.println("Nota del segundo control: ");
        double segundoControl = Double.parseDouble(System.console().readLine());
        double media = primerControl+segundoControl)/2;
        if ((media) >= 5.0) {
            System.out.printf("Tu nota de Programación es %.1f\n", media);
        } else{
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String respuesta = System.console().readLine();
            switch (respuesta.toUpperCase()) {
                case "APTO":
                    System.out.println("\nTu nota de Programación es 5");
                    break;
                case "NO APTO":
                    System.out.printf("\nTu nota de Programación es %.1f\n", media);
                    break;
                default:
                    System.out.println("\nParece que no introduciste correctamente lo que se pide");
                    System.out.print("Te daré una oportunidad más... (apto/no apto) >>");
                    respuesta = System.console().readLine();
                    switch (respuesta.toUpperCase()) {
                        case "APTO":
                            System.out.println("\nTu nota de Programación es 5");
                            break;
                        case "NO APTO":
                            System.out.printf("\nTu nota de Programación es %.1f\n", media);
                            break;
                        default:
                            System.out.println("\nParece que no introduciste correctamente lo que se pide");
                            break;
                    }
                    break;

            }
        }
    }
}