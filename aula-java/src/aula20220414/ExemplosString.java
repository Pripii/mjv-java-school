package aula20220414;

public class ExemplosString {
	 public static void main(String[] args)
	    {
		        // criar um objeto StringBuilder
		        // com um String pass como parâmetro
		        StringBuilder str = new StringBuilder("Sociedade Geek");
		  
		        // imprimir string
		        System.out.println("String = " + str.toString());
		  
		        // obter o comprimento do objeto StringBuilder
		        int length = str.length();
		  
		        // imprimir o comprimento
		        System.out.println("length of String = " + length);
		    }
		}