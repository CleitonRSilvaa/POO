import java.math.BigDecimal;


public class App {
    public static void main(String[] args) throws Exception {
        var p =  new Presidente(
            "Presidente da Silva",
            new BigDecimal(25000), 
            "69596555965" , 
            new BigDecimal(35000)
        );
        var e = new Engenheiro(
            "Engenheiro da Silva", 
            new BigDecimal(1000),
            "88787887",
            "88767679",
            "947897358"
        );
        
        var g = new Gerente(
            "Gerente da Silva", 
            new BigDecimal(10000),
            "11111998",
            "Informatica",
            new BigDecimal(3000));

        System.out.println("Salario total: "+ p.calcularSalario());
        System.out.println("Salario total: "+ e.calcularSalario());
        System.out.println("Salario total: "+ g.calcularSalario());
         
    }
}
