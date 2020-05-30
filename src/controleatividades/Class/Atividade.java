package controleatividades.Class;
import java.util.ArrayList;

public class Atividade {
   private int cod;
   private Turma turma;
   private String dataI;
   private String dataF;
   ArrayList<Questao> questoes;

    public Atividade() {
        questoes = new ArrayList();
    }

    public Atividade(int cod, String dataI, String dataF, Turma turma) {
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

    public void setQuestoes(Object questoes) {
        this.questoes.add((Questao) questoes);
    }

    @Override
    public String toString() {
        return "Atividade{" + "cod=" + cod + ", turma=" + turma + ", dataI=" + dataI + ", dataF=" + dataF + ", questoes=" + questoes + '}';
    } 
}
