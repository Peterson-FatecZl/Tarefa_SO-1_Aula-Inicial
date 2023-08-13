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
		
		preencheVetor(vetor_Mil);
		preencheVetor(vetor_DezMil);
		preencheVetor(vetor_CemMil);
		
		metodos.calcularTempoDePercorrerVetor(vetor_Mil);
		metodos.calcularTempoDePercorrerVetor(vetor_DezMil);
		metodos.calcularTempoDePercorrerVetor(vetor_CemMil);
	}

	static int[] preencheVetor(int[] VT){
		for(int index: VT) {
		VT[index] = 0;
		}
		return VT;
	}
}
