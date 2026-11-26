public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Calculadora GitHub");
        System.out.println("Suma: " + sumar(8, 4));
        System.out.println("Resta: " + restar(8, 4));
        System.out.println("Multiplicación: " + multiplicar(8, 4));
        System.out.println("División: " + dividir(8, 4));
        System.out.println("División por cero: " + dividir(8, 0));
        System.out.println("Potencia (8^4): " + potencia(2, 3));
        System.out.println("¿Es par 4?: " + esPar(4));
        System.out.println("¿Es par 1?: " + esPar(7));
    }
    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}