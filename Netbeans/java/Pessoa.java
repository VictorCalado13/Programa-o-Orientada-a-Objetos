//Nome:Victor Ribeiro Calado
//RA: 2313553

public abstract class Pessoa {

    private String nome;
    private String endereco;
    private String cidade;
    private int idade;
    private long cpf;

    //Polimorfismo por Sobrecarga
    public Pessoa() {

        nome = "";
        endereco = "";
        cidade = "";
        idade = 0;
        cpf = 0;

    }

    public Pessoa(String nome, String endereco, String cidade, int idade, long cpf){

        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.idade = idade;
        this.cpf = cpf;

    }

    public  Pessoa(Pessoa p){

        this.nome = p.getNome();
        this.endereco = p.getEndereco();
        this.cidade = p.getCidade();
        this.idade  = p.getIdade();
        this.cpf = getCpf();

    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public int getIdade() {
        return idade;
    }

    public long getCpf() {
        return cpf;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
