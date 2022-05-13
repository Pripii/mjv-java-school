package explorando.collection;
import java.util.ArrayList;
import java.util.Collections;

public class ExplorandoLista {
	/* A implementação ArrayList.
	 * O pacote java.util.
	 * Métodos de manipulação do ArrayList.
	 * ForEach do Java 8.
	 */
	public static void main(String[] args) {
		//criar sequencia de aulas/cursos (collections) que o instituto tem
			String aula1 = "conhecendo mais de listas";
			String aula2 = "Modelando a classe Aula";
			String aula3 = "Trabalhando com cursos e sets";
		
			//o arraylist respeita a ordem com que vc vai add
			ArrayList<String> aulas = new ArrayList<>();
			aulas.add(aula1);
			aulas.add(aula2);
			aulas.add(aula3);
			
			System.out.println(aulas);
			
			//remove a aula (index-remove pela posição|boolean-remove a q vc indicar)
			aulas.remove(0);
			
			System.out.println(aulas);
			
			//para cada string aula dentro de aulas, faça o seguinte...
			for (String aula : aulas) {
				System.out.println("Aula: " + aula);
			}
			
			//"me de a primeira aula"
			String primeiraAula = aulas.get(0);
			System.out.println("A primeira aula é: " +primeiraAula);
			
			//size - saber quantos elementos temos nessa lista.
			for (int i = 0; i < aulas.size(); i++) {
				System.out.println("aula: " + aulas.get(i));
			}
			
			//método foreach - performa uma ação para cada elemento dentro
			aulas.forEach(aula -> {System.out.println("percorrendo: " + aula);}); //para cada aula dentro de aulas faça...
	
			//add mais aulas
			aulas.add("Aumentando nosso conhecimento");
			System.out.println(aulas);
			//ordena na ordem alfabética
			Collections.sort(aulas);
			System.out.println(aulas);
	}
}
