package br.com.serratec.trabalho_sala_de_aula.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.trabalho_sala_de_aula.model.Pedido;
import br.com.serratec.trabalho_sala_de_aula.service.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService PedidoService;
	
	@GetMapping
    public List<Pedido> obterTodos(){
        return PedidoService.obterTodos();
    }
    
    @GetMapping("/{id}")
    public Optional<Pedido> obterPorId(@PathVariable long id){
        return PedidoService.obterPorId(id);
    }

    @PostMapping
    public Pedido adicionar(@RequestBody Pedido Pedido){
        return PedidoService.adicionar(Pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizar(@RequestBody long id, Pedido Pedido){
        return PedidoService.atualizar(id, Pedido);
    }

    @DeleteMapping("/{id}")
    public void deletar(long id){
        PedidoService.deletar(id);
    }
}
