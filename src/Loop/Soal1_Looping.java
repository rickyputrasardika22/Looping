package Loop;
import java.util.Scanner;
public class Soal1_Looping 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		int angka = 0;
		
		System.out.print("Masukkan Banyak Angka = ");
		n = scan.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			System.out.print("Bilangan Ke- " + i + " = ");
			angka = scan.nextInt();
			{
				if(angka > 0)
				{
					System.out.println(angka + " adalah bilangan positif");
				}
				else if(angka == 0)
				{
					System.out.println(angka + " adalah bilangan Nol");
				}
				else
				{
					System.out.println(angka + " adalah bilangan negatif");
				}	
			}
		}	
	
	}
}
