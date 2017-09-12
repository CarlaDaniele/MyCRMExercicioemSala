package com.yourcodelab.model;

public class Servico {
		private Integer id;
		private String servico;
		private Float preco;
		private String descricao;
		private int diasUteis;
		
		public Servico(Integer id, String servico, Float preco, String descricao, int diasUteis) {
			super();
			this.id = id;
			this.servico = servico;
			this.preco = preco;
			this.descricao = descricao;
			this.diasUteis = diasUteis;
		}
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getServico() {
			return servico;
		}
		public void setServico(String servico) {
			this.servico = servico;
		}
		public Float getPreco() {
			return preco;
		}
		public void setPreco(Float preco) {
			this.preco = preco;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public int getDiasUteis() {
			return diasUteis;
		}
		public void setDiasUteis(int diasUteis) {
			this.diasUteis = diasUteis;
		}
		
		
}
