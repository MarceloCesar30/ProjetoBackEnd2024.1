package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Editora;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class EditoraService {
    @Autowired
    private EditoraRepository editoraRepository;

    public void deletarAutor(Editora editora) {

        editoraRepository.delete(editora);
    }
    public void deletarEditora(Integer id) {

        editoraRepository.deleteById(id);
    }
    public Editora findById(Integer id) {

        return editoraRepository.findById(id).get();
    }


    public void cadastrarEditora(Editora editora) {
        editoraRepository.save(editora);

    }

    public List<Editora> listarEditoras() {
        List<Editora> editoras = editoraRepository.findAll();
        return editoras;
    }


    public Editora editarEditora(@RequestBody Editora editora) {

        return  editoraRepository.save(editora);
    }


}
