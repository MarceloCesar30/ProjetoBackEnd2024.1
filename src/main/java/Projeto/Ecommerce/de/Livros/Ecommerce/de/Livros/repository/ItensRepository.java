package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Itens;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ItensRepository extends JpaRepository<Itens, Integer> {
   // List<Itens> findByVenda_Id(Integer vendaId);
    List<Livros> findByItens();
}
