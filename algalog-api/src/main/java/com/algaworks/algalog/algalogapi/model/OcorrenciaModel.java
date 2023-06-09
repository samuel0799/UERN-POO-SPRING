package com.algaworks.algalog.algalogapi.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaModel {
    
    private Long id;
    private String descricao;
    private LocalDateTime dataRegistro;
}
