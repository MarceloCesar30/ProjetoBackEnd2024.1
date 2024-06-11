package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private  Double total;
    private Date data;
    @ManyToOne
    private Cliente cliente;

    public Venda(Integer id, Date data, Cliente cliente, Double total) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.total = total;
    }

    public Venda(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getData() {
        return data;

    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
