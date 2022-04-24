
public enum SiglaIso {
	NORUEGA ("NO"),
	ISLANDIA ("IS"),
	ITALIA ("IT");
	
	private String sigla;
	
	SiglaIso(String sigla){
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
