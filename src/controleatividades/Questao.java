package controleatividades;
import java.util.ArrayList;
/**
 *
 * @author stefa
 */
public class Questao {
    private int codQ;
    private String enunciado;
    private Disciplina disciplina;
    private Conteudo conteudo;
    private Alternativa alternativas;

    public Questao() {
        
    }

    public Questao(int codQ, String enunciado, Disciplina disciplina, Conteudo conteudo, Alternativa alternativas) {
        this.codQ = codQ;
        this.enunciado = enunciado;
        this.disciplina = disciplina;
        this.conteudo = conteudo;
        this.alternativas = alternativas;
    }
 
 
    public int getCodQ() {
        return codQ;
    }

    public void setCodQ(int codQ) {
        this.codQ = codQ;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Conteudo getConteudo() {
        return conteudo;
    }

    public Alternativa getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Alternativa alternativas) {
        this.alternativas = alternativas;
    }
      
    @Override
    public String toString() {
        return "Questao{" + "codQ=" + codQ + ", enunciado=" + enunciado + ", disciplina=" + disciplina + ", alternativa=" + alternativas + ", conteudo=" + conteudo +'}';
    }  
    
}
