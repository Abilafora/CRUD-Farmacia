package com.generation.farmacia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.modell.Produto;

public interface ProdutoRepository  extends JpaRepository <Produto, Long >{

public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
}

