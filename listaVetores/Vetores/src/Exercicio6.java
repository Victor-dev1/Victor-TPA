import java.util.*;
public class Exercicio6 {
	public static void main (String[]args) {
		Scanner ler =new Scanner (System.in);
		int i=0,v1[]=new int [11],i1=0;
		for (i=0;i<=10;i++) {
			
			v1[i]=2;
		
			for (i1=0;i1<i;i1++) {
				v1[i]=v1[i]*2;
			}
				System.out.println("a["+(i+1)+"]-"+v1[i]);
			
			
			}
}
}