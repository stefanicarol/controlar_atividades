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
public class Professor {
    private int cgu;
    private String titulacao, nome;

    public Professor() {
    }

    public Professor(int cgu,String nome, String titulacao) {
        this.cgu = cgu;
        this.titulacao = titulacao;
        this.nome = nome;
    }

    public int getCgu() {
        return cgu;
    }

    public void setCgu(int cgu) {
        this.cgu = cgu;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Professor{" + "cgu=" + cgu + ", titulacao=" + titulacao + ", nome=" + nome + '}';
    }
    
}
