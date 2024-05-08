package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditoraRepository extends JpaRepository<Editora,String>{
}
