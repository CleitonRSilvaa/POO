public class Mago extends Jogador implements Acao {

  private int mp;

  public Mago(int mp) {
    this.mp = mp;
  }

  public Mago(String nome, int mp) {
    super(nome);
    this.mp = mp;
  }

  public int getMp() {
    return mp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  @Override
  public void mover(int x, int y) {
    
  }
  
}
