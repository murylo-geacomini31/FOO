package domain;

import java.util.List;

public class Curso {
    private String nomeCurso;
    private int duracao;
    private List<Disciplina> disciplinas;
    private String titulacao; // Bacharel, Mestre, Doutor
    private int cargaHoraria;

    public Curso(){
    }

    public Curso(String nomeCurso, int duracao, List<Disciplina> disciplinas, String titulacao, int cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.duracao = duracao;
        this.disciplinas = disciplinas;
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
