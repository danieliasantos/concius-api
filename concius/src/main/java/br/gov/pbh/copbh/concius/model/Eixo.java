package br.gov.pbh.copbh.concius.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eixo", schema = "geral")

public class Eixo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_eixo;
	
	private String descricao;
	
	private boolean inativo;
	
	public int getId() {
		return id_eixo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_eixo;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Eixo other = (Eixo) obj;
		if (id_eixo != other.id_eixo)
			return false;
		return true;
	}
	
	public void setId(int id_eixo) {
		this.id_eixo = id_eixo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isInativo() {
		return inativo;
	}
	
	public void setInativo(boolean inativo) {
		this.inativo = inativo;
	}
	
}
