import java.math.BigDecimal;

public class Gerente extends Funcionario  {

  private String area;
  private BigDecimal bonus;


  public Gerente(String nome, BigDecimal salario, String codigo, String area, BigDecimal bonus) {
    super(nome, salario, codigo);
    this.area = area;
    this.bonus = bonus;
  }

  public void setArea(String area) {
    this.area = area;
  }


  @Override
  public BigDecimal calcularSalario() {
    return this.getSalario().add (bonus) ;
  }

   
}