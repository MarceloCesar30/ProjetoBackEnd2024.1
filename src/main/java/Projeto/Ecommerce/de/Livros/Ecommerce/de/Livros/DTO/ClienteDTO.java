package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.DTO;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Cliente;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class ClienteDTO extends Cliente{
    private Integer id;
    private String nomeCliente;
    private String rua;
    private String cep;
    private int telefone;

    public ClienteDTO(Integer id, String nomeCliente, String rua, String cep, int telefone) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.rua = rua;
        this.cep = cep;
        this.telefone = telefone;
    }

    public ClienteDTO(Cliente cliente) {
        id = cliente.getId();
        nomeCliente = cliente.getNomeCliente();
        rua = cliente.getRua();
        cep = cliente.getCep();
        telefone = cliente.getTelefone();
    }

    public ClienteDTO(){}

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getNomeCliente() {
        return nomeCliente;
    }

    @Override
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getRua() {
        return rua;
    }

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String getCep() {
        return cep;
    }

    @Override
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
