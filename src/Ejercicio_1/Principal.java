package Ejercicio_1;

public class Principal {

	public static void main(String[] args) {
		System.out.println("a) Generar los n primeros numeros de la serie de Fibonacci");
        fibonacci(5); 
        fibonacci(10);
        fibonacci(15);
        
        System.out.println("\n\nb) Suma los digitos de un numero x");
        int numero = 12345;
        System.out.println("Suma de los dígitos de " + numero + ": " + sumaDigitos(numero));

        System.out.println("\nc) Halla el valor de un numero X elevado a la potencia Y");
        int base = 2;
        int exponente = 5;
        System.out.println(base + " elevado a la potencia " + exponente + ": " + potencia(base, exponente));
    }
	
	// a.
    public static void serieFibonacci(int n, int a, int b, int count) {
        if (count < n) {
            System.out.print(a + " ");
            serieFibonacci(n, b, a + b, count + 1);
        }
    }
    // metodo auxiliar para fibonacci
    public static void fibonacci(int n) {
        System.out.println("\nSerie de Fibonacci para n = " + n + ":");
        serieFibonacci(n, 0, 1, 0);
    }

    // b.
    public static int sumaDigitos(int x) {
        if (x == 0) {
            return 0;
        }
        return (x % 10) + sumaDigitos(x / 10);
    }

    // c.
    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * potencia(x, y - 1);
    }

}
