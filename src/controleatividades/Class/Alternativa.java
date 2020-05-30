package controleatividades.Class;
public class Alternativa {
    private int codA;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String certa;

    public Alternativa() {
    }

    public Alternativa(int codA, String a, String b, String c, String d, String e, String certa) {
        this.codA = codA;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.certa = certa;
    }

    public int getCodA() {
        return codA;
    }

    public void setCodA(int codA) {
        this.codA = codA;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getCerta() {
        return certa;
    }

    public void setCerta(String certa) {
        this.certa = certa;
    }

    @Override
    public String toString() {
        return "Alternativa{" + "codA=" + codA + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", certa=" + certa + '}';
    } 
}
