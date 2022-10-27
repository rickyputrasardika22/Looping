package Loop;
import java.util.Scanner;
public class loop_rps
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int jumlah = 0;
		
		System.out.print("Masukkan Banyak Data = ");
		n = scan.nextInt();
		
		for (int i = 1; i <= n; i++)   //i++ atau i = i+1
		{
//			System.out.print(i + " " );
//			jumlah = jumlah + i;
			if (i < n)
			{
				System.out.print(i + " + ");
			}
			else if (i >= n)
			{
				System.out.print( i + " = ");
			}	
			jumlah = jumlah + i;
		}	
			
		System.out.println("\nJumlah = " + jumlah);
	}
}
