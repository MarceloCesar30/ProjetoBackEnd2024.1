package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.AutorRepository;
import org.springframework.web.bind.annotation.RequestBody;
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
//    public List<Autor> listarAutoresId(Integer id) {
//        List<Autor> autores = autorRepository.findById(id);
//        return autores;
//    }
//


    public Autor editarAutor(@RequestBody Autor autor) {

        return  autorRepository.save(autor);
    }



   /* public Autor modificarAutor (Integer id) {
        List <Autor> autors = autorRepository.findAll();
        return autors;
    }*/
}


