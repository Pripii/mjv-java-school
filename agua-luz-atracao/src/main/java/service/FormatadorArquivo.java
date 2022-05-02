package service;

import java.util.List;

import model.Pessoa;

public class FormatadorArquivo {
	public void txt(List<Pessoa> pessoas) {
		
	}
	public String csv(List<Pessoa> pessoas) { //a delimitacao do csv e feita por ';'
		StringBuilder builder = new StringBuilder();
		for(Pessoa pessoa: pessoas) { //para cada pessoa 'pessoa' dentro de pessoas eu vou fazer tal coisa
			builder.append(pessoa.getCpf() + ";");
			builder.append(pessoa.getRg() + ";");
			builder.append(pessoa.getNome() + ";");
			builder.append(pessoa.getCelular() + ";");
			builder.append(pessoa.getEndereco().getLogadouro() + ";");
			builder.append(pessoa.getEndereco().getNumero() + ";");
			builder.append(pessoa.getEndereco().getComplemento() + ";");
			builder.append(pessoa.getEndereco().getBairro() + ";");
			builder.append(pessoa.getEndereco().getCidade() + ";");
			builder.append(pessoa.getEndereco().getUf() + ";");
			builder.append(pessoa.getEndereco().getCep() + ";");
			builder.append(pessoa.getEndereco().getSiglaIso() + ";");
			builder.append(pessoa.getRegistro().getData() + ";");
			builder.append(pessoa.getRegistro().getHora() + ";");
			builder.append(pessoa.getRegistro().getTipoServico() + ";");
			builder.append(pessoa.getRegistro().getValor() + ";");
			builder.append(pessoa.getRegistro().getTipoNotificacao());
		}
		return builder.toString();
	} 
}
