package com.mjv.pedidofast.model.pedido;

import java.util.List;

import com.mjv.pedidofast.model.cadastro.Cliente;

public class Pedido {
	private Integer id;
	private LocatDateTime dataHora;
	private Double valorTotal;
	private Cliente cliente;
	private List<PedidoItem> itens;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocatDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocatDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<PedidoItem> getItens() {
		return itens;
	}
	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	
}
