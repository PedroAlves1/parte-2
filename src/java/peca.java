/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pedro
 */
public class peca {
    private String nome;
    private String descricao;
    private Float preco;
    private Float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double calculaImposto(){
    double imposto;
    imposto=preco*0.15;
    
    
    return imposto;
}
    public double calculaFrete(){
    double frete;
    if(peso <= 0.200){
        frete=0.00;
    }else{
        if(peso <= 1){
            frete=1;
        }
        else{
            frete=50;
        }
    }
    return frete;
}
    
}
