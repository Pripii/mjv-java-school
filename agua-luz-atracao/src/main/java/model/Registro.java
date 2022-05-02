package model;
import java.time.LocalDate;
import java.time.LocalTime;

import enums.TipoNotificacao;
import enums.TipoServico;

public class Registro {
	private String protocolo;
	private LocalDate data;
	private LocalTime hora;
	private Double valor;
	private TipoServico tipoServico;
	private TipoNotificacao tipoNotificacao;
	
	public Registro () {
		
	}
	
	public Registro(String protocolo, LocalDate data, LocalTime hora, Double valor, TipoServico tipoServico,
			TipoNotificacao tipoNotificacao) {
		super();
		this.protocolo = protocolo;
		this.data = data;
		this.hora = hora;
		this.valor = valor;
		this.tipoServico = tipoServico;
		this.tipoNotificacao = tipoNotificacao;
	}
	public String getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}
	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}
	
	
}
