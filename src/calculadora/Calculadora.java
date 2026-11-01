package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 *
 * @author Arthur
 * @version 1.0
 */
public class Calculadora {

    /* Armazena o resultado da operação realizada. */
    public int r = 0;

    /**
     * Realiza uma operação matemática básica.
     *
     * @param a primeiro valor da operação
     * @param b segundo valor da operação
     * @param op operador da operação
     * @return resultado da operação
     */
    public int calc(int a, int b, String op) {

        switch (op) {
            case "+":
                r = a + b;
                break;

            case "-":
                r = a - b;
                break;

            case "*":
                r = a * b;
                break;

            case "/":
                r = dividir(a, b);
                break;

            default:
                System.out.println("Operacao invalida");
                r = 0;
                break;
        }

        System.out.println("Resultado = " + r);
        return r;
    }

    /**
     * Realiza a divisão entre dois valores.
     *
     * @param a dividendo
     * @param b divisor
     * @return resultado da divisão ou 0 caso o divisor seja zero
     */
    private int dividir(int a, int b) {

        if (b != 0) {
            return a / b;
        }

        System.out.println("Erro: divisao por zero, operação irregular");
        return 0;
    }
}