package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id_Cliente;
    private String nomeCliente;
    private String rua;
    private String cep;
    private int telefone;

    public Cliente(String id_Cliente, String nomeCliente, String rua, String cep, int telefone) {
        this.id_Cliente = id_Cliente;
        this.nomeCliente = nomeCliente;
        this.rua = rua;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
