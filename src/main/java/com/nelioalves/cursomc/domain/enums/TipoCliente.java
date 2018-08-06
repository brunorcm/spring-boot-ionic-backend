package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOA_FISICA(0, "Pessoa Física"),
	PESSOA_JURIDICA(1, "Pessoa Jurídica");
	
	private Integer codigo;
	private String descricao;
	
	private TipoCliente(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public static TipoCliente toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoCliente tipo: TipoCliente.values()) {
			if (tipo.getCodigo().equals(codigo)) {
				return tipo;
			}
			
		}
		throw new IllegalArgumentException("Id inválido...: " + codigo);
	}

}
