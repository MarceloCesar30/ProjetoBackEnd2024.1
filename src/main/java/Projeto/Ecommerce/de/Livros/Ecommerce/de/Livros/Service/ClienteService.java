package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.Service;


import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity.Cliente;
import Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteService {


        @Autowired
        private ClienteRepository clienteRepository;

        public void deletarCliente(Cliente cliente) {

            clienteRepository.delete(cliente);
        }
        public void deletarCliente(String id_Cliente) {

            clienteRepository.deleteById(id_Cliente);
        }

        public Cliente findById(String id) {

            return clienteRepository.findById(id).get();
        }


        //public void cadastrarCliente(Cliente cliente){
        //    clienteRepository.save(cliente);

        //}

        public List<Cliente> listarClientes() {
            List<Cliente> clientes = clienteRepository.findAll();
            return clientes;
        }

        public Cliente editarCliente(@RequestBody Cliente cliente) {

            return  clienteRepository.save(cliente);
        }
        public void cadastrarCliente (Cliente cliente){
            clienteRepository.save(cliente);
        }

    }





