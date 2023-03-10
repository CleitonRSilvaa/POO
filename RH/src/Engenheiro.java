import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

  
  private  String codigoCrea;
  private  String departamento;
  
  public Engenheiro(String nome, BigDecimal salario, String codigo, String codigoCrea, String departamento) {
    super(nome, salario, codigo);
    this.codigoCrea = codigoCrea;
    this.departamento = departamento;
  }

  public String getCodigcoCrea() {
    return codigoCrea;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  
  @Override
  public BigDecimal calcularSalario() {
    return getSalario().add(getSalario().multiply(new BigDecimal(0.5)));
  }  
  
}
