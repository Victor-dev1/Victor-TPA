
import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
	
	public static void main(String [] args){
		Scanner ler = new Scanner(System.in);
		
		int m[][] = new int [3][4];
		int i, j, r;
		
		System.out.println("Digite os valores da matriz:");
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				m[i][j]=ler.nextInt();
				m[i][3]=0;
			}
		}
		
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++) {
				System.out.print("["+m[i][j]+"]");
				if(j==2) {
					m[i][3]=m[i][0]+m[i][1]+m[i][2];
					System.out.print("["+m[i][3]+"]");
					System.out.print("\n");
				}
			}
		}
		
		
		
	}//fim main

}//fim class