package openbanking;

import java.time.LocalDate;

//criar a classe e ir add atributos
//encapsular
public class Movimentacao {
	private LocalDate data;
	private Double valor;
	private TipoMovimentacao tipomovimentacao;
	private Boolean estorno;
	
	//se atentar a ordem do construtor 
	Movimentacao(LocalDate data, Double valor, TipoMovimentacao tipomovimentacao, Boolean estorno) {
		this.data = data;
		this.valor = valor;
		this.tipomovimentacao = tipomovimentacao;
		this.estorno = estorno;
	}
	
	//fazer get e set
	public LocalDate getData() {
		return data;
	} 
	
	public void setData (LocalDate data) {
		this.data = data;
	}
	
	public Double getValor() {
		return valor;
	} 
	
	public void setValor (Double valor) {
		this.valor = valor;
	}
	
	public TipoMovimentacao getTipomovimentacao() {
		return tipomovimentacao;
	} 
	
	public void setTipomovimentacao (TipoMovimentacao tipomovimentacao) {
		this.tipomovimentacao = tipomovimentacao;
	}
	
	public Boolean getEstorno() {
		return estorno;
	} 
	
	public void setValor (Boolean estorno) {
		this.estorno = estorno;
	}
}
