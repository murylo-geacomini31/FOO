package domain;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String ra;
    private Curso curso;
    private int semestre;
    private String turno;

    public Aluno(){
    }

    public Aluno(String ra, Curso curso, int semestre, String turno) {
        this.ra = ra;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }

    public Aluno(String nome, String cpf, LocalDate dataNascimento, Endereco endereco, String email, String telefone, String genero, String etnia, String ra, Curso curso, int semestre, String turno) {
        super(nome, cpf, dataNascimento, endereco, email, telefone, genero, etnia);
        this.ra = ra;
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
