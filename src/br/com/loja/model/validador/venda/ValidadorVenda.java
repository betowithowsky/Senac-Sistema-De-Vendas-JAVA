/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.validador.venda;

import br.com.loja.exception.VendaException;
import br.com.loja.model.venda.Venda;

/**
 *
 * @author yuri.jwsilva
 */
public class ValidadorVenda {
    public static void validar (Venda venda) throws VendaException{
        if(venda.getClienteCPF().equals("") || venda.getClienteCPF() == null) {
            throw new VendaException("CPF obrigatório");
        }
        if(venda.getProdutos() == null || venda.getProdutos().size() <= 0) {
            throw new VendaException("Obrigatório inserir pelo menos um produto na venda.");
        }
    }
}
