import java.math.BigDecimal;

public class FolhaDePagamento {

  public BigDecimal totalFolhaDePagamento = BigDecimal.ZERO;

 
  public void registrar(Funcionario f){

    totalFolhaDePagamento =totalFolhaDePagamento.add(f.calcularSalario());

  };

  public BigDecimal getTotalFolhaDePagamento() {
    return totalFolhaDePagamento;
  }

  public void login(Autenticavel autenticavel){
    autenticavel.autenticar();

  }

  
}
