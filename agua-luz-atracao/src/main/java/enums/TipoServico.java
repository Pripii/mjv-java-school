package enums;

public enum TipoServico {
	AGUA ("A", 137.21),
	LUZ ("L", 132.15);
	
	private String sigla;
	private Double valor;
	
	
	TipoServico(String sigla, Double valor){
		this.sigla = sigla;
		this.valor = valor;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public Double getValor() {
		return valor;
	}
}
