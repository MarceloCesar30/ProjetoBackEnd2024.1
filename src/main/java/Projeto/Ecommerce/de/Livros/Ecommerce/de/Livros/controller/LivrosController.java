package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.controller;



import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service.LivrosService;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Livros;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LivrosController {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    LivrosService livrosService;

    @PostMapping("/livrosCadastrar")
    public void cadastrarLivros(@RequestBody Livros livros) {

        livrosService.cadastrarLivros(livros);
    }


    @PutMapping("/livrosEditar")
    public void editarLivros(@RequestBody Livros livros) {

        livrosService.editarLivros(livros);
    }

    @DeleteMapping("/livrosDeletar/{id}")
    public void deletarLivros(@PathVariable Integer id) {

        livrosService.deletarLivros(id);
    }

    @GetMapping("/livrosListarId/{id}")
    public Livros listarLivrosId(@PathVariable Integer id) {

        return livrosService.findById(id);
    }
@GetMapping("/buscador/{livrosAutor}")
    public List<Livros> buscarTudo (@PathVariable String livrosAutor){
        return livrosService.buscarTudo(livrosAutor).stream().map(livros -> modelMapper.map(livros, Livros.class)).collect(Collectors.toList());
}

    //        @GetMapping("/buscarDestaques")
//        public List<Livros> listarLivrosDestaque() {
//
//            return livrosService.listarLivrosDestaque();
//        }
//    @GetMapping("/buscarLivros")
//    public String listarPesquisas() {
//        Object livro;
//        String Livros = "João";
//        List<Livros> livros = livrosService.buscarLivros();
//        //model.addAtribute("listarPesquisa",pesquisas);
//        return livros.toString();
//    }
    @GetMapping("/listarLivros")
    public List<Livros> listarLivros() {
        return livrosService.listarLivros();
    }
//    @GetMapping("/livrosTitulo")
//    public Livros listarTitulo(@PathVariable Livros titulo) {
//
//        return livrosService.findBy(titulo);
//   }
//    @GetMapping
//    public List<Livros> listar() {
//       // List<Livros> titulo = livrosService.listar();
//        return new Livros();
//    }
}

