import java.math.BigDecimal;

public class RegraFrenteCurto extends RegraFrete{

  @Override
  public BigDecimal calular(Frete frete) {
    if(frete.getDistancia()<100)
      return frete.getValorDoProduto().multiply(new BigDecimal(0.1));
    return proximo.calular(frete);
  }
  
}
