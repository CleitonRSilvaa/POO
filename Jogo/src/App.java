public class App {
    public static void main(String[] args) throws Exception {
      var jogador1 =  new Jogador("Cleiton");
      System.out.println(jogador1.getNome());
      jogador1.receberDano(30);
      System.out.println(jogador1.getHp());


      
    }
}
