import java.util.*;
public class Exercicio12 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int v[] = new int[10]; 
		int v2[]= new int[10];
		
		System.out.println("Digite os valores do vetor:");
		for(int i=0; i<10; i++) {
			v[i] = ler.nextInt();
			
		}
		
	
		
		for(int i=0; i<10; i++) {
			for(int j=9; j>=0; j--) {
				v2[j]=v[i];
				break;
			}
			
		}
		
		
		
		
		for(int i=0; i<10; i++) {
			if(v[i] == v2[i]) {
				System.out.println("É um palíndromo!");
				break;
			}else {
				System.out.println("Não é palíndromo");
				break;
			}
		}

	}
}