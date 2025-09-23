package br.gov.sp.fatec.springlab420252.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springlab420252.entity.Trabalho;
import br.gov.sp.fatec.springlab420252.repository.TrabalhoRepository;

@Service
public class TrabalhoServiceImpl implements TrabalhoService{

    private TrabalhoRepository trabalhoRepo;

    public TrabalhoServiceImpl (TrabalhoRepository trabalhoRepo){
            this.trabalhoRepo = trabalhoRepo;

    }
        
    @Override
    public List<Trabalho> buscarTodos() {
       return trabalhoRepo.findAll();
    }


    
}
