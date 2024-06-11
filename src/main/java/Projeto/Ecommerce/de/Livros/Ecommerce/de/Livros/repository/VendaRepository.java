package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
    List<Venda> findByCliente_Id(Integer clienteId);

}
