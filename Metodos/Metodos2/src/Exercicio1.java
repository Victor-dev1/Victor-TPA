
import  java.util.*;
public class Exercicio1 {
	public static void main (String[]args) {
		Scanner ler = new Scanner (System.in);
		int b,e,x;
		System.out.println ("Qual o valor da base?");
		b=ler.nextInt();
		System.out.println(potencia(b));

		
	}
	public static double potencia (int b) {
		double r= 0;
		r=Math.pow(b,4);
		return r;
	}

}
