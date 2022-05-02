package service;

import java.util.List;

import model.Registro;

public class GerarArquivo {
	public void txt(List<Registo> registros) {
		
	}
	public void csv(List<Registo> registros) {
		StringBuilder builder = new StringBuilder();
		for(Registro r: registros) {
			builder.append(r.getClient().getNome() + ";");
			builder.append(r.getClient().getCpf() + ";");
		}
	}
}
