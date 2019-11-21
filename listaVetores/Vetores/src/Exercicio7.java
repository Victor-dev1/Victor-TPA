import java.util.*;
public class Exercicio7 {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int i,
		 v1[]= new int [15],
		 v2[]= new int [15],
		  f;
		for(i=0;i<=14;i++) {
			System.out.println("Digite o valor :");
			v1[i]=ler.nextInt();
			v2[i]=v1[i];
			f=1;
			for(f = 1;f <= v1[i]; f++){
	                v2[i] = (v2[i] * f);
	            }
	          }  
	          i=0;
	          while(i<15) {
	            System.out.println("!" + v1[i]+ " = " + v2[i]);
	            i++;
	            }
		
}
}


