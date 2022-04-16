package aula20220414;

public class ExemplosString {
	 public static void main(String[] args)
	    {
	        // determinado array de strings
	        String str[] = {"George","Sally","Fred"};
	             
	        // Usando a classe StringJoiner
	             
	        // inicializando a instância StringJoiner com delimitador, prefixo e sufixo necessários
	        StringJoiner sj = new StringJoiner(":", "[", "]");
	             
	        // concatenar strings
	        sj.add("George").add("Sally").add("Fred");
	             
	        // convertendo StringJoiner para String
	        String desiredString = sj.toString();
	             
	        System.out.println(desiredString);
	             
	        // Usando a classe StringBuilder
	             
	        // declarando construtor de strings vazio
	        StringBuilder sb = new StringBuilder();
	             
	        // anexando prefixo
	        sb.append("[");
	             
	        // verificando matriz de string vazia
	        if(str.length>0)
	        {
	            // anexando o primeiro elemento
	            sb.append(str[0]);
	                 
	            // iterando através da matriz de strings e anexando o delimitador necessário
	            for (int i = 1; i < str.length; i++)
	            {
	                sb.append(":").append(str[i]);
	            }
	        }
	             
	        // finalmente anexando o sufixo
	        sb.append("]");
	             
	        // convertendo StringBuilder para String
	        String desiredString1 = sb.toString();
	             
	        System.out.println(desiredString1);
	    }
	}
}
