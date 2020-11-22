/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author ruan_
 */
public class Venda {
    
    private int id;
    private String metodoPagamento;
    private int idAluno;
    private int idProduto;
    private int idFuncionario;
    
    public Venda(){
        
    }

    public Venda(int id, String metodoPagamento, int idAluno, int idProduto, int idFuncionario) {
        this.id = id;
        this.metodoPagamento = metodoPagamento;
        this.idAluno = idAluno;
        this.idProduto = idProduto;
        this.idFuncionario = idFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    
    
    
    
}
