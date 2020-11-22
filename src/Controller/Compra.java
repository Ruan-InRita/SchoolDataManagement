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
public class Compra {
    private int id;
    private Date data;
    private int idFuncionario;
    private int idEquipamento;
    
    public Compra(){
        
    }

    public Compra(int id, int idFuncionario, int idEquipamento) {
        this.id = id;
        this.idFuncionario = idFuncionario;
        this.idEquipamento = idEquipamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }
    
    
    
    
}
