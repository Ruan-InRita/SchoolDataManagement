/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Date;

/**
 *
 * @author Ruan Fagundes
 */
public class Aluno {
    
    private int id;
    private String aluno;
    private String cpf;
    private String telefone ;
    private Date datanascimento ;
    private String endereco;
    private String email;
    private String statusMensalidade;
    private String statusMatricula;
    private String statusCompra;
    private Double notaproeficiencia;
    
    
    
    
    public Aluno(){
    }

    public Aluno(int id, String aluno, String cpf, String telefone, Date datanascimento, String endereco, String email, String statusMensalidade, String statusMatricula, String statusCompra,Double notaproeficiencia) {
        this.id = id;
        this.aluno = aluno;
        this.cpf = cpf;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
        this.endereco = endereco;
        this.email = email;
        this.statusMensalidade = statusMensalidade;
        this.statusMatricula = statusMatricula;
        this.statusCompra = statusCompra;
        this.notaproeficiencia = notaproeficiencia;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatusMensalidade() {
        return statusMensalidade;
    }

    public void setStatusMensalidade(String statusMensalidade) {
        this.statusMensalidade = statusMensalidade;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public String getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(String statusCompra) {
        this.statusCompra = statusCompra;
    }

    public Double getNotaproeficiencia() {
        return notaproeficiencia;
    }

    public void setNotaproeficiencia(Double notaproeficiencia) {
        this.notaproeficiencia = notaproeficiencia;
    }

    public String definirNivel(Double nota){
        String nivel;
        if(nota < 17){
            nivel = "Iniciante";  
        }else if((nota>=17)&&(nota<34)){
            nivel = "Basico";
        }else if((nota<51)&&(nota>=34)){
            nivel = "Intermediario";
        }else if((nota<68)&&(nota>=51)){
            nivel = "Avançado";
        }else if((nota<85)&&(nota>=68)){
            nivel = "Experiente";
        }else if((nota<100)&&(nota>=85)){
            nivel = "Fluente";
        }else{
            nivel = "Fluente - DISPENSADO";
        }
        
        
        
        return nivel ;
    }
   
    
}
