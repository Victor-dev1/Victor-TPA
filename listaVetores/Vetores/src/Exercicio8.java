import java.util.*;
public class Exercicio8 {
	public static void main (String[]Args) {
		Scanner ler= new Scanner (System.in);
		int v1[]={1,2,3,4,5,6,7,8,9,10};
		 int v2[]=new int [10];
		 int i,p,soma=0;
		 System.out.println("n(");
		 for(p=0,i=0;p<10;i++,p++) {
			 soma=soma+v1[i];
			 v2[p]=soma;
			 System.out.println(v2[p]+" ");
		 }System.out.println(")");
	}
}