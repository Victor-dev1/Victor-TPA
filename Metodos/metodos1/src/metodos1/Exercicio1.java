package metodos1;

import java.util.*;
public class Exercicio1{
	public static void main (String[]args) {
		int escolha=0,resultado=0;
		menu(escolha);
	}//fim main
	public static void menu (int escolha){
		int resultado = 0,n = 0;
		Scanner ler =new Scanner(System.in) ;
		System.out.println("Escolha a opção:");
		System.out.println("1-Fatorial");
		System.out.println("2-Tabuada");
		System.out.println("3- Anos para se aposentar");
		System.out.println("4- Potencia");
		System.out.println("5- triangulo");
		escolha=ler.nextInt();
		switch(escolha) {
		case 1:
			System.out.println(fatorial(n));
		case 2:
			System.out.println(tabuada(n));
		case 3 :
		System.out.println(Anos(resultado));
		case 4:
			System.out.println(potencia(n));
		case 5:
			triangulo(n);
		}
	}//FIM menu
	public static int fatorial (int n ) {
		Scanner ler =new Scanner(System.in) ;
		int voltar,escolha = 0;
		System.out.println ("Qual o numero que deseja?");
		n=ler.nextInt();
		for(int i=n-1; i>=1; i--) {
			n = n*i;
		}
		System.out.println(n);
		System.out.printf("\n Deseja retornar ao menu?\n 1-sim \n 2-não\n");
		voltar =ler.nextInt();
		switch (voltar) {
		case 1:
			System.out.printf("\n");
			menu(escolha);
			break;
		case 2:
			System.out.println("Fim");
			break;
		}
		return n;
	}//FIM FATORIAL
	
	
	
	
	
	
	
	
	
	public static int tabuada (int n) {
		Scanner ler =new Scanner(System.in) ;
			int r=0,voltar,escolha = 0;
			System.out.println("Qual o numero desejado?");
			n=ler.nextInt();
			for(int i=1 ;i<=10;i++) {
				r=i*n;
				System.out.println(i+"*"+n+"="+ r);
			}
			System.out.printf("\n Deseja retornar ao menu?\n 1-sim \n 2-não\n");
			voltar =ler.nextInt();
			switch (voltar) {
			case 1:
				System.out.printf("\n");
				menu(escolha);
				break;
			case 2:
				System.out.println("Fim");
				break;
			}
			return r;
		}//fim tabuada
		
	
	
	
	
	
	
	public static int Anos (int sexo) {
			Scanner ler =new Scanner(System.in) ;
			int idade,anosfalta,voltar,escolha=0;
			System.out.printf("Qual o seu sexo?\n 1-Mulher \n 2-Homem");
			sexo=ler.nextInt();
			switch (sexo) {
			case 1:
				System.out.println("Quantos anos vc tem ?");
				idade=ler.nextInt();
				if (idade<=60) {
					anosfalta=60-idade;
					System.out.println("Faltam "+anosfalta+" Para se aposentar");
				}
				else if (idade>60) {
					System.out.println("Já pode se aposentar");
				}break;
				
			case 2:
				
				System.out.println("Quantos anos vc tem ?");
				idade=ler.nextInt();
				if (idade<=65) {
					anosfalta=65-idade;
					System.out.println("Faltam "+anosfalta+" Para se aposentar");
				}
				else if (idade>65) {
					System.out.println("Já pode se aposentar");
				}
				break;
				
			}
			System.out.printf("\n Deseja retornar ao menu?\n 1-sim \n 2-não");
			voltar =ler.nextInt();
			switch (voltar) {
			case 1:
				menu(escolha);
				break;
			case 2:
				System.out.println("Fim");
				break;
			}
		return sexo;

}//fim anos
		
		
		
		public static int potencia (int n) {
			Scanner ler =new Scanner(System.in) ;
			int ajuda = 1,expoente,base,escolha=0,voltar;
			System.out.println ("Qual o valor da base?");
			base=ler.nextInt();
			System.out.println ("Qual o valor do expoente?");
			expoente=ler.nextInt();

			for(int i=0; i<expoente; i++) {

				ajuda = ajuda*base;


			}System.out.printf(ajuda+"\n");
			System.out.printf("\n Deseja retornar ao menu?\n 1-sim \n 2-não");
			voltar =ler.nextInt();
			switch (voltar) {
			case 1:
				menu(escolha);
				break;
			case 2:
				System.out.println("Fim");
				break;
			}
			return n;
		}//fim potencia
		
		
		
		
		
		
		
		
		
		
		public static void triangulo (int n) {
			Scanner ler =new Scanner(System.in) ;
			int m[][]=new int [5][5];
			int lin,col,escolha=0, voltar ;
			for(lin=0; lin<=4;lin++) {
				for(col=0; col<=4; col++) {
					m[0][0]=1;
					m[1][0]=1;
					m[2][0]=1;
					m[3][0]=1;
					m[1][1]=1;
					m[2][1]=1;
					m[2][2]=1;
					m[3][1]=1;
					m[4][0]=1;
					
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
			System.out.printf("\n Deseja retornar ao menu?\n 1-sim \n 2-não");
			voltar =ler.nextInt();
			switch (voltar) {
			case 1:
				menu(escolha);
				break;
			case 2:
				System.out.println("Fim");
				break;
			}
		}
}