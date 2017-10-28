/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.venda;

import br.com.loja.model.produto.ProdutoVenda;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yuri.jwsilva
 */
public class Venda {
    private String clienteCPF;
    private Date dataCriacao;
    private ArrayList<ProdutoVenda> produtos;
    private float total;

    public Venda (){
        
    }
    
    public String getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(String clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public ArrayList<ProdutoVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoVenda> produtos) {
        this.produtos = produtos;
    }
}
