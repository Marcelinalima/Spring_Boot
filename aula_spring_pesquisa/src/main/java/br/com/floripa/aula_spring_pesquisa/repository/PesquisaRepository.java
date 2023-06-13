package br.com.floripa.aula_spring_pesquisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.floripa.aula_spring_pesquisa.model.entidades.Pesquisa;


public interface PesquisaRepository  extends JpaRepository<Pesquisa, Long>{
   
    
    Pesquisa findByIdAndNome(Long id, String nome);

   

}