package service;

import java.util.List;

import model.Pessoa;
import repository.BancoDeDados;

public class GerarMensagem {

	 public static void main(String[] args) {
		 FormatadorArquivo formatadorArquivo = new FormatadorArquivo();
		 	
		 BancoDeDados bancoDeDados = new BancoDeDados();
		 	List<Pessoa> conteudo = bancoDeDados.listar();
		 	String conteudoFormatadoCsv = formatadorArquivo.csv(conteudo);
		 	GerarArquivo.geraCsv(conteudoFormatadoCsv, "agua-luz-contratos.csv");
		 	String conteudoFormatadoTxt = formatadorArquivo.txt(conteudo);
		 	GerarArquivo.geraTxt(conteudoFormatadoTxt, "agua-luz-contratos.txt");
		 	
		 	
		 //fazer mensagem do case 1 em um arquivo contrato-xxx.txt		 
		 	
		 //System.out.println("Senhor(a) " + client.getNome() + " cpf de número " + client.getCpf() + ", informamos que conforme contrato com protocolo \nde número " + client.getServicos().getProtocolo()+ " está agendado para a data " + client.getServicos().getData() +" e para a hora "+ client.getServicos().getHora() +"h a instalação \ndo serviço de " + client.getServicos().getTipo() + " , com taxa de valor R$" + client.getServicos().getValor().toString().replace(".","," ) + " em sua residência localizada no endereço abaixo:");
	 }
}
