package explorando.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaAulas {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de lista e objetos", 15);
	
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		//aulas.add("Equals e Hashcode"); - NÃO posso fazer isso pq essa arraylist eh só de aulas, então ela nao autoriza strings
	
		System.out.println(aulas); //aula, me de sua representação como string. O java "chama" o to string
		//Qual será o resultado? O nome das três aulas? Na verdade, não. O método toString da classe ArrayList percorre todos os elementos da lista, concatenando seus valores também de toString. Como a classe Aula não possui um toString reescrito (_override_), ele utilizará o toString definido em Object, que retorna o nome da classe, concatenado com um @ e seguido de um identificador único do objeto. 
	
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//Ordenar as aulas comparando o tempo das aulas
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // OU aulas.sort(Comparator.comparing(Aula::getTempo));
	
		System.out.println(aulas);
	
		//Diferente de uma String ou de tipos primitivos mais simples, o Collections.sort não sabe ordenar uma lista de Aula. De qual forma ele faria isso? Pelo nome da aula? Pela duração? Não daria para saber. Para que ele seja capaz de fazer isso, você precisa implementar a interface Comparable definindo um critério de comparação para os objetos desse tipo. Faça com que a classe Aula implemente essa interface e execute a classe TestaListaDeAula para verificar se a ordenação funcionou.
	}
}
