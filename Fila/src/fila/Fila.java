package fila;

public class Fila {
	public static void main(String[] args) {
		Fila f = new Fila();
		int e;  
		
		f.inserir(11);
		f.inserir(21);
		f.inserir(34);
		f.inserir(42);
		
		System.out.println("");
		while(!f.isEmpty()){
			e = f.retirar();
			System.out.println("retirado: " + e);
		}
		//teste
	}
		private int [] valores;
		private int inicio;
		private int fim;
		private int total;
		
		public Fila() {
			valores = new int[10];
			inicio = 0;
			fim = 0;
			total = 0;
		}
		
		public void inserir(int elemento){
			if(isFull()){
				throw new RuntimeException("Fila Cheia");
			}
			valores[fim] = elemento;
			//o resto da divisão sempre vai dar valores de 0 a tamanho - 1
			fim = (fim + 1) % 10;
			total++;
		}
		
		public int retirar(){
			if(isEmpty()){
				throw new RuntimeException("Fila vazia");
			}
			int elemento = valores[inicio];
			inicio = (inicio + 1) % 10;
			total--;
			return elemento;
		}
		
		public boolean isEmpty(){
			return (total == 0);
		}
		
		public boolean isFull(){
			return (total == 10);
		}

}
