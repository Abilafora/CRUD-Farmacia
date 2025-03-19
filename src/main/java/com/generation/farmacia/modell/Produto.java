package com.generation.farmacia.modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigatório!")
	@Size(min = 1, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "Poderia colocar um nota se precisa ou não de receita médica!")
	private String nota;
	
	@NotBlank(message = "O atributo preço é obrigatório!")
	@Size(min = 1, max = 1000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
	private double preco ;
	
	@Min(value = 1, message = "O atributo quantidade de estoque deve ser no mínimo 1")
	@Max(value = 1000, message = "O atributo quantidade de estoque deve ser no máximo 1000")
	private int quantidadeEstoque;
	
	//@ManyToOne
	//@JsonIgnoreProperties("produto")
	//private Categoria categoria;
	
	
}