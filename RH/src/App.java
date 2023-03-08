import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        var p =  new Presidente("Cleiton Silva",
         new BigDecimal(25000), 
         "69596555965" , 
         new BigDecimal(4000)
        );
        var e = new Engenheiro(
            "Cleiton", 
            new BigDecimal(65000),
            "88787887",
            "88767679",
            "947897358"
        );

        System.out.println(p);
        System.out.println(e);
        
    }
}
