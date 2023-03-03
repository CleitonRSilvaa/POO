public class App {
    public static void main(String[] args) throws Exception {
        var contaCorrente = new ContaCorrente(662122, 235550, 65);
        System.out.println(contaCorrente.calcularSaldo());
        
        var contaVip =  new ContaVip(66665522, 32000, 10000000);

        var contaPoupanca = new ContaCorrente(2000, 650, 0.9);

    }
}
