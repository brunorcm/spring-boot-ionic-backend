package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(0, "Pendente"),
	QUITADO(1, "Quitado"),
	CANCELADO(2, "Cancelado");
	
	private EstadoPagamento(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	private Integer codigo;
	private String descricao;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (EstadoPagamento estado: EstadoPagamento.values()) {
			if (estado.getCodigo().equals(codigo)) {
				return estado;
			}
			
		}
		throw new IllegalArgumentException("Id inválido...: " + codigo);
	}

}
