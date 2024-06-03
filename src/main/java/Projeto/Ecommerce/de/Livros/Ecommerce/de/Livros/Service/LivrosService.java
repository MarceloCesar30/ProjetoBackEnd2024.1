
package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.LivrosRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class LivrosService {
    @Autowired
    ModelMapper modelMapper;
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
//    public List<Livros> listarLivrosDestaque() {
//        List<Livros> destaques = livrosRepository.findByDestaquesTrue();
//        return destaques;
//    }


    public Livros editarLivros(@RequestBody Livros livros) {

        return livrosRepository.save(livros);
    }
    public List<Livros> buscarTudo(String livroAutor){
        List<Livros> livrosp = livrosRepository.findByTituloContainingIgnoreCase(livroAutor);
        List<Livros> livrosAutores = livrosRepository.findByAutor_AutorContainingIgnoreCase(livroAutor);
        List<Livros> livrosEditoras = livrosRepository.findByEditora_NomeEditoraContainingIgnoreCase(livroAutor);
        livrosAutores.addAll(livrosp);
        livrosAutores.addAll(livrosEditoras);
        return livrosAutores;
    }
}

