/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.service.venda;

import br.com.loja.exception.VendaException;
import br.com.loja.mock.contracts.IMock;
import br.com.loja.mock.venda.MockVenda;
import br.com.loja.model.validador.venda.ValidadorVenda;
import br.com.loja.model.venda.Venda;

/**
 *
 * @author yuri.jwsilva
 */
public class ServicoVenda {
    private static IMock mock = new MockVenda();
            
    public static void cadastrarVenda(Venda venda) throws VendaException{
        ValidadorVenda.validar(venda);
        
        try{
            mock.inserir(venda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
