package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Cidade;

public class CidadeDTO {
	
	private Integer id;
	private String nome;
	
	public CidadeDTO(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public CidadeDTO() {
		super();
	}
	
	public CidadeDTO(Cidade obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
