
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
@ManagedBean (name="pecaController")
public class pecaController {
    private double imposto;
    private double frete;
    private peca Peca = new peca();

    public String getNome() {
        return Peca.getNome();
    }

    public void setNome(String nome) {
        Peca.setNome(nome);
    }

    public String getDescricao() {
        return Peca.getDescricao();
    }

    public void setDescricao(String descricao) {
        Peca.setDescricao(descricao);
    }
    public Float getPreco(){
        return Peca.getPreco();
    }
    public void setPreco(Float preco){
        Peca.setPreco(preco);
    }
        public Float getPeso(){
        return Peca.getPeso();
    }
    public void setPeso(Float peso){
        Peca.setPeso(peso);
    }
    
    public double getFrete() {
        return frete;
    }

    public void setFrete(Float frete) {
        this.frete = frete;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    
    public String confirmaAction(){
        frete=Peca.calculaFrete();
        imposto=Peca.calculaImposto();
        
        return "";
    }
    
}
