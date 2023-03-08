import java.math.BigDecimal;

public class Gerente extends Funcionario  {

  private String area;
  private BigDecimal banus;


  public Gerente(String nome, BigDecimal salario, String codigo, String area, BigDecimal banus) {
    super(nome, salario, codigo);
    this.area = area;
    this.banus = banus;
  }


  @Override
  public BigDecimal calcularSalario() {
    return this.getSalario().add(banus) ;
  }

  


  

  
  
}
