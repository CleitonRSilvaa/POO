public class Produto {

   protected String nome;
   protected float preco;

    protected Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preço=" + preco +
                '}';
    }



}
