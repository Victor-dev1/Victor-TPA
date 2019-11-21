import java.util.*;
public class Exercicio2 {
	public static void main (String[]args) {
		Random ram= new Random();
		int lin,col,lmaior,lmenor,maior,menor=0,colmaior,colmenor;
		int m[][]= new int [3][3];
		for(lin=0; lin<3;lin++) {
			for(col=0; col<3; col++) {
					m[lin][col]=ram.nextInt(70);
		}	
		}
		maior=0;
		menor= 70;
		lmenor=0;
		lmaior=0;
		colmaior=0;
		colmenor=0;
		for(lin=0; lin<3;lin++) {
			for(col=0; col<3; col++) {
				if (m[lin][col]>maior ) {
					maior =m[lin][col];
					lmaior=lin;
					colmaior= col;
				}
				else if (m[lin][col]<= menor ) {
					menor =m[lin][col];
					lmenor=lin;
					colmenor= col;
				}
		}	
		}
		System.out.println("o maior numero é "+ maior+ " na posição ["+(lmaior+1) + "] [" + (colmaior+1) +"]");
		System.out.println("o menor numero é "+ menor+ " na posição ["+(lmenor+1) + " ] [" + (colmenor+1) +"]");
		for(lin=0; lin<3;lin++) {
			for(col=0; col<3; col++) {
				System.out.printf("[ "+m[lin][col]+" ]");
				if(col==2) {
					System.out.printf("\n");
				}
			}
	}
}
}