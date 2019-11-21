[7:13 PM, 20/11/2019] Vic Amor Da Minha Vida ❤️❤️❤️❤️❤️❤️❤️: import java.util.*;
public class Exercicio9 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int p=10, r;
		int a[] = new int[p];
		int b[] =new int[p];
		int c[]=new int[p];
		
		System.out.println("Digite os valores de A");
		for(int i=0; i<p; i++) {
			a[i]=ler.nextInt();
		}
		
		System.out.println("Digite os valores de B");
		for(int i=0; i<p; i++) {
			b[i]=ler.nextInt();
		}
		
	
		for(int i=0; i<p; i++) {
			for(int j=0; j<p; j++) {
				if(a[i] == b[j]) {
					
					c[i]=a[i];
					
				}
			}
		}
		
		System.out.println("O conjunto intersecção de A e B é: ");
		for(int i=0; i<p; i++) {
			
			System.out.println(c[i]);
			
		}
		
			
		
		
		
		
		
		
		
		
	}

}