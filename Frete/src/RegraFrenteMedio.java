import java.math.BigDecimal;

public class RegraFrenteMedio extends RegraFrete{

  @Override
  public BigDecimal calular(Frete frete) {
    if(frete.getDistancia()<500)
      return frete.getValorDoProduto().multiply(new BigDecimal(0.2));
    return proximo.calular(frete);
  }
  
}
