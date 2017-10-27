/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.validador.categoria;

import br.com.loja.model.categoria.Categoria;

/**
 *
 * @author yuri
 */
public class ValidadorCategoria {
    public void validar(Categoria categoria) throws Exception {
        if(categoria.getNome().equals("") || categoria.getNome() == null) {
            throw new Exception("Nome obrigatório");
        }
    }
}
