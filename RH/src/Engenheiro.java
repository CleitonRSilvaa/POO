import java.math.BigDecimal;

public class Engenheiro extends Funcionario{

  
  private  String codigcoCrea;
  private  String departamento;
  
  public Engenheiro(String nome, BigDecimal salario, String codigo, String codigcoCrea, String departamento) {
    super(nome, salario, codigo);
    this.codigcoCrea = codigcoCrea;
    this.departamento = departamento;
  }

  public String getCodigcoCrea() {
    return codigcoCrea;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  
  @Override
  public BigDecimal calcularSalario() {
    return getSalario().multiply(new BigDecimal(0.5));
  }  
  
}
