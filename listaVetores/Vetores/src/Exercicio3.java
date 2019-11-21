import java.util.*;
public class Exercicio3 {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int i=0,i1=0;
		int r,l=0;
		int v1[]=new int [8];
		for (i = 0; i <=5; i++) {
			System.out.printf("digite  %d° numero:",i+1);
			v1[i]=ler.nextInt();
		
		for (i1 = 1,l=0;i1 <= 10; i1++) {
			r=v1[i]%i1;
			
			if  (r== 0){
			l++;
			}
		}
			if  (l<=2){
				System.out.println("O numero é primo");
			}
			else{

			System.out.println("O numero não é primo");
	}
}

	}
}
