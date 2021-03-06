package entities;

import entities.enums.TipoDeDocumento;

public class Funcionario {

	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento documento;
	
	public String funcionario(TipoDeDocumento String) {
		
		return funcionario(null);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDeDocumento getDocumento() {
		return documento;
	}

	public void setDocumento(TipoDeDocumento documento) {
		this.documento = documento;
	}
	
	
}
