import java.math.BigDecimal;

public class RegraFrenteLongo extends RegraFrete{

  @Override
  public BigDecimal calular(Frete frete) {

    return frete.getValorDoProduto().multiply(new BigDecimal(0.3));
   
  }
  
}
