package Controller;

public class Equipamentos {
    
    private int id;
    private String nome;
    private String Marca;
    private String Descricao;
    private int quantidade;
    private String Sala;
    private Double preco;
    private int idFuncionario;

    public Equipamentos(int id, String nome, String Marca, String Descricao, int quantidade, String Sala,Double preco) {
        this.id = id;
        this.nome = nome;
        this.Marca = Marca;
        this.Descricao = Descricao;
        this.quantidade = quantidade;
        this.Sala = Sala;
        this.preco = preco;
    }

    public Equipamentos(){
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getSala() {
        return Sala;
    }

    public void setSala(String Sala) {
        this.Sala = Sala;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
