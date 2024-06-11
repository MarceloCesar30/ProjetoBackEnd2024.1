package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho,Integer> {
    List<Carrinho> findByCliente_Id(Integer clienteId);
    List<Carrinho> findByCliente_nome(String nomeCliente);
    void deleteById(Integer id);
    void deleteByCliente_Id (Integer clienteId);
    Long countByCliente_Id(Integer id);
}
