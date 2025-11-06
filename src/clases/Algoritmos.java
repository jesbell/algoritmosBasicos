package clases;

public class Algoritmos {

    public static boolean esPar(int numero) {
    // si el resto es 0, es par (true)
    return numero % 2 == 0;
    }

    public static boolean esPrimo(int numero) {
        // números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // se prueban divisores desde 2 porque 1 ya es divisor
        for (int i = 2; i < numero; i++) {
            // si número es divisible por i es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // ciclo termina sin encontrar divisor es primo devuelve true
        return true;
    }

    public static String stringEnReversa(String texto) {
        // StringBuilder para construir y modificar el texto
        StringBuilder reverso = new StringBuilder();

        // recorremos el texto
        for (int i = texto.length() - 1; i >= 0; i--) {
            // se obtiene el carácter en la posición i y se agrega a reverso.
            reverso.append(texto.charAt(i));
        }

        // retornamos reverso en formato String
        return reverso.toString();
    }

    public static boolean esPalindromo(String texto) {
        // usamos método stringReversa para es obtener la reversa del texto.
        String textoReverso = stringEnReversa(texto);

        // comparamos texto y textoReverso, ambos en minúsculas
        return texto.toLowerCase().equals(textoReverso.toLowerCase());
    }

    public static void secuenciaFizzBuzz(int limite) {
        // ciclo para ir del 1 hasta el número limite.
        for (int i = 1; i <= limite; i++) {
            // salida guarda lo que se imprime al final
            String salida = "";

            // divisible por 3?
            if (i % 3 == 0) {
                salida += "Fizz"; 
            }

            // divisible por 5?
            if (i % 5 == 0) {
                salida += "Buzz";
            }

            // salida esta vacía imprime numero, si no imprime el contenido de salida
            if (salida.isEmpty()) {
                System.out.print(i);
            } else {
                System.out.print(salida);
            }

            if (i < limite) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }

}
