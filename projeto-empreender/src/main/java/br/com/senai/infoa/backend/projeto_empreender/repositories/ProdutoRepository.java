package br.com.senai.infoa.backend.projeto_empreender.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreender.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
