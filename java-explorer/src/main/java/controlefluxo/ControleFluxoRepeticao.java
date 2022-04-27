package controlefluxo;
	//Declarações de ramificação: break, continue e return.
public class ControleFluxoRepeticao {
	public static void main(String[] args) {
		exemploBreakContinue();
	}
	static void exemploBreakContinue() {
		for(int x=1; x<=5; x++) {
			if(x==3)
				//break;  //A instrução break serve para encerrar um for, while, ou do-while de um loop.
				continue; //A instrução continue pula a iteração atual de um loop for, while ou do-while.
				//return; 
			              /*A instrução return sai do método atual e o fluxo de controle retorna para onde o método foi invocado.
			               * O tipo de dados do valor retornado deve corresponder ao tipo do valor de retorno declarado do método. 
			               * Quando um método é declarado void, use a forma de returnque não retorna um valor.
			               */
			System.out.println(x);
		}
	}
	
}


