/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class carro {
    private String modelo;
    private Integer ano;
    private Float preco;
    private Float consumo;
    private String tipo;
    private String descricao;
    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getConsumo() {
        return consumo;
    }

    public void setConsumo(Float consumo) {
        this.consumo = consumo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double consultaIpva() {
        double ipva;
        Integer anoatual;
        anoatual = 2014;
        if((anoatual - ano) > 20){
            ipva=0.00*preco;
        }else{
            if("G".equals(tipo)){
                ipva=0.04*preco;
            }
            else{
                if("A".equals(tipo)){
                    
                ipva=0.03*preco;
                }
                else{
                    ipva=-8888888;
                }
            }
        }
        
        
        return ipva;
    }
}

