package com.algaworks.algalog.algalogapi.domain.services;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algalog.algalogapi.domain.model.Entrega;
import com.algaworks.algalog.algalogapi.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
    
   EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId){
    return entregaRepository.findById(entregaId)
        .orElseThrow(()-> new EntidadeNaoEncontradaException("Entrega nâo encontrada"));
    }
}
