package entities.enums;

public enum TipoDeDocumento {

	RG,
	CPF,
	CNPJ;
	
	private String descricao;
	
	TipoDeDocumento(String descricao){
		this.descricao = descricao;
	}
	
	private TipoDeDocumento() {
		
	}
	
	public String getDescricao() {
		
		return descricao;
	}
}
