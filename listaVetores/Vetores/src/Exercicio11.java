import java.util.*;
public class Exercicio11 {
	public static void main(String [] args) {
		Scanner ler =  new Scanner(System.in);
		int a[]= new int[10];
		int n;
		
		System.out.println("D�gite os valores do vetor A");
		for(int i=0; i<10; i++) {
			a[i] = ler.nextInt();
		}
		
		System.out.println("D�gite o n�mero escolhido:");
		n = ler.nextInt();
		
			for(int i=0; i<10; i++) {
				if(a[i] == n ) {
					System.out.println("O n�mero escolhido est� armazenado no vetor A!");
					break;
				}
				
			}
			
			System.out.println("");
			System.out.println("Caso n�o tenha aparecido resultado, seu n�mero n�o esta armazenado.");
		
		
		
	}
}