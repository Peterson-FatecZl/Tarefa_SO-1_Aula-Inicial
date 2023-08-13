package view;
import controler.Metodos;

/*1.Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
 *posições inteiras (Preencher todas as posições com valor 0) e gere o
 *tempo gasto para percorrer o vetor. Repetir para 10000 e 100000 posições.
 *Responder com o tempo (em nS ou S) de cada operação.*/
public class Principal {

	public static void main(String[] args) {
		Metodos metodos = new Metodos();
		int[] vetor_Mil = new int[1000];
		int[] vetor_DezMil = new int[10000];
		int[] vetor_CemMil = new int[100000];
		
		
		double tempoInicial = System.nanoTime();
		metodos.preencherVetor(vetor_Mil);
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		
		double tempoInicial_2 = System.nanoTime();
		metodos.preencherVetor(vetor_DezMil);
		double tempoFinal_2 = System.nanoTime();
		double tempoTotal_2 = tempoFinal_2 - tempoInicial_2;
		
		double tempoInicial_3 = System.nanoTime();
		metodos.preencherVetor(vetor_CemMil);
		double tempoFinal_3 = System.nanoTime();
		double tempoTotal_3 = tempoFinal_3 - tempoInicial_3;
		
		
		System.out.println("Tempo Total Do Vetor Com 1.000 Posições: "+tempoTotal+" Nanosegundos");
		System.out.println("Tempo Total Do Vetor Com 10.000 Posições: "+tempoTotal_2+" Nanosegundos");
		System.out.println("Tempo Total Do Vetor Com 100.000 Posições: "+tempoTotal_3+" Nanosegundos");
	}

}
