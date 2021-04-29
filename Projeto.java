package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List<Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_termino, List<Contratacao> listaContratacao) {
		
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_termino;
		this.listaContratacao = listaContratacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_termino() {
		return dt_Termino;
	}

	public void setDt_termino(Date dt_termino) {
		this.dt_Termino = dt_termino;
	}

	public List<Contratacao> getListaContratacao() {
		return listaContratacao;
	}

	public void setListaContratacao(List<Contratacao> listaContratacao) {
		this.listaContratacao = listaContratacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dt_Inicio == null) ? 0 : dt_Inicio.hashCode());
		result = prime * result + ((dt_Termino == null) ? 0 : dt_Termino.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Projeto other = (Projeto) obj;
		if (dt_Inicio == null) {
			if (other.dt_Inicio != null)
				return false;
		} else if (!dt_Inicio.equals(other.dt_Inicio))
			return false;
		if (dt_Termino == null) {
			if (other.dt_Termino != null)
				return false;
		} else if (!dt_Termino.equals(other.dt_Termino))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public boolean adicionarContratacao(Contratacao contracao) {
		
		if(contracao != null && listaContratacao.contains(contracao)) {
			this.listaContratacao.add(contracao);
			return true;
		}
		
		return false;
		
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		
		if(contratacao != null && listaContratacao.size() > 0 && listaContratacao.contains(contratacao)) {
			this.listaContratacao.remove(contratacao);
			return true;
		}
		
		return false;
		
	}
	
	public void listaContratacao() {
		
		if(listaContratacao.isEmpty()) {
			System.out.println();
			System.out.println("Projeto" + this.nome + "Não está em nenhum pojeto");
		}
		
		else {
			
			for(Contratacao c : listaContratacao) {
				
				System.out.println("Projeto:" + c.contratado().get.nome().get.dt_Entrada().get.dt_Saida());
		
			}
			
		}
		
		
	}

	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino + "]";
	}

}
