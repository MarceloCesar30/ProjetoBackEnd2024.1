package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.AutorRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

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


    public Autor editarAutor( Autor autor) {

        return  autorRepository.save(autor);
    }



   /* public Autor modificarAutor (Integer id) {
        List <Autor> autors = autorRepository.findAll();
        return autors;
    }*/
}


