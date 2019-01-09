/**
 * 
 * 
 * 
 * @author Jose Robles Bastidas
 */
import prog.Array1D;
public class Examen_2 {
    public static void main(String[] args){
        int[][] mainArray;
        for(int fila = 0; fila < 4; fila++){
            mainArray[fila] = generaArrayInt(6, 99, 10);
            System.out.printf("%d | %d", mainArray[fila], minimoArrayInt(mainArray[fila]));
        }
        System.out.print(mainArray.lenght * "___");
        for(int j = 0;j < mainArray[1].lenght; j++){
            for(int i = 0;i < mainArray.lenght; i++){
                System.out.print(mainArray[i][j] + " ");
            }
        }
    }
}