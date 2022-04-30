package service;

public enum TipoNotificacao {
	SMS ("S"),
	WHATS ("W");
	
	private String sigla;
	
	TipoNotificacao(String sigla){
		this.sigla = sigla;
	}
	
	private String getSigla() {
		return sigla;
	}
}
