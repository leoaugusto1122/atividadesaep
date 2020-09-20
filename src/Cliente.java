public class Cliente {
    private String nome;
    private Locacao locacao;

    // Cria um cliente com seu nome e locacao.
    public Cliente(String nome) {
        this.nome = nome;
        this.locacao = new Locacao();
    }

    // Métodos acessores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
}