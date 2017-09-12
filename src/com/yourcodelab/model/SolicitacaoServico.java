package com.yourcodelab.model;

public class SolicitacaoServico {
	private Integer id;
	private Integer idCliente;
	private Integer idServico;
	private String descricao;
	private String dataos;
	
	public SolicitacaoServico(Integer id, Integer idCliente, Integer idServico, String descricao, String dataos) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idServico = idServico;
		this.descricao = descricao;
		this.dataos = dataos;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdServico() {
		return idServico;
	}
	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDataos() {
		return dataos;
	}
	public void setDataos(String dataos) {
		this.dataos = dataos;
	}
	
	
}
