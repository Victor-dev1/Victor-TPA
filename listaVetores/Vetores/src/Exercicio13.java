import java.util.*;
public class Exercicio13 {
	public static void main (String []args) {
		Scanner ler= new Scanner (System.in);
		 int va[]=new int[10];
		 int vb[]=new int [10];
		 int i,j,b=0;
		 
		 System.out.println("Digite os valores do vetor A");
		 for(i=0; i<10; i++) {
			 va[i] = ler.nextInt();
		 }
		 
		 for(i=0; i<10; i++) {
			 
			 if(va[i]%2==0) {
				 vb[i]=1;
			 }else if(vb[i]%2==1) {
				 vb[i]=0;
			 }
			 
		 }
		 
		 System.out.println("O resultado é: ");
		 for(i=0; i<10; i++) {
			 System.out.println(vb[i]);
		 }
		 
		 
		 
	}//fim main
}//fim class
