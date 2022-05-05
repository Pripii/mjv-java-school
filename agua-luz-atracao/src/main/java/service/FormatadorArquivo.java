package service;

import java.util.List;

import model.Pessoa;

public class FormatadorArquivo {
	public String txt(List<Pessoa> pessoas) {
		StringBuilder sbuilder = new StringBuilder();
		for (Pessoa pessoa : pessoas) { 
			sbuilder.append(pessoa.getCpf());
			sbuilder.append(pessoa.getRg());
			sbuilder.append(pessoa.getNome());
			sbuilder.append(pessoa.getCelular());
			sbuilder.append(pessoa.getEndereco().getLogadouro());
			sbuilder.append(pessoa.getEndereco().getNumero());
			sbuilder.append(pessoa.getEndereco().getComplemento());
			sbuilder.append(pessoa.getEndereco().getBairro());
			sbuilder.append(pessoa.getEndereco().getCidade());
			sbuilder.append(pessoa.getEndereco().getUf());
			sbuilder.append(pessoa.getEndereco().getCep());
			sbuilder.append(pessoa.getEndereco().getSiglaIso());
			sbuilder.append(pessoa.getRegistro().getData());
			sbuilder.append(pessoa.getRegistro().getHora());
			sbuilder.append(pessoa.getRegistro().getTipoServico());
			sbuilder.append(pessoa.getRegistro().getValor());
			sbuilder.append(pessoa.getRegistro().getTipoNotificacao());
		}
		return sbuilder.toString();
	}

	public String csv(List<Pessoa> pessoas) { // a delimitacao do csv e feita por ';'
		StringBuilder builder = new StringBuilder();
		for (Pessoa pessoa : pessoas) { // para cada pessoa 'pessoa' dentro de pessoas eu vou fazer tal coisa
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
	//criando metodo para formatacao
	//public static String formatadorAtributos(String atributo, int delimitador) {
		//String atributoFormatado = atributo.substring(0, delimitador);
	
	
	/*public String menssage(Pessoa client) {

			StringBuilder stringBuilder = new StringBuilder();	
			stringBuilder.append("\nLogradouro: " + client.getEndereco().getLogadouro());
			stringBuilder.append("\nComplemento: " + client.getEndereco().getComplemento());
			stringBuilder.append("\nBairro: " + client.getEndereco().getBairro());
			stringBuilder.append("\nCidade: " + client.getEndereco().getCidade());
			stringBuilder.append("\nCep: " + client.getEndereco().getCep());
		
			return stringBuilder.toString();
	}
	 */
}

