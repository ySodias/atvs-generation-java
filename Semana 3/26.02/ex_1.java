package gen_repeticao;

public class ex_1 {
	public static void main (String[] args) 
	{
		System.out.println("=== Calc números até 1999 que divivdem por 11 e sobra 5 ======");
		int total, x;
		
		for(x = 1000; x<=1999; x++ ) 
		{
			total = x%11;
			if (total == 5) {
				System.out.println(x);	
			}
		}
	}
}
