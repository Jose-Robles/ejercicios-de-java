/**
 * Ejercicio 01 tema 07
 * 
 * Crea un array de dos dimensiones.
 * 
 * @author Jose Robles Bastidas
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        int[][] array = new int[3][6];
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 7;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;
        System.out.print("\t");
        for(int columna = 0; columna <= 5; columna++){
            System.out.print("Columna " + columna + "\t");
        }
        for(int fila = 0; fila <= 2; fila++){
            System.out.print("\nFila " + fila + "\t");
            for(int columna = 0; columna <= 5; columna++){
                System.out.print(array[fila][columna] + "\t\t");
            }
        }
        System.out.println("");
    }
}