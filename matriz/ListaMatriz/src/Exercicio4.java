import java.util.*;
public class Exercicio4 { 
	public static void main(String [] args){ 
		Scanner ler=new Scanner(System.in); 
		int ct=0, ca=0, n, i, j; 
		int v[][]= new int [4][4]; 
		Random x=new Random(); 
		int res=0; 
		System.out.println("Sua cartela:"); 
		System.out.println();  
		for(i=0; i<4; i++){ 
			for(j=0; j<4; j++){
				v[i][j]=1+ x.nextInt(75);
				System.out.print("["+v[i][j]+"]"); 
				if(j==3) { 
					System.out.println (); 
					} 
			}
		}
				System.out.println(); 
				do { 
				System.out.println("Digite o número a ser cantado"); 
				n=ler.nextInt(); 
				for(i=0; i<4; i++) {
					for( j=0; j<4; j++){
						if(n== v[i][j]){ 
							res =1; 
						}
					}
				}
							if(res == 1){ 
								System.out.println("O numero está na tabela!!") ;
								ca++;
							}
								else { 
									System.out.println("O número não está na cartela"); 
								}
								res=0; 
								ct++;
								}while(ca != 16);
								System.out.println("BINGO"); 
								System.out.println("Você levou"+ct+" tentativas para fazer o bingo.");
								}
							}
					