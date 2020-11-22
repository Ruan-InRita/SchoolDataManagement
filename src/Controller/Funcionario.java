package Controller;

import java.sql.Date;


public class Funcionario 
{
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String nasc;
    private String endereco;
    private String email;
    private Double salario;
    private String Cargo;
    
    public Funcionario(){
        
    }

    public Funcionario(int id,String nome, String cpf, String telefone, String nasc, String endereco, String email, Double salario, String Cargo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nasc = nasc;
        this.endereco = endereco;
        this.email = email;
        this.salario = salario;
        this.Cargo = Cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", nasc=" + nasc + ", endereco=" + endereco + ", email=" + email + ", salario=" + salario + ", Cargo=" + Cargo + '}';
    }
}
