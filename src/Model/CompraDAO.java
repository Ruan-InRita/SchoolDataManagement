/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Compra;
import Controller.Venda;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruan_
 */
public class CompraDAO {
    
    /*------------------------------------------------------------
     *                     BUSCAR COMPRA
     *-----------------------------------------------------------*/
    public List<Compra> BuscarRegistroCompra(){
        List<Compra> listaRegistro = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{    
            Statement stmt = Conexao.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Compra ");
            while (rs.next()) {
                int id = rs.getInt(1);
                
                 // ARRUMO DEPOIS ESSE ITEM, N PRECISO DELE NO MOMENTO new java.sql.Date(sdf.parse(data1).getTime());
                int idFuncionario = rs.getInt(3);
                int idEquipamento = rs.getInt(4);
                listaRegistro.add(new Compra(id, idFuncionario, idEquipamento));
            }
        }catch(SQLException es){
            es.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaRegistro;
    }
    
    
    
    
    
    
    
}
