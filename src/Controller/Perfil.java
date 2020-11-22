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
public class Perfil {
    
    private int id;
    private String nivel;
    private Double nota1;
    private Double nota2;
    private Double notaFinal;
    
    public Perfil(){
        
    }

    public Perfil(int id, String nivel, Double nota1, Double nota2, Double notaFinal) {
        this.id = id;
        this.nivel = nivel;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaFinal = notaFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }   
    
    public String difinirSituacao(){
        String situacao ;
        if(notaFinal>6){
            situacao = "APROVADO";
        }else{
            situacao = "REPROVADO";
        }
        return situacao;
    }
    
    public String proximoNivel(){
        String ni;
        if(notaFinal>6){
            if(null == nivel){
                ni = "Terminou";
            }else switch (nivel) {
                case "Iniciante":
                    ni = "Basico";
                    break;
                case "Basico":
                    ni = "Intermediario";
                    break;
                case "Intermediario":
                    ni = "Avançado";
                    break;
                case "Avançado":
                    ni = "Experiente";
                    break;
                case "Experiente":
                    ni = "Fluente";
                    break;
                default:
                    ni = "Terminou";
                    break;
            }
        }
        else{
            ni = nivel;
        }
        return ni ;
    }
}
