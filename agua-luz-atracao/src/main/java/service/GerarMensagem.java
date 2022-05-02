package service;

import java.util.List;

import model.Pessoa;
import repository.BancoDeDados;

public class GerarMensagem {

	 public static void main(String[] args) {
		 FormatadorArquivo formatadorArquivo = new FormatadorArquivo();
		 	
		 BancoDeDados bancoDeDados = new BancoDeDados();
		 	List<Pessoa> conteudo = bancoDeDados.listar();
		 	String conteudoFormatadocsv = formatadorArquivo.csv(conteudo);
		 	GerarArquivo.geraCsv(conteudoFormatadocsv, "agua-luz-contratos.csv");
		 	String conteudoFormatadotxt = formatadorArquivo.txt(conteudo);
		 	GerarArquivo.geraCsv(conteudoFormatadotxt, "agua-luz-contratos.txt");
		 	
		 	
		 
		 	
		 
		 
}
}
