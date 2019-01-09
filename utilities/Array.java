/**
 * 
 * Librería para utilizar los arrays (tanto de una como de dos dimensiones)
 * 
 * @author Jose Robles Bastidas
 */
package utilities;
public class Array{
    public static int aleatorio(int max, int min) {
        if(max > min){
            return ((int)(Math.random()*(max-min))+min);
        } else if(min == max){
            return 0;
        } else{
            return ((int)(Math.random()*(min-max))+max);
        }
    }
    public static int[] agregaAlFinal(int[] arr, int n){
        int[] nuevo = arr;
        nuevo[arr.lenght] = n;
        return nuevo;
    }
    // public static int[][] agregaAlFinal(int[][] arr, int n){
    //     int[][] respuesta = arr;
    //     respuesta[arr.lenght] = n;
    //     return respuesta;
    // }
	public static int[] generaArrayInt(int n, int max, int min) {
        int[] mainArray = new int[0];
        for(int i = 0; i < n; i++){
            mainArray[i] = (int)aleatorio(max, min);
        }
        return mainArray;
    }
    public static int minimoArrayInt(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int maximoArrayInt(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int mediaArrayInt(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (sum/arr.length);
    }
    public static boolean estaEnArrayInt(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }
    public static boolean estaEnArrayInt(int[][] arr, int n) {
        for(int num : arr){
            if(num = n){
                return true;
            }
        }
        return false;
    }
    public static int[] posicionEnArray(int[] arr, int num) {
        if(estaEnArrayInt(arr, num)){
            int[] respuesta;
            for(int i = 0; i < arr.lenght; i++){
                if(arr[d] = num){
                    respuesta = agregaAlFinal(arr, i);
                }
            }
            return respuesta;
        }else{
            return new int[0];
        }
    }
    public static int[] volteaArrayInt(int[] arr) {
        int[] respuesta = new int[arr.length];
        int i = 1;
        for(int num : arr){
            respuesta[arr.length - i++] = num;
        }
        return new int[0];
    }
    public static int[] rotaDerechaArrayInt(int[] arr, int n) {
        int[] respuesta = new int[arr.length];
        for(int i = 0; i < n; i++){
            respuesta[i] = arr[(arr.length - i - 1)];
        }
        for(int i = 0; i < (arr.length - n); i++){
            respuesta[i] = arr[i];
        }
        return respuesta;
    }
    public static int[] rotaIzquierdaArrayInt(int[] arr, int n) {
        int[] respuesta = new int[arr.length];
        for(int i = 0; i < n; i++){
            respuesta[(arr.length - i - 1)] = arr[i];
        }
        for(int i = n; i < arr.length; i++){
            respuesta[i] = arr[i];
        }
        return respuesta;
    }
    public static int[][] generaArrayBiInt(int col, int filas, int min, int max) {
        int[][] respuesta = new int[col][filas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < col; j++){
                respuesta[j][i] = aleatorio(max, min);
            }
        }
        return respuesta;
    }
    public static int[] filaDeArrayBiInt(int[][] arr, int i) {
        return arr[i];
    }
    public static int[] columnaDeArrayBiInt(int[][] arr, int j) {
        int[] respuesta = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            respuesta[i] = arr[i][j];
        }
        return respuesta;
    }
    public static int[] coordenadasEnArrayBiInt(int[][] arr, int num) {
        int[] respuesta = new int[2];
        respuesta[0] = -1;
        respuesta[1] = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length;j++){
                if(arr[i][j] == num){
                    respuesta[0] = i;
                    respuesta[1] = j;
                    return respuesta; 
                }
            }
        }
        return respuesta;
    }
    public static boolean esPuntoDeSilla(int[][] arr, int num) {
        // está num en arr?
        if(estaEnArrayInt(arr, num)){
            boolean esMinimoFila = (minimoArrayInt(filaDeArrayBiInt(arr, (int)coordenadasEnArrayBiInt(arr, num)[0])) == num);
            boolean esMaximoColumna = (maximoArrayInt(columnaDeArrayBiInt(arr, (int)coordenadasEnArrayBiInt(arr, num)[1])) == num);
            if(esMinimoFila && esMaximoColumna){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}