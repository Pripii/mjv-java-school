package enums;

public enum TipoServico {
	AGUA ("A"),
	LUZ ("L");
	
	private String sigla;
	
	TipoServico(String sigla){
		this.sigla = sigla;
	}
	
	private String getSigla() {
		return sigla;
	}
}
