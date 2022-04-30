package model;
import enums.SiglaIso;
import enums.TipoServico;

public class Endereco {
	private String logadouro; 
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private SiglaIso siglaiso;
	
	public Endereco(String logadouro, int numero, String complemento, String bairro, String cidade,
			String cep, SiglaIso siglaiso) {
		super();
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.siglaiso = siglaiso;
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
	public SiglaIso getSiglaiso() {
		return siglaiso;
	}
	public void setSiglaiso(SiglaIso siglaiso) {
		this.siglaiso = siglaiso;
	}
}
