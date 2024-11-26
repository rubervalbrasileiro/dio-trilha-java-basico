public class ParametrosInvalidosException extends Exception {
  public ParametrosInvalidosException(String mensagem) {
    System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
  }
}
