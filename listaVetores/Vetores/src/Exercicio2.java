import java.util.*;
public class Exercicio2 {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int i=0;
		int vA[]= new int [5];
		int r;
		int i2=0;
		 for(i=0;i<=5;i++) {
			System.out.printf("\nDigite o %d valor",i+1);
			vA[i]=ler.nextInt();
			for(i2=0;i2<=10;i2++) {
				r=vA[i]*i2;
			System.out.printf(r+" \n");
		 }
			
			
		
		 }
	}
}
