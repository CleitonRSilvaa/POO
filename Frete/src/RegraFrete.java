import java.math.BigDecimal;

public abstract class RegraFrete {

  protected RegraFrete proximo;

  public abstract BigDecimal calular(Frete frete );

  public RegraFrete depois(RegraFrete regra){
    this.proximo = regra;
    return this;
  }





  
}
