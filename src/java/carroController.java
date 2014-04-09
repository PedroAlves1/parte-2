
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
@ManagedBean (name="carroController")
public class carroController {
    private double ipva;
    private carro Carro = new carro();
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getModelo() {
        return Carro.getModelo();
    }

    public void setModelo(String modelo) {
        Carro.setModelo(modelo);
    }

    public Integer getAno() {
        return Carro.getAno();
    }

    public void setAno(Integer ano) {
        Carro.setAno(ano);
    }

    public Float getPreco() {
        return Carro.getPreco();
    }

    public void setPreco(Float preco) {
        Carro.setPreco(preco);
    }

    public Float getConsumo() {
    return Carro.getConsumo();
        }

    public void setConsumo(Float consumo) {
        Carro.setConsumo(consumo);
    }

    public String getTipo() {
        return Carro.getTipo();
    }

    public void setTipo(String tipo) {
        Carro.setTipo(tipo);
    }

    public String getDescricao() {
        return Carro.getDescricao();
    }

    public void setDescricao(String descricao) {
        Carro.setDescricao(descricao);
    }

    public double getIpva() {
        return ipva;
    }

    public void setIpva(double ipva) {
        this.ipva = ipva;
    }
    
    public String confirmaAction(){
        ipva=Carro.consultaIpva();
        if(ipva==-8888888){
            mensagem="Erro, digite corretamente o tipo de consumo do veículo (G para Gasolina ou A para álcool)";
        }
        else{
            mensagem="";
        }
        return "";
    }
    
}
