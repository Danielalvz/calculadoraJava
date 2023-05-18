package com.sofkau.calculadora;
/**
 * Esta clase contiene la funcion de realizar operacion
 * la cual contiene un condicional, y recibe parametros como el tipo de operacion a realizar y los numeros a operar
 *
 * @author Daniela Lozano
 *
 */
public class Funciones {
	
	private static double resultado = 0;

	/**
	 * realizarOperacion Calcula la operación matematica basica entre dos números dados, tipo double
	 * 
	 * @param operacion - El simbolo de la operación matematica que se va a realizar, es un String
	 * @param a - Valor a es el primer numero o el resultado anterior, con el que se hará la operación
	 * @param b - Valor b es el segundo numero con el  que se hace la operación
	 * @return resultado - es el total de la operación realizada segun los numeros y su operador
	 */
	static double realizarOperacion(String operacion, double a, double b) {

        switch (operacion) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("No se puede dividir por cero. El resultado se establecerá en 0.");
                }
                break;
            case "%":
                if (b != 0) {
                    resultado = a % b;
                } else {
                    System.out.println("ERROR: No se puede dividir por cero. El resultado se establecerá en 0.");
                }
                break;
            default:
                System.out.println("ERROR: Operación no válida. El resultado se establecerá en 0.");
                break;
        }
        return resultado;
    }
}
