package repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import enums.SiglaIso;
import enums.TipoNotificacao;
import enums.TipoServico;
import model.Endereco;
import model.Pessoa;
import model.Registro;

public class BancoDeDados {
	
	private List<Registro> registros = new ArrayList<Registro>();
	
	public List<Registro> listar() {
		
		Endereco address = new Endereco();
		 address.setLogadouro("Rua Caldeirão Furado");
		 address.setNumero(31);
		 address.setComplemento("casa 07");
		 address.setBairro("Beco Diagonal");
		 address.setCidade("Londres");
		 address.setCep("7997");
		 address.setSiglaIso(SiglaIso.NORUEGA);
		 
		 Registro record = new Registro();
		 record.setProtocolo("97979797");
		 record.setTipoServico(TipoServico.AGUA);
		 record.setTipoNotificacao(TipoNotificacao.WHATS);
		 record.setValor(97.97);
		 record.setData(LocalDate.of(2022, 05, 03));
		 record.setHora(LocalTime.of(17, 00));
		 
		 Pessoa client = new Pessoa();
		 client.setNome("Priscilla Aniboleti");
		 client.setCpf("797.979.797-97");
		 client.setRg("90909090");
		 client.setCelular("70707070");
		 client.setEndereco(address);
		 client.setRegistro(record);
		 
		 registros.add(record); //add e um metodo de arraylist do java para 'puxar' uma lista
		 return registros; 
	
	}
}
