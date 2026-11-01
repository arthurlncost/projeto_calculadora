package calculadora;

/**
 * Classe responsável por realizar os testes da classe Calculadora.
 *
 * @author Arthur
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        // Testes rápidos
        calc.calc(2, 3, "+"); // esperado: 5
        calc.calc(10, 4, "-"); // esperado: 6
        calc.calc(3, 5, "*"); // esperado: 15
        calc.calc(8, 2, "/"); // esperado: 4
        calc.calc(8, 0, "/"); // divisão por zero
        calc.calc(5, 5, "x"); // operação inválida
    }
}