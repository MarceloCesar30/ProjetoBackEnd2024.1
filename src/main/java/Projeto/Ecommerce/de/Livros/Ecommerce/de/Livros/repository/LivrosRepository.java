package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivrosRepository extends JpaRepository<Livros,Integer> {
    //List<Livros> findByDestaquesTrue();
List<Livros> findByAutor_AutorContainingIgnoreCase(String livroAutor);
    List<Livros> findByTituloContainingIgnoreCase(String titulo);
    List<Livros> findByEditora_nomeEditoraContainingIgnoreCase(String livroEditora);
}
