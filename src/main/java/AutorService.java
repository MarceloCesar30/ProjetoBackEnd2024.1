import entity.Autor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutorService {
    @Autowired
    AutorRepository autorRepository;

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
}
}
