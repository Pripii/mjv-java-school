package controlefluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

//Declarações de ramificação: break, continue e return.
public class ControleFluxoRepeticao {
	public static void main(String[] args) {
		exemploBreakContinue();
		exemploWhile(); // while - testa a condição antes de executar o códicgo.
		exemploDoWhile(); //do while - executa ao menos uma vez.
	}

	static void exemploBreakContinue() {
		for (int x = 1; x <= 5; x++) {
			if (x == 3)
				// break; //A instrução break serve para encerrar um for, while, ou do-while de
				// um loop.
				continue; // A instrução continue pula a iteração atual de um loop for, while ou do-while.
			// return;
			/*
			 * A instrução return sai do método atual e o fluxo de controle retorna para
			 * onde o método foi invocado. O tipo de dados do valor retornado deve
			 * corresponder ao tipo do valor de retorno declarado do método. Quando um
			 * método é declarado void, use a forma de returnque não retorna um valor.
			 */
			System.out.println(x);
		}
	}
	
	static void exemploWhile() {
		double mesada = 100.0;
		while(mesada > 0) {
			Double valorCartaMagic = valorAleatorio();
			if (valorCartaMagic > mesada)
				valorCartaMagic = mesada;
				
				System.out.println("Carta do valor: " + valorCartaMagic + "adicionado no carrinho");
				mesada = mesada - valorCartaMagic;
		}
		System.out.println("Mesada: " + mesada);
		System.out.println("Saulo gastou toda a sua mesada em Cartas de Magic");
		}
	

	static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(1, 50); //retorna um valor duplo pseudoaleatório entre (x, y).
	}
	
	static void exemploDoWhile() {
		System.out.println("Discando");
		
		do {
			//executando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		}while(tocando());
		
		System.out.println("Alô!!!");
	}
	private static boolean tocando() {
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu?" + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
