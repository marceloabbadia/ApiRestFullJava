package br.com.serratec.trabalho_sala_de_aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.trabalho_sala_de_aula.model.Pedido;
import br.com.serratec.trabalho_sala_de_aula.repository.PedidoRepository;


@Service
public class PedidoService {

	@Autowired
	private PedidoRepository PedidoRepository;
	
	public List<Pedido> obterTodos(){
		return PedidoRepository.findAll();
	}
	
	public Optional<Pedido> obterPorId(long id){
        return PedidoRepository.findById(id);
    }
	
	public Pedido adicionar(Pedido Pedido) {
		return PedidoRepository.save(Pedido);
	}
	
  public Pedido atualizar(Long id, Pedido Pedido){
        Pedido.setId(id);
        return PedidoRepository.save(Pedido);
    }

    public void deletar(long id){
        PedidoRepository.deleteById(id);
    }
}

