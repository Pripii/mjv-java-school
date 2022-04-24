import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

	 public static void main(String[] args) {
		 
		 Endereco address = new Endereco();
		 address.setLogadouro("Rua Caldeirão Furado");
		 address.setComplemento("casa 07");
		 address.setBairro("Beco Diagonal");
		 address.setCidade("Londres");
		 address.setCep("7997");
		 address.setEstado("Grã-Bretanha");
		 
		 
		 Servicos service = new Servicos();
		 service.setProtocolo("97979797");
		 service.setTipo("Água");
		 service.setValor(97.97);
		 service.setData(LocalDate.now());
		 service.setHora(LocalTime.now());
		 // OU Servicos service = new Servicos ("97979797", "Água", 97.97, LocalDate.now(), LocalTime.now())
		 
		 Pessoa client = new Pessoa();
		 client.setNome("Priscilla Aniboleti");
		 client.setCpf("797.979.797.-97");
		 client.setEndereco(address);
		 client.setServicos(service);
		 
		 Notificacao message = new Notificacao();
		 message.showMessage(client);
		 
}
}
