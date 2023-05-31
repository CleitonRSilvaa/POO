import java.math.BigDecimal;

public class Frete {

  private String nomeCliente;
  private BigDecimal valorDoProduto;
  private double peso;
  private int distancia;


  public Frete(String nomeCliente, BigDecimal valorDoProduto, double peso, int distancia) {
    this.nomeCliente = nomeCliente;
    this.valorDoProduto = valorDoProduto;
    this.peso = peso;
    this.distancia = distancia;
  }




  public static FreteBuilder builder(){
    return new FreteBuilder();
  }


  public String getNomeCliente() {
    return nomeCliente;
  }


  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }


  public BigDecimal getValorDoProduto() {
    return valorDoProduto;
  }


  public void setValorDoProduto(BigDecimal valorDoProduto) {
    this.valorDoProduto = valorDoProduto;
  }


  public double getPeso() {
    return peso;
  }


  public void setPeso(double peso) {
    this.peso = peso;
  }


  public int getDistancia() {
    return distancia;
  }


  public void setDistancia(int distancia) {
    this.distancia = distancia;
  }




  @Override
  public String toString() {
    return "Frete [nomeCliente= " + nomeCliente + ", valorDoProduto= " + valorDoProduto + ", peso= " + peso
        + ", distancia= " + distancia + "]";
  }

  







  
}
