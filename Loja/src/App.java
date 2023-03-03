import javax.swing.CellEditor;

public class App {
    public static void main(String[] args) throws Exception {
        var livro1 =  new Livro("Qual é a tua Obra", 22.2f, "Maio Sergio Cortella");
        System.out.println(livro1.toString());
        

        var calular = new Eletronico("Xiaomi 13", 3223, "Xiaomi", "xi-1233");

        System.out.println(calular.toString());

    }
}
