package app;
import model.Pessoa;

public class Notificacao {
	public void showMessage(Pessoa client) {
		
		System.out.println("Senhor(a) " + client.getNome() + " cpf de número " + client.getCpf() + ", informamos que conforme contrato com protocolo \nde número " + client.getServicos().getProtocolo()+ " está agendado para a data " + client.getServicos().getData() +" e para a hora "+ client.getServicos().getHora() +"h a instalação \ndo serviço de " + client.getServicos().getTipo() + " , com taxa de valor R$" + client.getServicos().getValor().toString().replace(".","," ) + " em sua residência localizada no endereço abaixo:");

		StringBuilder stringbuilder = new StringBuilder();	
		stringbuilder.append("\nLogradouro: " + client.getEndereco().getLogadouro());
		stringbuilder.append("\nComplemento: " + client.getEndereco().getComplemento());
		stringbuilder.append("\nBairro: " + client.getEndereco().getBairro());
		stringbuilder.append("\nCidade: " + client.getEndereco().getCidade() + " / " + client.getEndereco().getEstado());
		stringbuilder.append("\nCep: " + client.getEndereco().getCep());
		System.out.println(stringbuilder.toString());
	}
}
