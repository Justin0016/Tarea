
public abstract class CalculadoraBase implements IOperaciones {
    @Override
    public double Sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double Restar(double a, double b) {
        return a - b;
    }

    @Override
    public double Multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double Dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre 0");
        return a / b;
    }

    @Override
    public double CalcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalcularVolumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    @Override
    public double CalcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
