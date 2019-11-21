import java.util.*;
public class Exercicio01 {
	public static void main(String[]args) {
		Scanner ler =new Scanner (System.in);
	int n=0,i=0,ni=0;
		int vetDigitado[]= new int [20];
		int B[]= new int [20];
		
		for(i=0;i<=4;i++){
            System.out.printf("\nDigite o %d.o numero: ", i+1);
            vetDigitado[i]=ler.nextInt();
          
	}
		for (i=0;i<=4;i++) {
			if(vetDigitado[i]%2==0) {
			B[i]=vetDigitado[i];
			System.out.println(B[i]+" ");
			}
		}
			for (i=0;i<5;i++) {
			if(vetDigitado[i]%2==1) {
			B[i]=vetDigitado[i];
			System.out.printf("\n"+B[i]+" ");
			}
			}

			}
		}
	


