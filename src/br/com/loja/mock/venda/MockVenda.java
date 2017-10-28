/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.mock.venda;

import br.com.loja.mock.contracts.IMock;
import br.com.loja.model.venda.Venda;
import java.util.ArrayList;

/**
 *
 * @author yuri.jwsilva
 */
public class MockVenda implements IMock {
    public ArrayList<Object> vendas = new ArrayList<Object>();
    
    @Override
    public void inserir(Object entity) {
        vendas.add(entity);
    }

    @Override
    public void atualizar(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void procurar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
