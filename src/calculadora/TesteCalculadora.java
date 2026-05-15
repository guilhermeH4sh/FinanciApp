package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, 10, 5, "+", 15.0);
        testar(calc, 10, 5, "-", 5.0);
        testar(calc, 10, 5, "*", 50.0);
        testar(calc, 10, 2, "/", 5.0);
        testar(calc, 10, 0, "/", 0.0); // Divisão por zero
        testar(calc, 10, 5, "?", 0.0); // Operação inválida
    }

    private static void testar(Calculadora calc, int a, int b, String op, double esperado) {
        double obtido = calc.calc(a, b, op);
        System.out.println("Entrada: " + a + " " + op + " " + b);
        System.out.println("Esperado: " + esperado);
        System.out.println("Obtido: " + obtido);
        System.out.println(obtido == esperado ? "Status: SUCESSO" : "Status: FALHA");
        System.out.println("-------------------------");
    }
}
