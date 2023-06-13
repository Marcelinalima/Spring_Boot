package br.com.floripa.aula_spring_pesquisa.model.dto;

import java.util.List;

import br.com.floripa.aula_spring_pesquisa.model.enums.EstadoCivil;
import br.com.floripa.aula_spring_pesquisa.model.enums.GeneroFilmes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PesquisaListaDTO {
    
     private Long id;

    private String nome;

    private String sexo;

    private EstadoCivil estadoCivil;

    private List<GeneroFilmes> generosFilme;
}
    
