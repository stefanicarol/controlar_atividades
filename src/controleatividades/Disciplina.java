/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatividades;

/**
 *
 * @author stefa
 */
public class Disciplina {
   private int cod;
   private String nome;
   private int qtCredito;

    public Disciplina() {
    }

    public Disciplina(int cod, String nome, int qtCredito) {
        this.cod = cod;
        this.nome = nome;
        this.qtCredito = qtCredito;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtCredito() {
        return qtCredito;
    }

    public void setQtCredito(int qtCredito) {
        this.qtCredito = qtCredito;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "cod=" + cod + ", nome=" + nome + ", qtCredito=" + qtCredito + '}';
    }
}
