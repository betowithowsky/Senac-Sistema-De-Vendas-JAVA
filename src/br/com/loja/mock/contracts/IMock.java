/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.mock.contracts;

/**
 *
 * @author yuri.jwsilva
 */
public interface IMock {
    void inserir(Object entity);
    void atualizar(Object entity);
    void deletar (Integer id);
    void listar();
    void procurar(Integer id);
}
