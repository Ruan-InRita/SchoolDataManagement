package Model;

import Controller.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class FuncionarioDAO 
{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /*-----------------------------------------------------------
     *               BUSCAR TODOS OS FUNCIONARIO 
     *----------------------------------------------------------*/
    public List<Funcionario> buscarFuncionario (){
        try{
            List<Funcionario> fun = new ArrayList<>();
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Funcionario");
            while (rs.next()) {
               int id = rs.getInt(1);
               String nome = rs.getString(2);
               String cpf = rs.getString(3);
               String telefone = rs.getString(4);
               String nasc = rs.getString(5);
               String endereco = rs.getString(6);
               String email = rs.getString(7);
               Double salario = rs.getDouble(8);
               String cargo = rs.getString(9);
               fun.add(new Funcionario(id,nome, cpf, telefone, nasc, endereco, email, salario, cargo));
            }
            return fun;

        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }/*catch(ParseException pe){
            pe.printStackTrace();
        }*/catch(Exception e){
            e.printStackTrace();
        }
        
        return null;
    }
    /*-----------------------------------------------------------
     *               CADASTRAR FUNCIONARIO 
     *----------------------------------------------------------*/
    
    public void cadastrarFuncionario(Funcionario funcionario){
        Funcionario a = funcionario;
        try {
            
            Statement stmt = Conexao.conectar().createStatement();
            
            stmt.executeUpdate("INSERT INTO Funcionario values (null,'"+a.getNome()+"','"+a.getCpf()+"',"
            + "'"+a.getTelefone()+"', '"+a.getNasc()+"', '"+a.getEndereco()+"',"
            + "'"+a.getEmail()+"', '"+a.getSalario()+"', '"+a.getCargo()+"' )");
            
   /*---------------------------------------------------------------------------------------------
    *   CONSULTA A TABELA ALUNO PARA PEGAR ESTE ULTIMO INSERT PARA SALVAR NO ID DA CLASSE
    *---------------------------------------------------------------------------------------------*/
           
            stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Funcionario");
            while (rs.next()) {
                a.setId(rs.getInt(1));
            }
            
            rs.close();
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*-----------------------------------------------------------
     *               APAGAR FUNCIONARIO 
     *----------------------------------------------------------*/
    
    public void apagarFuncionario(String cpf){
        try{
            Statement stmt = Conexao.conectar().createStatement();
            stmt.execute("DELETE FROM `funcionario` WHERE CPF = '"+cpf+"'");
            stmt.close();
            
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*-----------------------------------------------------------
     *           PROCURAR FUNCIONARIO POR NOME E CPF
     *----------------------------------------------------------*/
    
    public List<Funcionario> Procurar(String nomeT, String cpfT){
        List<Funcionario> lista = new ArrayList<>();
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs;
            if(!"".equals(nomeT)){
                rs = stmt.executeQuery("SELECT * FROM Funcionario where Nome = '"+nomeT+"'");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String nome = rs.getString(2);
                    String cpf = rs.getString(3);
                    String telefone = rs.getString(4);
                    String nasc = rs.getString(5);
                    String endereco = rs.getString(6);
                    String email = rs.getString(7);
                    Double salario = rs.getDouble(8);
                    String cargo = rs.getString(9);
                    lista.add(new Funcionario(id,nome, cpf, telefone, nasc, endereco, email, salario, cargo));
                   
                }
            }else if(!"".equals(cpfT)){
                rs = stmt.executeQuery("SELECT * FROM Funcionario where CPF = '"+cpfT+"'");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    String nome = rs.getString(2);
                    String cpf = rs.getString(3);
                    String telefone = rs.getString(4);
                    String nasc = rs.getString(5);
                    String endereco = rs.getString(6);
                    String email = rs.getString(7);
                    Double salario = rs.getDouble(8);
                    String cargo = rs.getString(9);
                    lista.add(new Funcionario(id,nome, cpf, telefone, nasc, endereco, email, salario, cargo));
                     
                }
            }
        return lista;

        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }/*catch(ParseException pe){
            pe.printStackTrace();
        }*/catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        return lista;      
    }
    
}
