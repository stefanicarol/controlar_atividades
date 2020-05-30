/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatividades.Class;

/**
 *
 * @author stefa
 */
public class Turma {
    
   private int numero;
   private Disciplina disciplina;
   private String semestre;
   private String horario;
   private Professor professor;

    public Turma() {
    }

    public Turma(int numero, Disciplina disciplina, String semestre, String horario, Professor professor) {
        this.numero = numero;
        this.disciplina = disciplina;
        this.semestre = semestre;
        this.horario = horario;
        this.professor = professor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma{" + "numero=" + numero + ", disciplina=" + disciplina + ", semestre=" + semestre + ", horario=" + horario + ", professor=" + professor + '}';
    } 
}
