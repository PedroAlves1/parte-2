
import javax.faces.bean.ManagedBean;
/**
 *
 * @author pedro
 */
@ManagedBean(name="indexController")
public class indexController {
    
private Float n1;
private Float n2;
private Float resultado;

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

    public Float getResultado() {
        return resultado;
    }

    public void setResultado(Float resultado) {
        this.resultado = resultado;
    }
    public String adicionarAction(){
        resultado=(n1+n2);
        
        return "";
    }
   public String subtrairAction(){
       resultado=(n1-n2);
    return "";       
   }
   public String multiplicarAction(){
       resultado=(n1*n2);
   return "";
   }
   public String dividirAction (){
       resultado=(n1/n2);
   return "";
   }
}
