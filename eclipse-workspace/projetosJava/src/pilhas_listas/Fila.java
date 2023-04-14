package pilhas_listas;

public class Fila {
	
	public class fila {
		private int tamanhoMax;
		private int[] filaArray;
		private int inicio;
		private int fim;
		private int tamanho;
		
		// ENFILEIRAR
		public void enqueue(int elemento) {
			if (tamanho == tamanhoMax) {
				System.out.println("A fila está cheia!");
				
			} else {
				if (fim == tamanhoMax -1) {
					fim = -1;
				}
				fim ++;
				filaArray[fim] = elemento;
				tamanho++;
			}
		}
		
		// DESENFILERAR
		
		// ESTÁ VAZIA
		public boolean isEmpty(){
			return (tamanho == 0);
		}
		
		// ESTÁ CHEIA
		public boolean isFull() {
			return (tamanho == tamanhoMax -1);
		}
		
		// FIM DA FILA
		public int peek() {
			if(tamanho == 0) {
				System.out.println("A fila está vazia!");
				return -1;
			} else {
				return filaArray[inicio];
			}
		}
		
	}	
	
	// CONSTRUTOR
	public Fila(int tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
		this.filaArray = new int[tamanhoMax];
	}

}
