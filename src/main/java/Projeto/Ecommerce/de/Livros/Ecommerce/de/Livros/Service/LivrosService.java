
package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.AutorRepository;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.LivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class LivrosService {
        @Autowired
    private LivrosRepository livrosRepository;

    public void deletarLivros(Livros livros) {

        livrosRepository.delete(livros);
    }
    public void deletarLivros(Integer id) {

        livrosRepository.deleteById(id);
    }
    public Livros findById(Integer id) {

        return livrosRepository.findById(id).get();
    }


    public void cadastrarLivros(Livros livros) {
        livrosRepository.save(livros);

    }

    public List<Livros> listarLivros() {
        List<Livros> livross = livrosRepository.findAll();
        return livross;
    }
    public List<Livros> listarLivrosDestaque() {
        List<Livros> destaques = livrosRepository.findByDestaquesTrue();
        return destaques;
    }


    public Livros editarLivros(@RequestBody Livros livros) {

        return  livrosRepository.save(livros);
    }



}