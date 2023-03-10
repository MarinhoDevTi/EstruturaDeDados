package estruturaDeDados;

public class Main {

	public static void main(String[] args) {
		/* Primeira implementaçãoi de um vetor
		
		int vetor[]; // declaração do vetor
		
		vetor = new int[10]; // alocação de 10 posições no vetor*/
		
		int [] vetor = new int[10]; // combinação
		
		double [] salarios = new double[10];
		
		String [] meses = new String[10];
		
		int tamanho = 10; // tamanho do vetor
		int [] v = new int [tamanho];
		
		int i; // indice
		
		for (i = 0; i < tamanho; i++) {
			v[i] = i;
			System.out.println("v[" + i + "]" + " = " +v[i]); 
		}
		
		
		
		

	}

}
