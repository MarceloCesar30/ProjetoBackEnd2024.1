package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.EditoraService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Autor;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Editora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EditoraController {
    @Autowired
    EditoraService editoraService;
    @PostMapping("/editoraCadastrar")
    public void cadastrarEditora( @RequestBody Editora editora){

        editoraService.cadastrarEditora(editora);
    }


    @DeleteMapping("/editoraDeletar/{id}")
    public void deletarEditora(@PathVariable Integer id) {
        editoraService.deletarEditora (id);
    }

    @GetMapping("/editoraListar")
    public List<Editora> listarEditores() {

        return editoraService.listarEditoras();
    }

    @GetMapping("/editoraListarId/{id}")
    public Editora listarEditoraId(@PathVariable Integer id) {

        return editoraService.findById(id);
    }


    @PutMapping ("/editarEditar")
    public Editora editarEditora (@RequestBody Editora editora){

        return editoraService.editarEditora(editora);
    }


}

