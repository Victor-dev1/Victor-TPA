import java.util.*;
public class Exercicio1 {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int m[][]=new int[4][4];
		int lin,col,n=1;
		for(lin=0; lin<=3;lin++) {
			for(col=0; col<=3; col++) {
				n=n*2;
				m[lin][col]=n;
				
				
		}
			
		}
		
		for(lin=0; lin<=3;lin++) {
			for(col=0; col<=3; col++) {
				System.out.printf("[ "+m[lin][col]+" ]");
				if(col==3) {
					System.out.printf("\n");
				}
			}
		}
	}
}