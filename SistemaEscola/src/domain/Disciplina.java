package domain;

public class Disciplina {
    private String nomeDisciplina;
    private int cagaHoraria;

    public Disciplina() {
    }

    public Disciplina(String nomeDisciplina, int cagaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cagaHoraria = cagaHoraria;
    }

    public int getCagaHoraria() {
        return cagaHoraria;
    }

    public void setCagaHoraria(int cagaHoraria) {
        this.cagaHoraria = cagaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}
