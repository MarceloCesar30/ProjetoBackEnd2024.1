package controller;

import entity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorController {
    @Autowired
    AutorService autorService;
    @PostMapping ("/autorCadastrar")
    public void cadastrarAutor(@valid @RequestBody Autor autor){
        autorService.cadastrarAutor(autor);
    }

    @DeleteMapping("/autorDeletar/{id}")
    public void deletarAutor(@PathVariable Integer id) {

        AutorController autorService = null;
        autorService.deletarAutor(id);
    }

    @GetMapping("/AutorListar")
    public List<Autor> listarAutores() {

        return autorService.listarAutores();
    }
}
