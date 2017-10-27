/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.validador.produto;

import br.com.loja.model.produto.Produto;

/**
 *
 * @author yuri
 */
public class ValidadorProduto {
    public void validar(Produto produto) throws Exception {
        if(produto.getNome().equals("") || produto.getNome() == null) {
            throw new Exception("Nome obrigatório");
        }
        if(produto.getPreco() <= 0) {
            throw new Exception("Preço obrigatório");
        }
        if(produto.getMarca().equals("") || produto.getMarca() == null) {
            throw new Exception("Marca obrigatória");
        }
        if(produto.getDescricao().equals("") || produto.getDescricao() == null) {
            throw new Exception("Descrição obrigatória");
        }
    }
}
