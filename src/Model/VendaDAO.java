/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Produtos;
import Controller.Venda;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruan_
 */
public class VendaDAO {
    
    /*------------------------------------------------------------
     *                     REGISTRAR VENDA
     *-----------------------------------------------------------*/
    
    public void CadastrarProduto(String metodo, int idAluno,int idProduto){
        try {
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("INSERT INTO Venda values (null,'"+metodo+"','"+idAluno+"', '"+idProduto+"',2);");
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*------------------------------------------------------------
     *                     BUSCAR VENDA
     *-----------------------------------------------------------*/
    public List<Venda> buscarVenda(){
        List<Venda> listaRegistro = new ArrayList<>();
        
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Venda ");
            while (rs.next()) {
                int id = rs.getInt(1);
                String metodo = rs.getString(2);
                int idAlnuo = rs.getInt(3);
                int idProduto = rs.getInt(4);
                int idFucionario = rs.getInt(5);
                listaRegistro.add(new Venda(id, metodo, idAlnuo, idProduto, idFucionario));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaRegistro;
    }
    
    
    
    
    
    
}
