package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Parte do módulo de cálculos do aplicativo FinançApp.
 * 
 * @author Antigravity
 * @version 1.1
 */
public class Calculadora {

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     * 
     * @param a  Primeiro número (operando A)
     * @param b  Segundo número (operando B)
     * @param op Operador matemático (+, -, *, /)
     * @return O resultado da operação ou 0.0 em caso de erro
     */
    public double calc(int a, int b, String op) {
        switch (op) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                exibirMensagemErro("Operação inválida: " + op);
                return 0;
        }
    }

    /**
     * Realiza a soma de dois números.
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números com tratamento para divisão por zero.
     */
    private double dividir(int a, int b) {
        if (b == 0) {
            exibirMensagemErro("Divisão por zero não permitida.");
            return 0;
        }
        return (double) a / b;
    }

    /**
     * Exibe mensagens de erro no console.
     * @param mensagem Texto do erro
     */
    private void exibirMensagemErro(String mensagem) {
        System.err.println("Erro: " + mensagem);
    }

    /**
     * Método principal para demonstração rápida.
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.calc(20, 4, "/");
        System.out.println("Resultado da demonstração: " + resultado);
    }
}
