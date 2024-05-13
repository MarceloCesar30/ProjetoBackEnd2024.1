package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;



import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Carrinho;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public void deletarCarrinho(Carrinho carrinho) {

        carrinhoRepository.delete(carrinho);
    }
    public void deletarCarrinho(Integer id) {

        carrinhoRepository.deleteById(id);
    }
    public Carrinho findById(Integer id) {

        return carrinhoRepository.findById(id).get();
    }


    public void cadastrarCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);

    }

    public List<Carrinho> listarCarrinhos() {
        List<Carrinho> carrinhos = carrinhoRepository.findAll();
        return carrinhos;
    }

    public Carrinho editarCarrinho(@RequestBody Carrinho carrinho) {

        return  carrinhoRepository.save(carrinho);
    }


}





