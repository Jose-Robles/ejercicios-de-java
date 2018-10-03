/**
 * Ejercicio 07 tema 04
 * 
 * Cálculo de la media aritmética de 3 notas
 * 
 * @author José Robles Bastidas
 */
import java.lang.Math;
public class Ejercicio07 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        String celeste = "\033[36m";
        String verde = "\033[32m";
        String rojo = "\033[31m";
        boolean salir;
        float nota1;
        float nota2 = 0;
        float nota3 = 0;
        System.out.println(verde + "Este programa calculará la media entre 3 notas dadas");
        System.out.println(blanco + "Introduzca la primera nota >> ");
        nota1 = Double.parseDouble(System.console().readLine());
        if(nota1 < 0){
            System.out.println("No me creo que saques una nota negativa... Intentalo otra vez >>");
            nota1 = Double.parseDouble(System.console().readLine());
            if(nota1 < 0){
                salir = true;
            }
        }
        if(!salir){
            System.out.println(blanco + "Introduzca la segunda nota >> ");
            nota2 = Double.parseDouble(System.console().readLine());
        }
            if(nota2 < 0){
            System.out.println("No me creo que saques una nota negativa... Intentalo otra vez >>");
            nota2 = Double.parseDouble(System.console().readLine());
            if(nota2 < 0){
                salir = true;
            }
        }
        if(!salir){
            System.out.println(blanco + "Introduzca la tercera nota >> ");
            nota3 = Double.parseDouble(System.console().readLine());
        }
        if(nota3 < 0){
            System.out.println("No me creo que saques una nota negativa... Intentalo otra vez >>");
            nota3 = Double.parseDouble(System.console().readLine());
            if(nota3 < 0){
                salir = true;
            }
        }
        if(salir){
            System.out.println(rojo + "ERROR : Parece que sigues sin colaborar..." + blanco);
        } else{
            notaMedia = (nota1+nota2+nota3)/3;
            switch ((int)Math.round(notaMedia)) {
                case 10:
                    System.out.println(naranja + "¡¡Enhorabuena!! tu nota es casi imbatible ;)");
                    System.out.printf("Tu nota media es : %.2f" + blanco, notaMedia);
                    break;
                case 9:
                    System.out.print(naranja + "¡Enhorabuena! tu nota es alta pero aún se puede ");
                    System.out.printf("perfilar.\nTu nota media es : %.2f" + blanco, notaMedia);
                    break;
                case 8:
                    System.out.println(naranja + "Wow! Felicidades, tienes una buena nota :)");
                    System.out.printf("Tu nota media es : %.2f" + blanco, notaMedia);
                    break;
                case 4:
                    System.out.println(naranja + "Vaya... te faltaba un tironcito más y...");
                    System.out.printf("Tu nota media es : %.2f" + blanco, notaMedia);
                    break;
                case 2:
                    System.out.print(naranja +"La verdad es que muy ocupado has tenido que estar");
                    System.out.printf(" para tener esta nota.\n tienes un %.2f"+blanco, notaMedia);
                    break;
                case 1:
                    System.out.print(naranja +"La verdad es que muy ocupado has tenido que estar");
                    System.out.printf(" para tener esta nota.\n tienes un %.2f"+blanco, notaMedia);
                    break;
                default:
                    System.out.printf(naranja + "Tu nota media es: %.2f" + blanco, notaMedia);
                    System.out.println(rojo + "¡¡TRABAJA DURO!!" + blanco);
                    break;
            }
        }
    }
}