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
public class Desconto {
    
    private int id;

    private Double porcentagem;
    private Date datainicio;
    private Date datatermino;
    
    public Desconto(){
        
    }

    public Desconto(int id, Double porcentagem, Date datainicio, Date datatermino) {
        this.id = id;
        this.porcentagem = porcentagem;
        this.datainicio = datainicio;
        this.datatermino = datatermino;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatatermino() {
        return datatermino;
    }

    public void setDatatermino(Date datatermino) {
        this.datatermino = datatermino;
    }

    @Override
    public String toString() {
        return "Desconto{" + "id=" + id + ", porcentagem=" + porcentagem + ", datainicio=" + datainicio + ", datatermino=" + datatermino + '}';
    }

   
    
}
