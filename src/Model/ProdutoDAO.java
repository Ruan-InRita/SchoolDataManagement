/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Funcionario;
import Controller.Produtos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruan_
 */
public class ProdutoDAO {
    
    /*------------------------------------------------------------
     *                     CADASTRAR PRODUTO
     *-----------------------------------------------------------*/
    
    public void CadastrarProduto(Produtos ProdutosTela){
        Produtos produto = ProdutosTela;
        try {
            
            Statement stmt = Conexao.conectar().createStatement();
            
            stmt.executeUpdate("INSERT INTO Produto values (null,'"+produto.getNome()+"','"+produto.getDescricao()+"', '"+produto.getPreco()+"','"+produto.getQuantidade()+"' )");
            
            /*---------------------------------------------------------------------------------------------
             *   CONSULTA A TABELA ALUNO PARA PEGAR ESTE ULTIMO INSERT PARA SALVAR NO ID DA CLASSE
             *---------------------------------------------------------------------------------------------*/           
            stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto");
            while (rs.next()) {
                produto.setId(rs.getInt(1));
            }
            
            rs.close();
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.getMessage();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /*-----------------------------------------------------------
     *               BUSCAR TODOS OS PRODUTOS 
     *----------------------------------------------------------*/
    public List<Produtos> buscarProduto (){
        try{
            List<Produtos> listaProdutos = new ArrayList<>();
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Double preco = rs.getDouble(4);
                int quantidade = rs.getInt(5);
                
                Statement stmt2 = Conexao.conectar().createStatement();
                ResultSet rs2 = stmt2.executeQuery("SELECT * FROM Desconto where Produto_Id_Produto = '"+id+"'");
                Double Desconto = 0.0;
                while (rs2.next()) {
                    Desconto = rs2.getDouble(4);
                }
                double precoreal = preco;
                if(Desconto > 0){
                    precoreal = preco - (preco *  Desconto) / 100;
                }
               listaProdutos.add(new Produtos(id,nome,descricao,precoreal,quantidade));
            }
            return listaProdutos;

        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }/*catch(ParseException pe){
            pe.printStackTrace();
        }*/catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
    }
    /*------------------------------------------------------------------
     *                  REMOVER PRODUTO CADASTRADO
     *------------------------------------------------------------------*/
    
    public void removerProduto(String nome){
        
        try{
            Statement stmt = Conexao.conectar().createStatement();
            stmt.execute("DELETE FROM `Produto` WHERE Nome = '"+nome+"'");
            stmt.close();
            
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }     
    }
    /*-------------------------------------------------------------------------------------------------
     *      BUSCAR UM OU VARIOS PRODUTOS POR NOME APROXIMADO - PARA A MATRICULA E PARA A PESQUISAR PRODUTO
     *------------------------------------------------------------------------------------------------*/
    public List<Produtos> buscarProdutoPorNome(String nomeProduto){
        List<Produtos> listaProdutos = new ArrayList<>();
        
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto where nome like '%"+nomeProduto+"%'  ");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Double preco = rs.getDouble(4);
                int quantidade = rs.getInt(5);
                listaProdutos.add(new Produtos(id, nome, descricao, preco, quantidade));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaProdutos;
    }
    
    
    /*-------------------------------------------------------------------------------------------------
     *                                  BUSCAR TODOS OS PRODUTOS POR ID
     *------------------------------------------------------------------------------------------------*/
    public List<Produtos> buscarProdutoPoriD(int idTela){
        List<Produtos> listaProdutos = new ArrayList<>();
        
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto where Id_Produto = '"+idTela+"'");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Double preco = rs.getDouble(4);
                int quantidade = rs.getInt(5);
                listaProdutos.add(new Produtos(id, nome, descricao, preco, quantidade));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaProdutos;
    }
    
    /*----------------------------------------------------------------------
     *                  BUSCAR SOMENTE UM PRODUTO
     *---------------------------------------------------------------------*/
    public List<Produtos> buscarProdutoPorNomeNaoAproximado(String nomeProduto){
        List<Produtos> listaProdutos = new ArrayList<>();
        
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Produto where nome = '"+nomeProduto+"'");
            while (rs.next()) {
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                String descricao = rs.getString(3);
                Double preco = rs.getDouble(4);
                int quantidade = rs.getInt(5);
                listaProdutos.add(new Produtos(id, nome, descricao, preco, quantidade));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaProdutos;
    }
    
    /*----------------------------------------------------------------------
     *           ALTERAR A QUANTIDADE DOS PRODUTOS APOS A VENDA
     *---------------------------------------------------------------------*/
    public void alterarQuantidadeProduto(int quantidadeNova, int id){
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("UPDATE Produto SET quantidade = '"+quantidadeNova+"' WHERE id_Produto = '"+id+"'");
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
