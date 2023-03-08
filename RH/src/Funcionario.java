import java.math.BigDecimal;

public abstract class Funcionario {
  
  private String nome;
  private BigDecimal salario;
  private String codigo;
 
  public Funcionario(String nome, BigDecimal salario, String codigo) {
    this.nome = nome;
    this.salario = salario;
    this.codigo = codigo;
  }

  public abstract  BigDecimal calcularSalario();

  public String getNome() {
    return nome;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public String getCodigo() {
    return codigo;
  }

  
  
}
