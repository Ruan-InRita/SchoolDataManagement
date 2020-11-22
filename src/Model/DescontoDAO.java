
package Model;

import Controller.Desconto;
import Controller.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DescontoDAO {
    
    
   /*-------------------------------------------------------------------------------------
    *                                APLICANDO DESCONTO
    *-----------------------------------------------------------------------------------*/
    
    public void cadastrarDesconto(Desconto desconto, String NomeProdutoTela){
        Desconto a = desconto;
        try {
            /*---------------------------------------------------------------------------------------------
             *   CONSULTA A TABELA ALUNO PARA PEGAR ESTE ULTIMO INSERT PARA SALVAR NO ID DA CLASSE
             *---------------------------------------------------------------------------------------------*/           
            Statement stmt1 = Conexao.conectar().createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT * FROM Produto where nome = '"+NomeProdutoTela+"'");
            int idProduto = 0;
            while (rs.next()) {
                idProduto = rs.getInt(1);
            }
            Statement stmt = Conexao.conectar().createStatement();
            if(idProduto != 0){
                stmt.executeUpdate("INSERT INTO Desconto values (null,'"+a.getDatainicio()+"','"+a.getDatatermino()+"', '"+a.getPorcentagem()+"', '"+idProduto+"' )");
            }else{
                
            }
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
   /*-------------------------------------------------------------------------------------*
    *                                REMOVER DESCONTO                                     *
    *-------------------------------------------------------------------------------------*/
    public void removerDesconto(String NomeProdutoTela){
        try{
            
            /*----------------------------------------------------------------------------------------------------------
             *                      CAPTURANDO O ID DO PRODUTO PARA COMPARAR COM ID DO DESCONTO
             *                  PARA AI PEGAR ESSE ID DO DESCONTO PARA REMOVER O DESCONTO DO PRODUTO
             *--------------------------------------------------------------------------------------------------------*/
            Statement stmt1 = Conexao.conectar().createStatement();
            ResultSet rs1 = stmt1.executeQuery("SELECT * FROM Produto where nome = '"+NomeProdutoTela+"'");
            int idProduto = 0;
            while (rs1.next()) {
                idProduto = rs1.getInt(1);
            }
            
            Statement stmt2 = Conexao.conectar().createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM Desconto where Produto_Id_Produto = '"+idProduto+"'");
            int idDesconto = 0;
            while (rs2.next()) {
                idDesconto = rs2.getInt(1);
            }
            
            Statement stmt = Conexao.conectar().createStatement();
            stmt.execute("DELETE FROM `Desconto` WHERE Id_Desconto = '"+idDesconto+"'");
            stmt.close();
            
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /*----------------------------------------------------------------------------------
    *                               BUSCANDO DESCONTO
    *-----------------------------------------------------------------------------------*/
    public Double buscarDesconto(int idProduto){
        Double desconto = 0.0;
        try{
            Statement stmt2 = Conexao.conectar().createStatement();
            ResultSet rs2 = stmt2.executeQuery("SELECT * FROM Desconto where Produto_Id_Produto = '"+idProduto+"'");
            while (rs2.next()) {
                desconto = rs2.getDouble(4);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return desconto;
    }
    
}
