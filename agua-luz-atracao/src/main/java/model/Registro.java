package model;
import java.time.LocalDate;
import java.time.LocalTime;

import service.TipoNotificacao;
import service.TipoServico;

public class Registro {
	private Long protocolo;
	private LocalDate data;
	private LocalTime hora;
	private Double valor;
	private TipoServico tiposervico;
	private TipoNotificacao tiponotificacao;
	
	public Registro(Long protocolo, LocalDate data, LocalTime hora, Double valor, TipoServico tiposervico,
			TipoNotificacao tiponotificacao) {
		super();
		this.protocolo = protocolo;
		this.data = data;
		this.hora = hora;
		this.valor = valor;
		this.tiposervico = tiposervico;
		this.tiponotificacao = tiponotificacao;
	}
	public Long getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Long protocolo) {
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
	public TipoServico getTiposervico() {
		return tiposervico;
	}
	public void setTiposervico(TipoServico tiposervico) {
		this.tiposervico = tiposervico;
	}
	public TipoNotificacao getTiponotificacao() {
		return tiponotificacao;
	}
	public void setTiponotificacao(TipoNotificacao tiponotificacao) {
		this.tiponotificacao = tiponotificacao;
	}
	
	
}
