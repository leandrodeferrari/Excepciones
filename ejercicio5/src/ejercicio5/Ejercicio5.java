package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // 5. Escribir un programa en Java que juegue con el usuario a adivinar un número. 
        // La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene 
        // que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la 
        // computadora debe decirle al usuario si el número que tiene que adivinar es mayor o 
        // menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo 
        // e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. 
        // Si el usuario introduce algo que no es un número, se debe controlar esa excepción e 
        // indicarlo por pantalla. En este último caso también se debe contar el carácter fallido 
        // como un intento.
        
        int numeroParaAdivinar = (int) (Math.random() * 500 + 1);
        int numeroUsuario = 0, contador = 1;

        System.out.println("¡Bienvenido al juego de descubrir el número!");
        System.out.println("Ingrese un número:");

        try {

            numeroUsuario = leer.nextInt();

            while (numeroParaAdivinar != numeroUsuario) {

                contador++;

                System.out.println("¡Has fallado! Intentelo otra vez");

                if (numeroUsuario < numeroParaAdivinar) {

                    System.out.println("Pista:");
                    System.out.println("El número a adivinar, es mayor que " + numeroUsuario);

                } else if (numeroUsuario > numeroParaAdivinar) {

                    System.out.println("Pista:");
                    System.out.println("El número a adivinar, es menor que " + numeroUsuario);

                }

                numeroUsuario = leer.nextInt();

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.fillInStackTrace());
        }

        if (numeroParaAdivinar == numeroUsuario) {

            System.out.println("¡Felicidades! Has adivinado el número");

        }

        if (contador == 1) {

            System.out.println("Has intentado adivinar el número un total de " + contador + " vez");

        } else {

            System.out.println("Has intentado adivinar el número un total de " + contador + " veces");

        }

    }

}
