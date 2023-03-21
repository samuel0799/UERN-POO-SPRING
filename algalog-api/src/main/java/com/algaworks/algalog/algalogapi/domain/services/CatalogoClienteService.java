package com.algaworks.algalog.algalogapi.domain.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.algaworks.algalog.algalogapi.domain.exception.NegocioException;
import com.algaworks.algalog.algalogapi.domain.model.Cliente;
import com.algaworks.algalog.algalogapi.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class CatalogoClienteService {
    
    private ClienteRepository clienteRepository;

    public Cliente buscar(Long clienteId){
        return clienteRepository.findById(clienteId)
        .orElseThrow(() -> new NegocioException("Cliente não encontrado"));
    }

    @Transactional
    public Cliente salvar(Cliente cliente){
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
                    .stream()
                 .anyMatch(clienteExistente->!clienteExistente.equals(cliente));
        if (emailEmUso) {
            throw new NegocioException("Já existe um cliente cadastrado com esse email");
        }            
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long clienteId){
        clienteRepository.deleteById(clienteId);    
    }
}
