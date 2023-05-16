package br.com.serratec.trabalho_sala_de_aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.trabalho_sala_de_aula.model.Cliente;
import br.com.serratec.trabalho_sala_de_aula.repository.ClienteRepository;


@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> obterTodos(){
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> obterPorId(Long id){
        return clienteRepository.findById(id);
    }
	
	public Cliente adicionar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
  public Cliente atualizar(Long id, Cliente cliente){
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void deletar(long id){
        clienteRepository.deleteById(id);
    }
}

