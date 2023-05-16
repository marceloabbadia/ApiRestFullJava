package br.com.serratec.trabalho_sala_de_aula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.trabalho_sala_de_aula.model.Documento;
import br.com.serratec.trabalho_sala_de_aula.repository.DocumentoRepository;


@Service
public class DocumentoService {

	@Autowired
	private DocumentoRepository DocumentoRepository;
	
	public List<Documento> obterTodos(){
		return DocumentoRepository.findAll();
	}
	
	public Optional<Documento> obterPorId(long id){
        return DocumentoRepository.findById(id);
    }
	
	public Documento adicionar(Documento Documento) {
		return DocumentoRepository.save(Documento);
	}
	
  public Documento atualizar(Long id, Documento Documento){
        Documento.setId(id);
        return DocumentoRepository.save(Documento);
    }

    public void deletar(long id){
        DocumentoRepository.deleteById(id);
    }
}

