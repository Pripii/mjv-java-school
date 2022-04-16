package aula20220414;

public class DescricaoString {
	/* String
	 * String
	 String: 
		1) Definição: A classe String representa cadeias de caracteres e são constantes (seus valores não podem ser alterados depois de criados)
		Não utilizamos o operador new porque ao fazê-lo forçamos a criação de uma nova String, anulando um recurso de otimização da linguagem que evita que o mesmo texto exista mais de uma vez na memória (mais recursos sejam utilizados do que o necessário). Na pratica: se estiver dentro de um loop por ex repetido por mil vezes, mil objetos serão criados. 
			String texto = new String("Qualquer texto entre aspas é uma String");
		Agora numa instanciação correta como abaixo, apenas um objeto será criado na primeira repetição e reutilizado em todas as demais. Todos os seus literais, como "abc", são implementados como instâncias dessa classe e podem ser compartilhados:  
			String str = "abc";   
			é equivalente a:  
			char dados[] = {'a', 'b', 'c'}; 
			String str = new String(dados);
		2) Alternativas de instanciação de objetos com construtor:
		String(byte[] bytes) -> Constrói uma nova String decodificando a matriz de bytes, usando o conjunto de caracteres padrão da plataforma
		String(byte[] bytes, Charset charset) -> Constrói uma nova String decodificando o array de bytes, usando o charset especificado
		String(char[] value) -> Aloca uma nova String para que ela represente a sequência de caracteres atualmente contida no argumento da matriz de caracteres
		String(StringBuffer buffer) -> Aloca uma nova string que contém a sequência de caracteres atualmente contida no argumento de buffer de string
		String(StringBuilder builder) -> Aloca uma nova cadeia que contém a sequência de caracteres atualmente contida no argumento do construtor de cadeia
		3) Métodos destacando o seu contrato (tipo retorno + nome + parâmetros):
		a) public String concat(String str) 
			"cares".concat("s") returns "caress"
			 "to".concat("get").concat("her") returns "together"
			Parâmetros: str, uma string que é concatenada ao final desta String
			Tipo de retorno: String, que representa a concatenação dos caracteres deste objeto seguidos pelos caracteres do 	argumento string
		b) public String replace(char oldChar, char newChar)
			"mesquite in your cellar".replace('e', 'o')
		         	 returns "mosquito in your collar"
			Parâmetros: oldChar - o antigo caractere
				        newChar - um novo caractere
			Tipo de retorno: String, derivada dessa string substituindo cada ocorrência de oldChar por newChar.
		c) public String substring(int beginIndex, int endIndex)
			"hamburger".substring(4, 8) returns "urge"
		 	"smiles".substring(1, 5) returns "mile"
			Parâmetros: o indice inicial beginIndex, inclusive
				         o indice final endIndex, excludente
			Tipo de retorno: String, que é uma substring desta String
		d) public String toString()
			Parâmetros: não há 
			Tipo de retorno: a própria String é retornada
			Override: 
		e) public boolean equals(Object anObject)	

			Parâmetros: anObject um objeto que é comparado com a String
			Tipo de retorno: true, se e somente se o argumento não for nulo e for um objeto String que representa a mesma 	sequência de caracteres desse objeto; false caso contrário
			Override: 
		f) public int hashCode()
			Parâmetros: não há
			Tipo de retorno: um valor de código hash para este objeto
			Override: 
			
			*/
}
