public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 22.0;

    // fluxo simples
    if(valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;

      System.out.println("Novo saldo R$: "+ saldo);
      //fluxo composto
    }else{
      System.out.println("Seu saldo é insuficiente: "+ "Saldo atual: "+ saldo);
    }
  }
}
