package com.teste.screenmatch_frases.service;

import com.teste.screenmatch_frases.DTO.FraseDTO;
import com.teste.screenmatch_frases.model.Frase;
import com.teste.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    private FraseDTO toFraseDTO(Frase frase) {
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

    public FraseDTO obterFrase() {
        return toFraseDTO(repository.buscarfrase());
    }

}
