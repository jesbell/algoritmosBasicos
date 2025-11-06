import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("==Es par o no?==");
        System.out.println("4 es par? " + Algoritmos.esPar(4) );
        System.out.println("7 es par? " + Algoritmos.esPar(7) );
        System.out.println();

        System.out.println("==es primo?==");
        System.out.println("30 es primo? " + Algoritmos.esPrimo(30) );
        System.out.println("13 es primo? " + Algoritmos.esPrimo(13) );
        System.out.println("9 es primo? " + Algoritmos.esPrimo(9) );
        System.out.println("2 es primo? " + Algoritmos.esPrimo(2) );
        System.out.println("1 es primo? " + Algoritmos.esPrimo(1) );
        System.out.println();


        System.out.println("==String en reversa==");
        System.out.println("PALABRA al reves es:" + Algoritmos.stringEnReversa("PALABRA"));
        System.out.println("Murcielago al reves es: " + Algoritmos.stringEnReversa("Murcielago"));
        System.out.println();

        System.out.println("==Es palindromo?==");
        System.out.println("Reconocer es palindromo? " + Algoritmos.esPalindromo("Reconocer"));
        System.out.println("automovil es palidromo? " + Algoritmos.esPalindromo("automovil"));
        System.out.println();

        System.out.println("==Secuencia fizzbuzz==");
        Algoritmos.secuenciaFizzBuzz(15);
    }
}
