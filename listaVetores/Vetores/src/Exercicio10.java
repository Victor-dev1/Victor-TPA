import java.util.Scanner;
public class Exercicio10 {
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
			
				if(a[i] != b[i]) {
					
					c[i]=a[i];
					
				}
			
		}
		
		System.out.println("O conjunto intersecção de A e B é: ");
		for(int i=0; i<p; i++) {
			
			System.out.println(c[i]);
			
		}
		
			
	}

}