
package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosService {
    @Autowired
    private LivrosRepository livrosRepository;

    //public void deletarLivros(Livros livros) {
    //livrosRepository.delete(livros);
    //}

    public void deletarLivros(Integer id) {
        livrosRepository.deleteById(id);
    }

    public Livros findById(Integer id) {
        return livrosRepository.findById(id).orElse(null);
    }

    public void cadastrarLivros(Livros livros) {
        livrosRepository.save(livros);
    }

    public List<Livros> listarLivros() {
        return livrosRepository.findAll();
    }

    public Livros editarLivros(Livros livros) {
        return livrosRepository.save(livros);
    }
}