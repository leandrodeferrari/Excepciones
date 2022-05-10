
package ejercicio7poo;

import ejercicio7poo.entidades.Persona;
import ejercicio7poo.servicios.ServicioPersona;

public class Ejercicio7Poo {

    public static void main(String[] args) {
        
        // 7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, 
        // edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea 
        // añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:
        //
        // a) Un constructor por defecto. 
        // b) Un constructor con todos los atributos como parámetro. 
        // c) Métodos getters y setters de cada atributo. 
        // d) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
        // al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
        // Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
        // Si no es correcto se deberá mostrar un mensaje.
        // e) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
        // kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
        // que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la fórmula 
        // da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su 
        // peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un 
        // valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
        // f) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
        // un booleano.
        // 
        // A continuación, en la clase main hacer lo siguiente: 
        // 
        // Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los 
        // métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
        // sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
        // mayor de edad.
        //
        // Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
        // variables, para después en el main, calcular un porcentaje de esas 4 personas cuantas están 
        // por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos 
        // un porcentaje de cuantos son mayores de edad y cuantos menores.
        
        // 1.  Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar 
        // de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con 
        // una cláusula try-catch para probar la nueva excepción que debe ser controlada.        
        
        ServicioPersona servicio = new ServicioPersona();
       
        Persona persona = null;
        
        servicio.esMayorDeEdad(persona);
        
        /*
        Persona personaUsuario1 = servicio.crearPersona();
        Persona personaUsuario2 = servicio.crearPersona();
        Persona personaUsuario3 = servicio.crearPersona();
        Persona personaUsuario4 = servicio.crearPersona();
        
        servicio.mostrarDatosPersona(personaUsuario1);
        servicio.mostrarDatosPersona(personaUsuario2);
        servicio.mostrarDatosPersona(personaUsuario3);
        servicio.mostrarDatosPersona(personaUsuario4);
        
        int calculoIMCUsuario1 = servicio.calcularIMC(personaUsuario1);
        int calculoIMCUsuario2 = servicio.calcularIMC(personaUsuario2);
        int calculoIMCUsuario3 = servicio.calcularIMC(personaUsuario3);
        int calculoIMCUsuario4 = servicio.calcularIMC(personaUsuario4);
        
        boolean mayorEdadUsuario1 = servicio.esMayorDeEdad(personaUsuario1);
        boolean mayorEdadUsuario2 = servicio.esMayorDeEdad(personaUsuario2);
        boolean mayorEdadUsuario3 = servicio.esMayorDeEdad(personaUsuario3);
        boolean mayorEdadUsuario4 = servicio.esMayorDeEdad(personaUsuario4);
        
        // porcentaje IMC
        
        int totalPersonas = 4;
        
        int vectorIMC[] = new int[totalPersonas];
        int contadorPesoIdeal = 0;
        int contadorSobrepeso = 0;
        int contadorPorDebajoDelPeso = 0;
        
        vectorIMC[0] = calculoIMCUsuario1;
        vectorIMC[1] = calculoIMCUsuario2;
        vectorIMC[2] = calculoIMCUsuario3;
        vectorIMC[3] = calculoIMCUsuario4;
        
        for (int i = 0; i < 4; i++) {
            
            switch (vectorIMC[i]) {
                case -1:
                    contadorPorDebajoDelPeso++;
                    break;
                case 0:
                    contadorPesoIdeal++;
                    break;
                case 1:
                    contadorSobrepeso++;
                    break;
            }
            
        }
        
        double porcentajePesoIdeal;
        double porcentajeSobrepeso;
        double porcentajePorDebajoDelPeso;
    
        porcentajePesoIdeal = (100 / totalPersonas) * contadorPesoIdeal;
        porcentajePorDebajoDelPeso = (100 / totalPersonas) * contadorPorDebajoDelPeso;
        porcentajeSobrepeso = (100 / totalPersonas) * contadorSobrepeso;
        
        // porcentaje MAYOR DE EDAD
        
        boolean vectorMayorEdad[] = new boolean[totalPersonas];
        int contadorMayorEdad = 0;
        int contadorMenorEdad = 0;
        
        vectorMayorEdad[0] = mayorEdadUsuario1;
        vectorMayorEdad[1] = mayorEdadUsuario2;
        vectorMayorEdad[2] = mayorEdadUsuario3;
        vectorMayorEdad[3] = mayorEdadUsuario4;
        
        for (int i = 0; i < 4; i++) {
            
            if (vectorMayorEdad[i] == true) {
                
                contadorMayorEdad++;
                
            } else {
                
                contadorMenorEdad++;
                
            }
            
        }
        
        double porcentajeMayorEdad;
        double porcentajeMenorEdad;
        
        porcentajeMayorEdad = (100 / totalPersonas) * contadorMayorEdad;
        porcentajeMenorEdad = (100 / totalPersonas) * contadorMenorEdad;
        
        // Mostrar porcentajes
        
        System.out.println("El porcentaje de las edades es: ");
        System.out.println("Personas mayores de edad: " + porcentajeMayorEdad + "%");
        System.out.println("Personas menores de edad: " + porcentajeMenorEdad + "%");
        
        System.out.println("El porcentaje del IMC es: ");
        System.out.println("Personas con sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Personas con peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Personas por debajo del peso: " + porcentajePorDebajoDelPeso + "%");
        */
        
    }

}
