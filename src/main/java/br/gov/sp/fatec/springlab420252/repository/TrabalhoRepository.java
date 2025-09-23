package br.gov.sp.fatec.springlab420252.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springlab420252.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long>{
    
}
