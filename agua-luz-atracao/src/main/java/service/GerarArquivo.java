package service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerarArquivo {
	public static void geraCsv(String conteudo, String nomeArquivo) {
		File file = new File("C:\\School MJV\\mjv-java-school\\agua-luz-output");
		
		//verificando se existe o diretorio ou nao
		file.mkdirs(); 
		
		//pegando o caminho absoluto do aquivo e o nome para salvar dentro do path
		Path path = Paths.get(file.getAbsolutePath(), nomeArquivo);  //interface nao da o new
		
		//"java tenta esse bloco de codigo, se nao der certo vc pega e printa isso pra mim"
		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8)); //estou criando meu arquivo, passando o caminho e tranformando meu conteudo para byte para o java separar a memoria do aquivo
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
