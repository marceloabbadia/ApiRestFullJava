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

import br.com.serratec.trabalho_sala_de_aula.model.Documento;
import br.com.serratec.trabalho_sala_de_aula.service.DocumentoService;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {

	@Autowired
	private DocumentoService documentoService;
	
	@GetMapping
    public List<Documento> obterTodos(){
        return documentoService.obterTodos();
    }
    
    @GetMapping("/{id}")
    public Optional<Documento> obterPorId(@PathVariable Long id){
        return documentoService.obterPorId(id);
    }

    @PostMapping
    public Documento adicionar(@RequestBody Documento documento){
        return documentoService.adicionar(documento);
    }

    @PutMapping("/{id}")
    public Documento atualizar(@PathVariable Long id, @RequestBody Documento documento){
        return documentoService.atualizar(id, documento);
    }

    @DeleteMapping("/{id}")
    public void deletar( @PathVariable Long id){
    	documentoService.deletar(id);
    }
}
