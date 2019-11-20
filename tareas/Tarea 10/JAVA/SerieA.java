//TAREA 10 - Serie A 
		//Iteración
		//Formula de la serie: n^(2n-1)
		
import java.util.Scanner;
import java.lang.Math;
import java.lang.Double;
import java.math.*;

public class SerieA
	{
	public static void main(String[] args){
		
		int n;
		Double formula;
		BigInteger resultado = BigInteger.valueOf((int)0);
		Scanner lectura = new Scanner(System.in);
		
		System.out.print("n => ");
		n = lectura.nextInt();
		
		for (int i=1;i<=n;i++){
			formula = Math.pow(i,2*i - 1);
			//resultado = formula.intValue();
			resultado = BigDecimal.valueOf(formula).toBigInteger();
				
				if (i==n){
						System.out.print(resultado + ".\n");
						System.exit(0);
					}
			System.out.print(resultado + ", ");
		}
		
		//System.out.println("El valor de n es " + valor);
		
	}

}