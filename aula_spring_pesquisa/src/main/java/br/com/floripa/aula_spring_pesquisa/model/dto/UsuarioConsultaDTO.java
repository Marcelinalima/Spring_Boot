package br.com.floripa.aula_spring_pesquisa.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioConsultaDTO {

    private Long id;
    private String nome;
    
    
}