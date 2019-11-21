import java.util.*;
public class Exercicio14 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int va[] = new int[10];
		int vb[] = new int[10];
		int vc[] = new int[10];
		int i;
		
		System.out.println("Digite os valores de A");
		for(i=0; i<10; i++) {
			va[i] = ler.nextInt();
		}
		
		System.out.println("Digite os valores de B");
		for(i=0; i<10; i++) {
			vb[i] = ler.nextInt();
		}
		
		for(i=0; i<10; i++) {
			if(va[i]>vb[i]) {
				vc[i]=1;
			}else if(va[i]==vb[i]) {
				vc[i]=0;
			}else if(va[i]<vb[i]) {
				vc[i]=-1;
			}
		}
		
		System.out.println("O resultado é: ");
		for(i=0; i<10; i++) {
			System.out.println(vc[i]);
		}
		
		
	}//fim main

}//fim class
