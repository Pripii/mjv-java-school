package service;

import java.util.List;

import model.Pessoa;
import repository.BancoDeDados;

public class GerarMensagem {

	 public static void main(String[] args) {
		 FormatadorArquivo formatadorArquivo = new FormatadorArquivo();
		 	
		 BancoDeDados bancoDeDados = new BancoDeDados();
		 	List<Pessoa> conteudo = bancoDeDados.listar();
		 	String conteudoFormatado = formatadorArquivo.csv(conteudo);
		 	GerarArquivo.geraCsv(conteudoFormatado, "agua-luz-contratos.csv");
		 	
		 	
		 
		 	
		 
		 
}
}
