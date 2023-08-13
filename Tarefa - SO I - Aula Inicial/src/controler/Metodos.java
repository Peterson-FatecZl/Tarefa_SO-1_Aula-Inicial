package controler;

public class Metodos {

	public Metodos() {
		// TODO Auto-generated constructor stub
		super();
	}
	public void calcularTempoDePercorrerVetor(int[] vetor) {
		double tempoInicial = System.nanoTime();
		for (int ctd = 0; ctd < vetor.length; ctd++) {
			//Só percorre o vetor
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal_em_Segundos = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.printf("O tempo total para percorrer o vetor de "+vetor.length+
						   " posições foi de: "+tempoTotal_em_Segundos+" segundos.\n");
		;
	}

}
