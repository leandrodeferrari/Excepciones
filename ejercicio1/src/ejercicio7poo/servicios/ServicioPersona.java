package ejercicio7poo.servicios;

import ejercicio7poo.entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona personaUsuario = new Persona();

        System.out.println("Ingrese su nombre");
        personaUsuario.setNombre(leer.next());

        System.out.println("Ingrese su edad");
        personaUsuario.setEdad(leer.nextInt());

        System.out.println("Ingrese su sexo ('H' hombre, 'M' mujer, 'O' otro)");
        personaUsuario.setSexo(leer.next());

        System.out.println("Ingrese su peso en kg");
        personaUsuario.setPeso(leer.nextDouble());

        System.out.println("Ingrese su altura en mt2");
        personaUsuario.setAltura(leer.nextDouble());

        return personaUsuario;

    }

    public int calcularIMC(Persona personaUsuario) {

        double pesoIdeal = personaUsuario.getPeso() / (Math.pow(personaUsuario.getAltura(), 2));

        if (pesoIdeal < 20) {

            System.out.println(personaUsuario.getNombre() + " está por debajo de su peso ideal");
            return -1;

        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {

            System.out.println(personaUsuario.getNombre() + " ¡Felicidades! Estás en tu peso ideal");
            return 0;

        } else {

            System.out.println(personaUsuario.getNombre() + " tiene sobrepeso");
            return 1;
        }

    }

    public boolean esMayorDeEdad(Persona personaUsuario) {

        try {
            return personaUsuario.getEdad()>=18;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println(e.fillInStackTrace());
        }
        
        return false;
        
    }

    public void mostrarDatosPersona(Persona personaUsuario) {

        System.out.println(personaUsuario.toString());

    }

}
