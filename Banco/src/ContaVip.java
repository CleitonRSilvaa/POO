public class ContaVip extends Conta {

  private double limite;

  public ContaVip(int numero, double saldo, double limite) {
    super(numero, saldo);
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }

  public double calcularSaldo(){

    return saldo + this.limite;

  }
  
}
