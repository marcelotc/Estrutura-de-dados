
public class Conversor {
	public static void main(String[] args) {
		int numero = 172;
		Pilha p = new Pilha();
		
		int resto;
		
		// fase 1: empilhamento dos restos
		while (numero != 0 ){
			resto = numero % 2; // pego o resto da divisão deste númeor por 2 (vale o ou 1)
			p.push(resto); //armazeno na pilha 
			numero = numero /2; // gero um novo número, resultado da divisão dele por 2
		}
		
		//fase 2: exibição dos restos
		while(!p.isEmpty()){
			resto = p.pop();	//remove da pilha (sempre o cara que esta no topo)
			System.out.println(resto);
		}
		
		System.out.println("Fim do Programa");
	}

} 

// teste
