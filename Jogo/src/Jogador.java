public abstract class Jogador {
  private String nome;
  private int xp = 0;
  private int hp = 100;
  private boolean envenenado = false;

  public Jogador() {

  }

  public Jogador(String nome) {
      this.nome = nome;
  }
  public boolean isEnvenenado(){
      return this.envenenado;
  }

  public void receberDano(int pontos){

      this.hp -= pontos;

  }

  public void receberCura(int pontos){
      this.hp += pontos;

  }

  public void ganharExperiencia(int pontos){
       this.xp +=pontos;
  }

  public void receberAntidoto(){
    this.envenenado = !this.envenenado;
  }

  public int getXp() {
      return xp;
  }

  public int getHp() {
      return hp;
  }

  public String getNome() {
    return nome;
  }

  

}
