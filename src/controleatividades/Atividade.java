/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatividades;

import java.util.ArrayList;

/**
 *
 * @author stefa
 */
public class Atividade {
   private int cod;
   private Turma turma;
   private String dataI;
   private String dataF;
   ArrayList<Questao> questoes;

    public Atividade() {
        questoes = new ArrayList();
    }

    public Atividade(int cod, Turma turma, String dataI, String dataF) {
        this.cod = cod;
        this.turma = turma;
        this.dataI = dataI;
        this.dataF = dataF;
        questoes = new ArrayList();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getDataI() {
        return dataI;
    }

    public void setDataI(String dataI) {
        this.dataI = dataI;
    }

    public String getDataF() {
        return dataF;
    }

    public void setDataF(String dataF) {
        this.dataF = dataF;
    }

    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questao> questoes) {
        this.questoes = questoes;
    }

    @Override
    public String toString() {
        return "Atividade{" + "cod=" + cod + ", turma=" + turma + ", dataI=" + dataI + ", dataF=" + dataF + ", questoes=" + questoes + '}';
    } 
}
