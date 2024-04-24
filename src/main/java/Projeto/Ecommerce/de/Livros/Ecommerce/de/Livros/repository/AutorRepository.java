package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Integer>{
}
