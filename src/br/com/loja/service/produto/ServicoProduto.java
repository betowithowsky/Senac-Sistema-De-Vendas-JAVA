/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.service.produto;

import br.com.loja.exception.ProdutoException;
import br.com.loja.exception.DataSourceException;
import br.com.loja.mock.produtos.MockProdutos;
import br.com.loja.model.produto.Produto;
import br.com.loja.model.validador.produto.ValidadorProduto;
import java.util.List;

/**
 *
 * @author Beto
 */
public class ServicoProduto {
    
    public static void cadastrarProduto(Produto produto)
            throws ProdutoException, DataSourceException {

        //Chama o validador para verificar o cliente
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            MockProdutos.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            //throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataSourceException {
        
        //Chama o validador para verificar o cliente
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockProdutos.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um cliente por nome na fonte de dados
    public static List<Produto> procurarProduto(String nome)
            throws ProdutoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null || "".equals(nome)) {
                return MockProdutos.listar();
            } else {
                return MockProdutos.procurar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o cliente com ID informado do mock
    public static Produto buscarIdProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            //Retorna o cliente obtido com o DAO
            return MockProdutos.buscarId(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o cliente com ID informado do mock
    public static void excluirProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            MockProdutos.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
