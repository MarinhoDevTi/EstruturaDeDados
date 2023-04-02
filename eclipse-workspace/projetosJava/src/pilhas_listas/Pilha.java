package pilhas_listas;

public class Pilha {
	private int tamanhoMax;
	private int[] pilhaArray;
	private int topo;
	
	public Pilha(int tamanhoMax){
		// Construtor
		this.tamanhoMax = tamanhoMax;
		this.pilhaArray = new int[tamanhoMax];
		this.topo = -1;
	}
	
	public void push(int elemento) {
		// Acrescenta mais na pilha
		if (topo == tamanhoMax - 1) {
			System.out.println("A pilha está cheia!!");
		} else {
			topo++;
			pilhaArray[topo] = elemento;
		}
	}
	
	public int pop() {
		// Remove o último da pilha
		if (topo == -1) {
			System.out.println("A pilha está vazia!!");
			return - 1;
		} else {
			int elemento = pilhaArray[topo];
			topo --;
			return elemento;
		}
	}
	
	public int peek() {
		// Verificar o topo da pilha
		if (topo == -1) {
			System.out.println("Pilha está vazia!!");
			return -1;
		} else {
			return pilhaArray[topo];
		}
	}
	
	public boolean isEmpty() {
		// Verificar se a pilha está vazia
		return(topo == -1);
	}
	
	public boolean isFull() {
		// Verificar se a pilha está cheia
		return(topo == tamanhoMax - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha pilhinha = new Pilha(5);
		
		System.out.println("A pilha está vazia? " + pilhinha.isEmpty());
		System.out.println("A pilha está cheia? " + pilhinha.isFull());
		
		pilhinha.push(20);
		pilhinha.push(40);
		
		System.out.println(pilhinha.peek());
		
		pilhinha.push(60);
		
		System.out.println("Valor removido: " + pilhinha.pop());
		System.out.println("Valor removido: " + pilhinha.pop());
		System.out.println("Valor removido: " + pilhinha.pop());
		System.out.println("Teste01");

	}

}
