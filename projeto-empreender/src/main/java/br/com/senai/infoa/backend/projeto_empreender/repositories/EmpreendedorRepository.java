package br.com.senai.infoa.backend.projeto_empreender.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreender.models.Empreendedor;

public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Integer> {
    
}
