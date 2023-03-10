import java.math.BigDecimal;

public final class Presidente extends Funcionario {

  private BigDecimal valorContaAcoes;

  public Presidente(String nome, BigDecimal salario, String codigo, BigDecimal valorContaAcoes) {
    super(nome, salario, codigo);
    this.valorContaAcoes = valorContaAcoes;
  }

  @Override
  public BigDecimal calcularSalario() {
      return getSalario().add(valorContaAcoes);
  }

}
