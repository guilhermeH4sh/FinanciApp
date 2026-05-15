package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Parte do módulo de cálculos do aplicativo FinançApp.
 * 
 * @author Antigravity
 * @version 1.2
 */
public class Calculadora {

    /**
     * Construtor padrão da classe Calculadora.
     */
    public Calculadora() {}

    /**
     * Atributo que armazena a versão atual do sistema de cálculos.
     */
    public static final String VERSAO = "1.2";

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     * 
     * @param a  Primeiro número (operando A)
     * @param b  Segundo número (operando B)
     * @param op Operador matemático (+, -, *, /)
     * @return O resultado da operação ou 0.0 em caso de erro
     * @throws IllegalArgumentException Caso a operação seja inválida ou b seja zero na divisão
     */
    public double calc(int a, int b, String op) {
        // Estrutura de decisão para selecionar a operação baseada no símbolo
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
     * @param a Primeiro valor
     * @param b Segundo valor
     * @return Soma de a e b
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números.
     * @param a Primeiro valor
     * @param b Segundo valor
     * @return Subtração de a e b
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números.
     * @param a Primeiro valor
     * @param b Segundo valor
     * @return Produto de a e b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números com tratamento para divisão por zero.
     * @param a Dividendo
     * @param b Divisor
     * @return Quociente da divisão ou 0.0 se b for zero
     * @throws ArithmeticException Caso ocorra tentativa de divisão por zero
     */
    private double dividir(int a, int b) {
        // Validação obrigatória para impedir falha crítica no sistema
        if (b == 0) {
            exibirMensagemErro("Divisão por zero não permitida.");
            return 0;
        }
        return (double) a / b;
    }

    /**
     * Exibe mensagens de erro no console para o usuário.
     * @param mensagem Texto do erro a ser exibido
     */
    private void exibirMensagemErro(String mensagem) {
        System.err.println("Erro: " + mensagem);
    }

    /**
     * Método principal para demonstração rápida do funcionamento da classe.
     * @param args Argumentos de linha de comando
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Versão do Sistema: " + VERSAO);
        double resultado = calculadora.calc(10, 2, "/");
        System.out.println("Resultado da demonstração: " + resultado);
    }
}
