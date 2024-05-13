package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.LivrosService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivrosController {

    @Autowired
    LivrosService livrosService;

    @PostMapping("/livrosCadastrar")
    public void cadastrarLivros(@RequestBody Livros livros) {
        livrosService.cadastrarLivros(livros);
    }

    @DeleteMapping("/livroDeletar/{id}")
    public void deletarLivros(@PathVariable Integer id) {
        livrosService.deletarLivros(id);
    }

    @GetMapping("/livrosListar")
    public List<Livros> listarLivros() {
        return livrosService.listarLivros();
    }

    @PutMapping("/editarLivros")
    public Livros editarLivros(@RequestBody Livros livros) {
        return livrosService.editarLivros(livros);
    }
}