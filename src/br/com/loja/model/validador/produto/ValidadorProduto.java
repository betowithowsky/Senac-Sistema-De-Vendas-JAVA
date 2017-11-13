/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.validador.produto;

import br.com.loja.exception.ProdutoException;
import br.com.loja.model.produto.Produto;

/**
 *
 * @author yuri
 */
public class ValidadorProduto {
    public static void validar(Produto produto) throws ProdutoException {
        if(produto.getNome().equals("") || produto.getNome() == null) {
            throw new ProdutoException("Nome obrigatório");
        }
        if(produto.getPreco() <= 0) {
            throw new ProdutoException("Preço obrigatório");
        }
        if(produto.getMarca().equals("") || produto.getMarca() == null) {
            throw new ProdutoException("Marca obrigatória");
        }
        if(produto.getDescricao().equals("") || produto.getDescricao() == null) {
            throw new ProdutoException("Descrição obrigatória");
        }
    }
}
