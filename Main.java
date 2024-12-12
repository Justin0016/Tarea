
public class Main {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        System.out.println("Suma: " + calculadora.Sumar(10, 5));
        System.out.println("Resta: " + calculadora.Restar(10, 5));
        System.out.println("Multiplicación: " + calculadora.Multiplicar(10, 5));
        System.out.println("División: " + calculadora.Dividir(10, 5));
        System.out.println("Área del círculo (radio 5): " + calculadora.CalcularAreaCirculo(5));
        System.out.println("Volumen de la esfera (radio 5): " + calculadora.CalcularVolumenEsfera(5));
        System.out.println("Distancia entre (0,0) y (3,4): " + calculadora.CalcularDistancia(0, 0, 3, 4));
        System.out.println("Seno de π/2: " + calculadora.CalcularSeno(Math.PI / 2));
        System.out.println("Coseno de 0: " + calculadora.CalcularCoseno(0));
    }
}
