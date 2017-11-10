package br.com.loja.mock.produtos;

import br.com.loja.model.produto.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Beto
 */
public class MockProdutos {
    private static int totalProdutos = 0;
    
    private static List<Produto> listaProdutos = new ArrayList<Produto>();
    
    public static void inserir(Produto produto) 
            throws Exception{
        produto.setId(totalProdutos++);
        listaProdutos.add(produto);        
    }
    
    public static void excluir(Integer id)
            throws Exception{
        if(id != null && !listaProdutos.isEmpty()){
            for(int i = 0; i < listaProdutos.size();i++){
                Produto produtoLista = listaProdutos.get(i);
                if(produtoLista.getId() == id && produtoLista != null){
                    listaProdutos.remove(i);
                    break;
                }
            }
        }     
    }
    
    public static void atualizar(Produto produto)
            throws Exception{
        if (produto != null && produto.getId() != null && !listaProdutos.isEmpty()){
            for(Produto produtoLista : listaProdutos){
                if(produtoLista != null && produtoLista.getId() == produto.getId()){
                    produtoLista.setCategoriaId(produto.getCategoriaId());
                    produtoLista.setDescricao(produto.getDescricao());
                    produtoLista.setMarca(produto.getMarca());
                    produtoLista.setNome(produto.getNome());
                    produtoLista.setPreco(produto.getPreco());
                    produtoLista.setQuantidade(produto.getQuantidade());
                }
            }  
        }
    }
    
    public static List<Produto> listar()
            throws Exception{
        return listaProdutos;
    }
    
    public static List<Produto> procurar(String nome)
            throws Exception{
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if(nome != null && !listaProdutos.isEmpty()){
            for(Produto produtoLista : listaProdutos){
                if(produtoLista != null && produtoLista.getNome() != null){
                    if(produtoLista.getNome().toUpperCase().contains(nome.toUpperCase())){
                        listaResultado.add(produtoLista);
                    }
                }
            }
        }
        return listaResultado;
    }
    
    public static Produto buscarId(Integer id)
            throws Exception{
        if(id != null && !listaProdutos.isEmpty()){
            for(int i = 0; i < listaProdutos.size();i++){
                if(listaProdutos.get(i) != null && listaProdutos.get(i).getId() == id){
                    return listaProdutos.get(i);
                }
            }
        }
        return null;
    }
    
    
    
}
