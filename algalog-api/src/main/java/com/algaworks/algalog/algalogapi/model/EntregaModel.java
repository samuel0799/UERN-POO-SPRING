package com.algaworks.algalog.algalogapi.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.algaworks.algalog.algalogapi.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class EntregaModel {
    
    private Long id;
    private ClienteIdNomeModel cliente;
    private String nomeCliente;
    private DestinatarioModel destinatario;
    private BigDecimal taxa;
    private StatusEntrega status;
    private LocalDateTime dataPedido;
    private LocalDateTime dataFinalizacao;

}
