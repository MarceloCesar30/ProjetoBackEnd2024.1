package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.AutorRepository;

import java.util.List;


@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public void cadastarAutor(Autor autor) {
        autorRepository.save(autor);
    }
    public List<Autor> listarAutor() {
        List<Autor> autores = autorRepository.findAll();
        return autores;
    }
    public void deletarAutor(Autor autor) {
        autorRepository.delete(autor);
    }
    public void deletarAutor(Integer id) {
        autorRepository.deleteById(id);
    }

    public Autor findById(Integer id) {
        return autorRepository.findById(id).get();
    }

    public void cadastrarAutor(Autor autor) {
        autorRepository.save(autor);

    }

    public List<Autor> listarAutores() {
        List<Autor> autores = autorRepository.findAll();
        return autores;
    }
}

