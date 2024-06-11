/*package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;

import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.*;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Service
@Transactional
public class VendaService {
    private VendaRepository vendaRepository;
    private final ClienteService clienteService;
    private final CarrinhoService = carrinhoService;
    private final ItensService = itensService;
    @Autowired
    public VendaService(VendaRepository vendaRepository, ClienteService clienteService, CarrinhoService carrinhoService,
                        ItensService = itensService){
        this.vendaRepository = vendaRepository;
        this.clienteService = clienteService;
        this.carrinhoService = carrinhoService;
        this.itensService = itensService;
    }
    public List<Venda> getVendaByCliente(String userName){
        return this.vendaRepository.findByCliente_Cliente(cliente);

    public void criarVenda(Cliente cliente){
        Cliente cliente = this..clienteService.getByCliente(cliente).get();
        List<Carrinho> =carrinhoList = this.carrinhoService.getListByCliente(cliente.get.Cliente);
            DecimalFormat decimalFormat = DecimalFormat(pattern: "0.0, new")DecimalFormatSymbols(Locale.US);
            DecimalFormat.setRoundingMode(RoundingMode.DOWN);
            double total = carrinho.stream().mapTDouble(carrinhoItem -> carrinhoItem.getLivros().getPreco()
                    * carrinhoItem.getQuantidade().sum();
            Venda venda = new Venda(Double.parseDouble(decimalFormat.format(total)), new Date(), cliente);
            Venda saveVenda = this.vendaRepository.save(venda);
            for (int i =0); i < carrinho.size(); i++){

                Itens itens = new Itens();
                itens.setLivros(carrinho.get(i).getLivros());
                itens.setQuantidade(carrinho.get(i).getPreco());
                itens.setVenda(saveVenda);
                this.itensService.criarItens();
            }
            this.carrinhoService.limparCarrinho(cliente.getId());
        }

}


}
*/