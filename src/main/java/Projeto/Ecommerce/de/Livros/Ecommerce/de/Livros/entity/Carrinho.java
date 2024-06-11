package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private List<Livros> livros;
    private int quantidade;
    private double total;

    public Carrinho(Integer id, Cliente cliente, List<Livros> livros, int quantidade, double total) {
        this.id = id;
        this.cliente = cliente;
        this.livros = livros;
        this.quantidade = quantidade;
        this.total = total;
    }

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

    public List<Livros> getLivros() {
        return livros;
    }

    public void setLivros(List<Livros> livros) {
        this.livros = livros;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //private String numeroPedido;
   // private String numeroCliente;
    //private String cidade;
    //private int cep;
    //private String formaPagamento;
    /*public Carrinho(Integer id, Cliente cliente, Livros livros, Integer quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.livros = livros;
        this.quantidade = quantidade;

    }
    /*public Carrinho(Integer id, String numeroPedido, String numeroCliente, String nomeCliente, String cidade, int cep, String formaPagamento) {
        this.id = id;
        this.numeroPedido = numeroPedido;
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.cidade = cidade;
        this.cep = cep;
        this.formaPagamento = formaPagamento;
    }*/
    public Carrinho(){}

   /* public Integer getId() {
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

    public Livros getLivro() {
        return livros;
    }

    public void setLivro(Livros livros) {
        this.livros = livros;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    /*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }*/
}
