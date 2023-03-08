import java.math.BigDecimal;

public final class Presidente extends Funcionario {

  private BigDecimal valorContaAcao;

  public Presidente(String nome, BigDecimal salario, String codigo, BigDecimal valorContaAcao) {
    super(nome, salario, codigo);
    this.valorContaAcao = valorContaAcao;
  }

  @Override
  public BigDecimal calcularSalario() {
      return getSalario().add(valorContaAcao);
  }

  @Override
  public String toString() {
    return "Presidente [valorContaAcao=" + valorContaAcao + "]";
  }

  


  



  
}
