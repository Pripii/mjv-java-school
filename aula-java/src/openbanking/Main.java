package openbanking;

public class Main {
public static void main(String[] args) {
	Movimentacao movimentacao = new Movimentacao(LocalDate.now(), 1700.90, TipoMovimentacao.RECEITA, false);
	Cliente priscilla = new Cliente("Priscilla Aniboleti", "123456789", movimentacao);
	
	/* OU pode-se criar o objeto movimentacao dentro do objeto cliente
	 * Cliente Priscilla = new Cliente("Priscilla Aniboleti", "123456789", new Movimentacao(LocalDate.now(), 1700.90, ...
	 */
}
}
