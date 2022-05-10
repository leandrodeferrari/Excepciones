package ejercicio23introjava;

public class Ejercicio23IntroJava {

    public static void main(String[] args) {

        // 23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
        // la traspuesta de la matriz. 
        
        // 2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código 
        // para generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo 
        // fuera de rango). 
        
        int[][] matriz = new int[4][4];

        int[][] matriztranspuesta = new int[4][4];

        // Cambié la condición del for, para que me tire error
        try {

            for (int i = 0; i < 10; i++) {

                for (int j = 0; j < 4; j++) {

                    matriz[i][j] = (int) (Math.random() * 10);

                }

            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Límite del array " + e.getMessage());
            System.out.println(e.fillInStackTrace());

        }

        try {

            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < 4; j++) {

                    matriztranspuesta[i][j] = matriz[j][i];

                }

            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.fillInStackTrace());
        }

        String aux;

        for (int[] fila : matriztranspuesta) {
            aux = "";
            for (int elemento : fila) {

                aux += " " + elemento;

            }

            System.out.println(aux);

        }

    }

}
