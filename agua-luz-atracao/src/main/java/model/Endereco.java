package model;
import enums.SiglaIso;

public class Endereco {
	private String logadouro; 
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private SiglaIso siglaIso;
	
	public Endereco (){
		
	}
	public Endereco(String logadouro, int numero, String complemento, String bairro, String cidade,
			String cep, SiglaIso siglaIso) {
		super();
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.siglaIso = siglaIso;
	}
	
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	public SiglaIso getSiglaIso() {
		return siglaIso;
	}
	public void setSiglaIso(SiglaIso siglaIso) {
		this.siglaIso = siglaIso;
	}
}
