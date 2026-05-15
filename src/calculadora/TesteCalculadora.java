package calculadora;

/**
 * Classe de teste para validar as funcionalidades da Calculadora.
 * Demonstra entradas, resultados esperados e obtidos.
 * 
 * @author Antigravity
 * @version 1.1
 */
public class TesteCalculadora {

    /**
     * Ponto de entrada dos testes.
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== INICIANDO TESTES DA CALCULADORA ===");
        
        testar(calc, 10, 5, "+", 15.0);
        testar(calc, 10, 5, "-", 5.0);
        testar(calc, 10, 5, "*", 50.0);
        testar(calc, 10, 2, "/", 5.0);
        testar(calc, 10, 0, "/", 0.0); // Divisão por zero
        testar(calc, 10, 5, "?", 0.0); // Operação inválida

        System.out.println("=== TESTES FINALIZADOS ===");
    }

    /**
     * Método auxiliar para execução e verificação de um caso de teste.
     * 
     * @param calc     Instância da calculadora
     * @param a        Operando A
     * @param b        Operando B
     * @param op       Operação
     * @param esperado Resultado esperado
     */
    private static void testar(Calculadora calc, int a, int b, String op, double esperado) {
        double obtido = calc.calc(a, b, op);
        System.out.println("Entrada: " + a + " " + op + " " + b);
        System.out.println("Esperado: " + esperado);
        System.out.println("Obtido: " + obtido);
        System.out.println(obtido == esperado ? "Status: [SUCESSO]" : "Status: [FALHA]");
        System.out.println("---------------------------------------");
    }
}
