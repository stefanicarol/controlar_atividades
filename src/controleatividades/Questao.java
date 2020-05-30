package controleatividades;
 /**
 *
 * @author stefa
 */
public class Questao {
    private int codQ;
    private String enunciado;
    private Disciplina disciplina;
    private Conteudo conteudo;
    private Alternativa alternativa;
    

    public Questao() {
        
    }

    public Questao(int codQ, String enunciado, Disciplina disciplina, Conteudo conteudo, Alternativa alternativa) {
        this.codQ = codQ;
        this.enunciado = enunciado;
        this.disciplina = disciplina;
        this.conteudo = conteudo;
        this.alternativa = alternativa;
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
        return alternativa;
    }

    public void setAlternativas(Alternativa alternativas) {
        this.alternativa = alternativas;
    }
    
//    public void alternativa(int codA, String a, String b, String c, String d, String e, String certa){
//        alternativa.add(new Alternativa(codA,a,b,c,d,e,certa));
//    }
       
    @Override
    public String toString() {
        return "Questao{" + "codQ=" + codQ + ", enunciado=" + enunciado + ", disciplina=" + disciplina + ", alternativa=" + alternativa + ", conteudo=" + conteudo +'}';
    }  
    
}
