/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.model.validador.cliente;

import br.com.loja.model.cliente.Cliente;

/**
 *
 * @author yuri
 */
public class ValidadorCliente {
    public void validar(Cliente cliente) throws Exception {
        if(cliente.getNome().equals("") || cliente.getNome() == null) {
            throw new Exception("Nome obrigatório");
        }
        if(cliente.getSobrenome().equals("") || cliente.getSobrenome() == null) {
            throw new Exception("Sobrenome obrigatório");
        }
        if(cliente.getTelefone().equals("") || cliente.getTelefone() == null) {
            throw new Exception("Telefone obrigatório");
        }
        if(cliente.getGenero() == 0) {
            throw new Exception("Gênero obrigatório");
        }
        if(cliente.getEstadoCivil() == 0) {
            throw new Exception("Estado Civil obrigatório");
        }
        if(cliente.getEndereco().equals("") || cliente.getEndereco() == null) {
            throw new Exception("Endereço obrigatório");
        }
        if(cliente.getDataNascimento().equals("") || cliente.getDataNascimento() == null) {
            throw new Exception("Data de Nascimento obrigatória");
        }
        if(cliente.getCpf().equals("") || cliente.getCpf() == null) {
            throw new Exception("CPF obrigatório");
        }
        if(cliente.getCep().equals("") || cliente.getCep() == null) {
            throw new Exception("CEP obrigatório");
        }
    }
}
