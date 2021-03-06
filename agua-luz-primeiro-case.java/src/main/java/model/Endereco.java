package model;

public class Endereco {
	private String logadouro;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	
	public String getLogadouro() {
		return logadouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
}
