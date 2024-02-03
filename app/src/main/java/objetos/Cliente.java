package objetos;

import java.time.LocalDate;

public class Cliente {

    private final int ID;
    private String nome;
    private String rg;
    private String cpf;
    private String logradouro;
    private int id_municipio;
    private int id_estado;
    private String cnh;
    private LocalDate dataVencimentoCnh;
    private String email;

    public Cliente(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }

    public int getId_estado() {
        return id_estado;
    }

    public Cliente setId_estado(int id_estado) {
        this.id_estado = id_estado;
        
        return this;
    }

    public String getCnh() {
        return cnh;
    }

    public Cliente setCnh(String cnh) {
        this.cnh = cnh;
        
        return this;
    }

    public LocalDate getDataVencimentoCnh() {
        return dataVencimentoCnh;
    }

    public void setDataVencimentoCnh(LocalDate dataVencimentoCnh) {
        this.dataVencimentoCnh = dataVencimentoCnh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
