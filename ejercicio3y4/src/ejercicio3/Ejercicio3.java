package ejercicio3;

import ejercicio3.entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // 3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para 
        // leer dos números en forma de cadena. A continuación, utilice el método parseInt() de 
        // la clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables 
        // de tipo int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
        
        // 4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
        // causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la 
        // cadena no puede convertirse a entero, arroja una NumberFormatException y además, al dividir
        // un número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
        // utilizando bloques try/catch para las distintas excepciones.
        
        DivisionNumero divisionNumero = new DivisionNumero();

        try {

            System.out.println("Ingrese el primer número");
            divisionNumero.setNumero1(Integer.parseInt(leer.next()));
            System.out.println("Ingrese el segundo número");
            divisionNumero.setNumero2(Integer.parseInt(leer.next()));

        } catch (NumberFormatException e) {

            System.out.println("Error: " + e.getMessage());

            System.out.println(e.fillInStackTrace());

        }

        double resultadoDivision = divisionNumero.calcularDivisionEntre2Numeros();

        System.out.println("El resultado de la división es: " + resultadoDivision);

    }

}
