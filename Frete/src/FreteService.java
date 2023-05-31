import java.math.BigDecimal;

public class FreteService {

  public BigDecimal calcularValor( Frete frete){

      return new RegraFrenteCurto()
                .depois(new RegraFrenteMedio())
                .depois(new RegraFrenteLongo())
                .calular(frete);
  }



  
}
