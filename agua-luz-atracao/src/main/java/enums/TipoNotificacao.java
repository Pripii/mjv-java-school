package enums;

public enum TipoNotificacao {
	SMS ("S"),
	WHATS ("W");
	
	private String sigla;
	
	TipoNotificacao(String sigla){
		this.sigla = sigla;
	}
	
	public String getSigla() {
		return sigla;
	}
}
//enum nao tem set, pq e uma constante, ou seja, nao muda o valor.