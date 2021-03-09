package gen_vetores_matrizes;

public class ex_1 
{
	public static void main (String[] args)
	{
		int[] num = {1, 0, 5, -2, -5, 7}; 
		int a, total=0;
		
		System.out.println("Os valores do vetor são: \n");
		
		for (int x = 0; x < 6; x ++)
		{
			if (x == 4)
			{
				num[x] = 100;
			}
			System.out.println("Na posição" +x+ " o valor do vetor é "+ num[x]);
		}
		System.out.println("\n");
		
		for (int x = 0; x < 6; x ++)
		{
			if (x == 0 || x == 1 || x == 5 ) 
			{
				a = num[x];
				total = total + a;
				
				System.out.printf("%nA variável A[%d] o valor é %d",x,a);
			}
		
		}
		
		System.out.printf("%nA soma de A[] é igual a %d %n", total);
		
		
	}
}
