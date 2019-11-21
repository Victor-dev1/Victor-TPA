import java.util.*;
public class Exercicio5 {
	public static void main (String[]args) {
		Scanner ler =new Scanner (System.in);
		int i=0,vdig[]=new int [4],i1;
		for (i=0;1<=4;i++) {
			System.out.println("Digite o numero:");
			vdig[i]=ler.nextInt();
			for (i1=1;i1<=vdig[i];i1++) {
				if(vdig[i]%i1==0) {
				System.out.println(i1+" ");
				}
			}
		}
		
	}
}
