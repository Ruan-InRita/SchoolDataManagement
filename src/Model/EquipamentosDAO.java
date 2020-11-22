/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Equipamentos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ruan Fagundes
 */
public class EquipamentosDAO {
    
    /*-----------------------------------------------------------
     *                   CADASTRAR EQUIPAMENTOS 
     *----------------------------------------------------------*/
        
    public void cadastrarEquipamento(Equipamentos equi){
      
        try {            
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("INSERT INTO Equipamento values (null,'"+equi.getNome()+"','"+equi.getMarca()+"',"
            + "'"+equi.getDescricao()+"', '"+equi.getQuantidade()+"', '"+equi.getSala()+"',"
            + "'"+equi.getPreco()+"')");
            
            Statement stmt2 = Conexao.conectar().createStatement();
            ResultSet rs = stmt2.executeQuery("SELECT * FROM Equipamento");
            int idEquipamento = 0;
            while (rs.next()) {
                idEquipamento = rs.getInt(1);
            }           
            
            Statement stmt3 = Conexao.conectar().createStatement();
            stmt3.executeUpdate("INSERT INTO Compra values (null,'"+new Date()+"',1,'"+idEquipamento+"')");
            
            
           stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
   
    /*-----------------------------------------------------------
     *                     BUSCAR EQUIPAMENTOS 
     *----------------------------------------------------------*/
    public List<Equipamentos> buscarEquipamento(){
        List<Equipamentos> lista = new ArrayList<>();
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Equipamento");
            while (rs.next()) {
               int id = rs.getInt(1);
               String nome = rs.getString(2);
               String marca = rs.getString(3);
               String descricao = rs.getString(4);
               int quantidade = rs.getInt(5);
               String sala = rs.getString(6);
               Double preco = rs.getDouble(7);
               
               lista.add(new Equipamentos(id, nome, marca, descricao, quantidade, sala, preco));
            }
            return lista;
        }
        catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return lista;        
    }
    /*-----------------------------------------------------------
     *                     REMOVER EQUIPAMENTOS 
     *----------------------------------------------------------*/
    public void removerEquipamento(String nome,String marca){
        try{
            Statement stmt1 = Conexao.conectar().createStatement();
            ResultSet rs = stmt1.executeQuery("Select * FROM `Equipamento` WHERE nome = '"+nome+"' AND Marca = '"+marca+"'");
            List<Integer> idEquipamento = new ArrayList<>();
            while (rs.next()) {
                idEquipamento.add(rs.getInt(1));
            }
            Statement stmt3 = Conexao.conectar().createStatement();
            stmt3.execute("DELETE FROM `Compra` WHERE Equipamento_Id_Equipamento = '"+idEquipamento+"' ");
            
            Statement stmt = Conexao.conectar().createStatement();
            for(Integer l : idEquipamento){
                stmt3.execute("DELETE FROM `Compra` WHERE Equipamento_Id_Equipamento = '"+l+"' ");
                stmt.execute("DELETE FROM `Equipamento` WHERE id_equipamento = '"+l+"' ");
            }
            stmt.close();
            
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
    
    /*-----------------------------------------------------------
     *                BUSCAR EQUIPAMENTOS POR ID
     *----------------------------------------------------------*/
    public List<Equipamentos> buscarEquipamentoPorId(int idTela){
        List<Equipamentos> lista = new ArrayList<>();
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Equipamento where id_Equipamento = '"+idTela+"'");
            while (rs.next()) {
               int id = rs.getInt(1);
               String nome = rs.getString(2);
               String marca = rs.getString(3);
               String descricao = rs.getString(4);
               int quantidade = rs.getInt(5);
               String sala = rs.getString(6);
               Double preco = rs.getDouble(7);
               
               lista.add(new Equipamentos(id, nome, marca, descricao, quantidade, sala, preco));
            }
            return lista;
        }
        catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return lista;        
    }
    
    
}
