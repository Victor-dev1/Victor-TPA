import java.util.*;
public class Exercicio3 {
	public static void main (String[]args) {
		int m[][]=new int [5][5];
		int lin,col ;
		for(lin=0; lin<=4;lin++) {
			for(col=0; col<=4; col++) {
				m[0][0]=1;
				m[1][1]=1;
				m[2][2]=1;
				m[3][3]=1;
				m[4][4]=1;
				
		}
		}
		
		for(lin=0; lin<=4;lin++) {
			for(col=0; col<=4; col++) {
				System.out.printf("[ "+m[lin][col]+" ]");
				if(col==4) {
					System.out.print("\n");
				}
			}
		}