/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Aluno;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ruan Fagundes
 */
public class AlunoDAO {
    
    /*-------------------------------------------------------------------------------------------------------
     *  FAZER CADASTRO DOS ALUNOOS (MATRICULANDO), INICIALMENTE ALGUNS VALORES INICIARAO COM VALORES PADRAO
     *    COMO É O CASO DOS STATUS QUE INICIA COMO INATIVO EXCETO STATUS_MATRICULA QUE PASSA PARA ATIVO
     *------------------------------------------------------------------------------------------------------*/
    
    
    
    public void CadastarAluno(Aluno a){
        try {
            /*---------------------------------------------------------------------------------------------
             *                              Criar Perfil no Exato momento
             *                                  da matricula do aluno
             *--------------------------------------------------------------------------------------------*/
            
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("Insert into Aluno values (null,'"+ a.getAluno()+"','"+a.getCpf()+"', "
            + "   '"+a.getTelefone()+"','"+a.getDatanascimento()+"',"
            + "   '"+a.getEndereco()+"','"+a.getEmail()+"', '"+a.getStatusMensalidade()+"', '"+a.getStatusMatricula()+"', '"+a.getStatusCompra()+"', '"+a.getNotaproeficiencia()+"')");
                        
            /*---------------------------------------------------------------------------------------------
             *                             BUSCAR O ULTIMO ID DA TABLE ALUNO
             *                                  PARA CRIAR UM PERFIL
             *--------------------------------------------------------------------------------------------*/
            Statement stmt1 = Conexao.conectar().createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT * FROM Aluno");
            int idAlunoNovo = 0;
            while (rs.next()) {
               idAlunoNovo = rs.getInt(1);
            }
                        
            /*-------------------------------------------------------------------------------------------------------
             *                                      CRIANDO PERFIL
             *------------------------------------------------------------------------------------------------------*/
            
            if(idAlunoNovo > 0){
                PerfilDAO pdao = new PerfilDAO();
                pdao.CriarPerfil(idAlunoNovo, a.definirNivel(a.getNotaproeficiencia()));
            }           
            stmt.close();
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /*-------------------------------------------------------------------------------------------------------
     *  BUSCAR TODOS OS ALUNO E ATRIBUTOS E DEVOLVER PARA TABELA - ALUNO - BUTTON:-:ATUALIZAR
     *------------------------------------------------------------------------------------------------------*/
    public List<Aluno> buscarAluno (){
        List<Aluno> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Aluno");
            while (rs.next()) {
               int id = rs.getInt(1);
               String aluno = rs.getString(2);
               String cpf = rs.getString(3);
               String telefone = rs.getString(4);
               Date datanascimento = rs.getDate(5);
               String endereco = rs.getString(6);
               String email = rs.getString(7);
               String statusMensalidade = rs.getString(8);
               String statusMatricula = rs.getString(9);
               String statusCompra = rs.getString(10);
               Double notaproeficiencia = rs.getDouble(11);
               lista.add(new Aluno(id, aluno, cpf, telefone, datanascimento, endereco, email, statusMensalidade, statusMatricula, statusCompra,notaproeficiencia));
            }
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        return lista;
    }
    
    
    
    /*---------------------------------------------------------------------------------
     *                          BUSCAR ALUNO POR CPF
     *--------------------------------------------------------------------------------*/
    public List<Aluno> buscarAlunoCpf (String cpfTela){
        List<Aluno> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Aluno where cpf = '"+cpfTela+"'");
            while (rs.next()) {
               int id = rs.getInt(1);
               String aluno = rs.getString(2);
               String cpf = rs.getString(3);
               String telefone = rs.getString(4);
               Date datanascimento = rs.getDate(5);
               String endereco = rs.getString(6);
               String email = rs.getString(7);
               String statusMensalidade = rs.getString(8);
               String statusMatricula = rs.getString(9);
               String statusCompra = rs.getString(10);
               Double notaproeficiencia = rs.getDouble(11);
               lista.add(new Aluno(id, aluno, cpf, telefone, datanascimento, endereco, email, statusMensalidade, statusMatricula, statusCompra,notaproeficiencia));
            }
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
       
    /*---------------------------------------------------------------------------------
     *                          BUSCAR ALUNO POR CPF
     *--------------------------------------------------------------------------------*/
    public List<Aluno> buscarAlunoID (int idTela){
        List<Aluno> lista = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Aluno where id_Aluno = '"+idTela+"'");
            while (rs.next()) {
               int id = rs.getInt(1);
               String aluno = rs.getString(2);
               String cpf = rs.getString(3);
               String telefone = rs.getString(4);
               Date datanascimento = rs.getDate(5);
               String endereco = rs.getString(6);
               String email = rs.getString(7);
               String statusMensalidade = rs.getString(8);
               String statusMatricula = rs.getString(9);
               String statusCompra = rs.getString(10);
               Double notaproeficiencia = rs.getDouble(11);
               lista.add(new Aluno(id, aluno, cpf, telefone, datanascimento, endereco, email, statusMensalidade, statusMatricula, statusCompra,notaproeficiencia));
            }
        }catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    /*----------------------------------------------------------------------
     *                      ALTERAR O STATUS COMPRA
     *---------------------------------------------------------------------*/
    public void mudarStatusCompraAluno( int id){
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            stmt.executeUpdate("UPDATE Aluno SET Status_Compra = 'OK' WHERE id_Aluno = '"+id+"'");
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
       
    
}
