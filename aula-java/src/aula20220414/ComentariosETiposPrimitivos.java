package aula20220414;

public class ComentariosETiposPrimitivos {
	//Este é um comentário de uma linha
	
	/*
	 * Nos comentários de muitas linhas,
	 * podemos escrever o quanto quiser
	 * até indicarmos o final do comentário
	 */
	
	/**
	 * Comentário referente à documentação, quem foi o autor, versão...etc
	 */
	
	//DECLARANDO VARIÁVEIS:
	
	//1)Pode-se fazer a declaração junto com a atribuição (variável)
		int idade = 33;
		float sal = 1825.40f; //Tem que colocar o "f" no final para indicar que é um float
		char letra = "P";
		boolean casado = false;
		
	//2)Typecast (variável)
		int idade = (int) 33;
		float sal = (float) 1825.40;
		char letra = (char) "P";
		boolean casado = (boolean) false
		
	//3)wrapper Class (Objeto) - SEMPRE que utilizar a palavra "new" dentro de uma declaraçãp, automaticamente estarei criando um objeto, então tenho que ter uma classe referenciando ele
		Integer idade = new Integer(33)
		Float sal = new Float(1825.40);
		Character letra = new Character("P");
		Boolean casado = new Boolean(false);
		
	/* FAMILIA  - TIPO PRIMITIVO - WRAPPER CLASS - TAMANHO     
	 * LÓGICO   -    boolean     -     Boolean   -  1 bit      
	 * LITERAIS -     char       -    Character  - 1 byte      
	 *          -      -         -     String    - 1 byte/cada 
	 * INTEIROS -     byte       -      Byte     - 1 byte      
	 *          -    short       -      Short    - 2 bytes     
	 *          -     int        -     Integer   - 4 bytes     
	 *          -    long        -      Long     - 8 bytes     
	 * REAIS    -    float       -      Float    - 4 bytes     
	 *          -    double      -     Double    - 8 bytes     
	 */
}
