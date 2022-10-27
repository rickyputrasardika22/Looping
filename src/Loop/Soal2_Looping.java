package Loop;
import java.util.Scanner;
public class Soal2_Looping 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int awal, akhir;
		int angka = 0, jumlah_Ganjil = 0, jumlah_Genap = 0;
		
		System.out.print("Input Awal Deret = ");
		awal = scan.nextInt();
		System.out.print("Input Akhir Deret = ");
		akhir = scan.nextInt();
		
		System.out.println("\nBilangan Bulat Positif dari " + awal + " s/d " + akhir);
		for (int i = awal; i<=akhir; i++)
		{	
			if (i%2 == 1 )
			{
				System.out.println("Deret Ganjil \t= " + i);
				jumlah_Ganjil = jumlah_Ganjil + i;
			}
			else if (i%2 == 0)
			{
				System.out.println("Deret Genap \t= " + i);
				jumlah_Genap = jumlah_Genap + i;
			}	
		}
		System.out.println("Penjumlahan Ganjil = " + jumlah_Ganjil);
		System.out.println("Penjumlahan Genap = " + jumlah_Genap);
	}
}
