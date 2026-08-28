package domain;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Pessoa{
    private String formacao;
    private String titulacao; // Bacharel, Mestre, Doutor
    private List<Curso> ListCurso;
    private List<Disciplina> ListDisciplina;

    public Professor(){
    }

    public Professor(String formacao, String titulacao, List<Curso> listCurso, List<Disciplina> listDisciplina) {
        this.formacao = formacao;
        this.titulacao = titulacao;
        ListCurso = listCurso;
        ListDisciplina = listDisciplina;
    }

    public Professor(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, String email, String telefone, String genero, String etnia, String formacao, String titulacao, List<Curso> listCurso, List<Disciplina> listDisciplina) {
        super(nome, cpf, dataNascimento, endereco, email, telefone, genero, etnia);
        this.formacao = formacao;
        this.titulacao = titulacao;
        ListCurso = listCurso;
        ListDisciplina = listDisciplina;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<Curso> getListCurso() {
        return ListCurso;
    }

    public void setListCurso(List<Curso> listCurso) {
        ListCurso = listCurso;
    }

    public List<Disciplina> getListDisciplina() {
        return ListDisciplina;
    }

    public void setListDisciplina(List<Disciplina> listDisciplina) {
        ListDisciplina = listDisciplina;
    }
}
