/*
package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Carrinho;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Itens;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.ItensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ItensService{
    @Autowired
    private ItensRepository itensRepository;
}
@Autowired
public ItensService (ItensRepository itensRepository) {
    this.itensRepository = itensRepository;
}

public void criarItens(Itens itens){
    this.itensRepository.save(itens);
}

public List<Itens> getItensByVenda (Integer vendaId){
    return this.itensRepositor.findByVenda_Id(vendaId);
}

   /* @Autowired
    public CarrinhoService(CarrinhoRepository carrinhoRepository){
        this.carrinhoRepository = carrinhoRepository;
    }

    public List<Carrinho> getListByCliente(String nomeCliente) {
        return this.carrinhoRepository.findByCliente_nome(nomeCliente);
    }

    /*public List<Carrinho> listarCarrinhos() {
        List<Carrinho> carrinhos = carrinhoRepository.findAll();
        return carrinhos;
    }*/
/*
public void limparItens(Integer clienteId) {
    this.itensRepository.deleteByCliente_Id(clienteId);

}
public void removeLivros(Integer id){
    this.itensRepository.deleteById(id);
}

public void addLivros(Carrinho carrinho){
    this.carrinhoRepository.save(carrinho);

}
    /*public void cadastrarCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);

    }*/
/*
public Long getCountByCliente(Integer clienteId){
    return this.carrinhoRepository.countByCliente_Id(clienteId);
}*/
    /*public void deletarCarrinho(Carrinho carrinho) {

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



    public Carrinho editarCarrinho(@RequestBody Carrinho carrinho) {

        return  carrinhoRepository.save(carrinho);
    }*/
