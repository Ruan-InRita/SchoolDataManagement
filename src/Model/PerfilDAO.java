
package Model;

import Controller.Perfil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PerfilDAO {
    
    /*------------------------------------------------------------------
     *         CADASTRAR PERFIL SOMENTE EM CASO DE MATRICULA
     *-----------------------------------------------------------------*/
    public void CriarPerfil(int idAlunoNovo,String Nivel){
        try {
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("Insert into Perfil values (null,'"+Nivel+"',0.0,    0.0,    0.0, '"+idAlunoNovo+"',2);");
            
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    /*------------------------------------------------------------------
     *          BUSCAR UM PERFIL PARA JTABLE DO ALUNO
     *-----------------------------------------------------------------*/
    public Perfil buscarPerfil(int idAluno){
        Perfil p =  new Perfil();
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Perfil where Aluno_Id_Aluno = '"+idAluno+"'");
           
            while (rs.next()) {
               int id = rs.getInt(1);
               String nivel = rs.getString(2);
               Double nota1 = rs.getDouble(3);
               Double nota2 = rs.getDouble(4);
               Double notaFinal = rs.getDouble(5);              
               p = new Perfil(id, nivel, nota1, nota2,notaFinal);               
            }
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return p;
    }
    
    /*----------------------------------------------------------------------
     *           ALTERAR A NOTA DO ALUNO
     *---------------------------------------------------------------------*/
    public void alterarNota(int id, Double nota1, Double nota2, Double notafinal){
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("UPDATE Perfil SET `nota 1` = '"+nota1+"',`nota 2` = '"+nota2+"',`Nota Final`= '"+notafinal+"' WHERE Aluno_Id_Aluno = '"+id+"'");
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
