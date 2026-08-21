public class Pessoa {
    private String nome;
    private int idade;
    private String genero;
    private float altura;
    private double peso;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, float altura, double peso, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
        //ajustaGenero(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //Getter e Setter: Pesquisar sobre
    //get set
}
