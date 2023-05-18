package com.sofkau.calculadora;
import java.util.Scanner;

/** Clase Calculadora representa una calculadora básica en consola que
 * permite al usuario realizar operaciones matematicas simples
 *
 * @author Daniela Lozano
 * @version 1.0
 */
public class Calculadora {
    public static void main(String[] args) {
        boolean continuar = true;
        double resultado = 0;
        double resultadoAcumulado = 0;
        int i = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido!");
        System.out.println("Con esta calculadora en consola, podrá realizar operaciones básicas");

        System.out.print("Ingrese el primer número: ");
        double numeroOperar = in.nextDouble();

        // continuar - Variable booleana para controlar si se debe continuar con las operaciones
        while (continuar) {
            System.out.println("Ingrese la operación que desea realizar:");
            System.out.println("Simbolos disponibles +, -, *, /, %, =");
            String operacion = in.next();

            // Comprobar si la operación no es la finalización
            if (!operacion.equals("=")) {
                // Solicitar al usuario que ingrese el número con el que se realizará la operación
                System.out.println("Ingrese un numero a operar");
                double operando = in.nextDouble();

                //Condicional para determinar si se acumula el resultado anterior, y con ese se haria la proxima operación o se utiliza el primer número ingresado
                if(i > 0) {
                    resultadoAcumulado = resultado;
                } else {
                    resultadoAcumulado = numeroOperar;
                }

                //Variable que muestra el resultado de la operación realizada
                resultado= Funciones.realizarOperacion(operacion, resultadoAcumulado, operando);
                System.out.println("Total actual: " + resultado);
            } else {
                // Si la operación es "=", finalizar el bucle y mostrar el resultado final
                continuar = false;
                System.out.println(resultado);
            }
            i++;
        }
    } 
}
