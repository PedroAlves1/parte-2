
import javax.faces.bean.ManagedBean;

/**
 *
 * @author pedro
 */
@ManagedBean (name="parte2Controllerbackup")
public class newindexController{
private String nome;
private Float n1;
private Float n2;
private Float n3;
private Float n4;
private Float media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getN1() {
        return n1;
    }

    public void setN1(Float n1) {
        this.n1 = n1;
    }

    public Float getN2() {
        return n2;
    }

    public void setN2(Float n2) {
        this.n2 = n2;
    }

    public Float getN3() {
        return n3;
    }

    public void setN3(Float n3) {
        this.n3 = n3;
    }

    public Float getN4() {
        return n4;
    }

    public void setN4(Float n4) {
        this.n4 = n4;
    }

    public Float getMedia() {
        return media;
    }

    public void setMedia(Float media) {
        this.media = media;
    }
 public String confirmaAction(){
     media=(n1+n2+n3+n4)/4;
    return "";
}
}
