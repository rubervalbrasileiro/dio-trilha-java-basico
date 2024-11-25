
import java.util.Scanner;

public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 7;

    // condições ternarias com o mesmo exemplo de notas abaixo

    String resultado = nota >= 7 ? " Aprovado " : nota >= 5 && nota < 7 ? "Recuperação " : " Reprovado ";
    System.out.println(resultado + nota);

    /*
     * //condições ternarias com o mesmo exemplo de notas abaixo
     * 
     * String resultado = nota >= 7 ? " Aprovado " : " Reprovado ";
     * System.out.println(resultado+ nota);
     */

    /*
     * //exemplo de condições silpmes e encadeadas
     * if (nota >= 7) {
     * System.out.println("Aprovado " + nota);
     * 
     * // condições encadeadas com um ou mais else if
     * } else if (nota >= 5 && nota < 7) {
     * System.out.println("Aluno em Recuperação: " + nota);
     * }
     * 
     * else
     * System.out.println("Reprovado " + nota);
     */
  }

}
