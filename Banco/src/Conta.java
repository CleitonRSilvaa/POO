public class Conta {
    
  private  int numero;
  protected double saldo;
  


  public Conta(int numero, double saldo) {
      this.numero = numero;
      this.saldo = saldo;
      
  }

  public int getNumero() {
      return numero;
  }

  public double calcularSaldo() {
      return saldo;
  }


  public void depositar(double valor){

      this.saldo += valor;

  }

  public void sacar(double valor){
      if (valor > this.saldo) {
          System.out.println("Saldo insuficiante");
      }
      else {
          this.saldo = saldo-valor;
      }

  }
}
