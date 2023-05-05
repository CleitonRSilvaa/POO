import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        FreteService service = new FreteService();


       var frete = Frete.builder()
        .nomeDoCliente("Cleiton")
        .valorDoProduto(new BigDecimal(100))
        .distancia(650)
        .peso(3.9).build();
        
        System.out.println(frete);
        System.out.println(service.calcularValor(frete));

       
    }
}
