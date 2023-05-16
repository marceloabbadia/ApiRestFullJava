package br.com.serratec.trabalho_sala_de_aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.trabalho_sala_de_aula.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
