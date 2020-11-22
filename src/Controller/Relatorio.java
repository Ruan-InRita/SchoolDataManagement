/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Date;

/**
 *
 * @author ruan_
 */
public class Relatorio {
    
    private int id;
    private Double lucro;
    private Double gasto;
    private Date data;
    private int idVenda;
    private int idAluno;
    private int idProduto;
    private int idFuncionarioVenda;
    private int idCompra;
    private int idFuncionarioCompra;
    private int idEquipamento;
    
    public Relatorio(){
        
    }

    public Relatorio(int id, Double lucro, Double gasto, int idVenda, int idAluno, int idProduto, int idCompra, int idEquipamento) {
        this.id = id;
        this.lucro = lucro;
        this.gasto = gasto;
        this.idVenda = idVenda;
        this.idAluno = idAluno;
        this.idProduto = idProduto;
        this.idCompra = idCompra;
        this.idEquipamento = idEquipamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getLucro() {
        return lucro;
    }

    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    public Double getGasto() {
        return gasto;
    }

    public void setGasto(Double gasto) {
        this.gasto = gasto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
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

    public int getIdFuncionarioVenda() {
        return idFuncionarioVenda;
    }

    public void setIdFuncionarioVenda(int idFuncionarioVenda) {
        this.idFuncionarioVenda = idFuncionarioVenda;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdFuncionarioCompra() {
        return idFuncionarioCompra;
    }

    public void setIdFuncionarioCompra(int idFuncionarioCompra) {
        this.idFuncionarioCompra = idFuncionarioCompra;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }
    
    
    
    
    
    
}
