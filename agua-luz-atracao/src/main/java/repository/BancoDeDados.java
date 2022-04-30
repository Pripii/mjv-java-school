package repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import model.Endereco;
import model.Pessoa;
import model.Registro;

public class BancoDeDados {
	
	private List<Registro> registros = new ArrayList<Registro>();
	
	public List<Registro> listar() {
		
		Endereco address = new Endereco();
		 address.setLogadouro("Rua Caldeirão Furado");
		 address.setNumero();
		 address.setComplemento("casa 07");
		 address.setBairro("Beco Diagonal");
		 address.setCidade("Londres");
		 address.setCep("7997");
		 address.setSiglaiso();
		 
		 Registro record = new Registro();
		 record.setProtocolo("97979797");
		 record.setTiposervico("Água");
		 record.setTiponotificacao();
		 record.setValor(97.97);
		 record.setData(LocalDate.of(2022, 05, 03));
		 record.setHora(LocalTime.of(17, 00));
		 // OU Servicos service = new Servicos ("97979797", "Água", 97.97, LocalDate.now(), LocalTime.now())
		 
		 Pessoa client = new Pessoa();
		 client.setNome("Priscilla Aniboleti");
		 client.setCpf("797.979.797-97");
		 client.setRg();
		 client.setCelular();
		 client.setEndereco(address);
		 client.setRegistro(record);
		 
		 registros.add(record);
		 return registros; 
	
	}
}
