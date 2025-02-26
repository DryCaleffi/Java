/**
 * @autor: Adryelle Calefi
 * @since 2025 fev
 * @version 0.1 beta
 * Classe operação com método somar sobrecarregado
 *
 */
public class Operação {
    public int valor1; //atributo valor1
    public int valor2; // atributo valor2

    /**
     * Método somar( int n1, int n2)
     * @param n1 - primeiro valor passado na função
     * @param n2 - segundo valor passado na função
     * @return - o resultado da soma dos dois valores
     */
    public int somar(int n1, int n2) {
        return  n1+n2;
    }

    /**
     * Método somar que usa os atributos dos objetos
     *
     * @return retorna a soma dos dois atributos
     */
    public int somar (){
        return valor1+valor2;
    }
/* comentário de mais de uma linha */

}
