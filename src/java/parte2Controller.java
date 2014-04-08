
import javax.faces.bean.ManagedBean;

/**
 *
 * @author pedro
 */
@ManagedBean (name="parte2Controller")
public class parte2Controller {

private Float media;
private String resultado;
private aluno Aluno = new aluno();

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getNome() {
        return Aluno.getNome();
    }

    public void setNome(String nome) {
        Aluno.setNome(nome);
    }

    public Float getN1() {
        return Aluno.getN1();
    }

    public void setN1(Float n1) {
        Aluno.setN1(n1);
    }

    public Float getN2() {
        return Aluno.getN2();
    }

    public void setN2(Float n2) {
     Aluno.setN2(n2);
    }

    public Float getN3() {
     return Aluno.getN3();
    }

    public void setN3(Float n3) {
     Aluno.setN3(n3);
    }

    public Float getN4() {
        return Aluno.getN4();
    }

    public void setN4(Float n4) {
        Aluno.setN4(n4);
    }

    public Float getMedia() {
        return media;
    }

 public String confirmaAction(){
    media=Aluno.calculaMedia();
    resultado=Aluno.calculaResultado();
    return "";
}
}
