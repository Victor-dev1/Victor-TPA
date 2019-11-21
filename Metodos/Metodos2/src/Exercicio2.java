import java.util.*;
public class Exercicio2 {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int n,c,resultado = 0,numero=0;
		System.out.println("Qual o numero que você escolhe?");
		n=ler.nextInt();
		System.out.println(tabuada(n));
	
		
	
	}//fim main
public static int tabuada(int n) {
	int r=0;
	for(int i=1 ;i<=10;i++) {
		r=i*n;
		System.out.println(i+"*"+n+"="+ r);
	}
	
	return r;
}
}//fim