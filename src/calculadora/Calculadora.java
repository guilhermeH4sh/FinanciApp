package calculadora;

public class Calculadora {

    public double calc(int a, int b, String op) {
        double result = 0;

        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero não permitida.");
                return 0;
            }
            result = (double) a / b;
        } else {
            System.out.println("Erro: Operação inválida.");
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println("Resultado: " + c.calc(10, 5, "+"));
    }
}
