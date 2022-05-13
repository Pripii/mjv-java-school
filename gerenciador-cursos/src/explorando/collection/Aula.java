package explorando.collection;

public class Aula implements Comparable<Aula> {

		private String titulo;
		private int tempo;
		
		public Aula(String titulo, int tempo) {
			this.titulo = titulo;
			this.tempo = tempo;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public int getTempo() {
			return tempo;
		}
		
		//reescrever o método toString da classe Aula, para que ele retorne algo significativo
		@Override
		public String toString() {
		return "[Aula: " + this.titulo + ", " + this.tempo + "minutos]";
		}
		
		//comparar dois titulos e retornar
		@Override
		public int compareTo(Aula outraAula) {
			return this.titulo.compareTo(outraAula.titulo);
			
		}
}
