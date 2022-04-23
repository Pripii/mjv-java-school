package openbanking;

//criar a classe e ir add atributos
//encapsular
public class Cliente {
	private String nome;
	private String cpfCnpj;
	private Movimentacao movimentacao;
	
	//fazer get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
		
	public void setCpfCnpj (String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}
		
	public void setMovimentacao (Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
	
	}
}
