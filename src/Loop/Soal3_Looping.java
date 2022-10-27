package Loop;
import java.util.Scanner;
public class Soal3_Looping 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int totalGaji, n = 0;
		int gajiPokok = 3500000;
		int masaKerja = 0;
		int tunjangan = 0;
		String nama;
		
		System.out.print("Masukkan Jumlah Karyawan = ");
		n = scan.nextInt();
		
		for (int i = 1; i<=n; i++)
		{
			System.out.println("\nData Karyawan ke-" + i);
			System.out.print("Masukkan Nama \t\t\t= ");
			nama = scan.next();
			System.out.print("Masukkan Masa Kerja (tahun) \t= ");
			masaKerja = scan.nextInt();
			{
				
				if (masaKerja < 5)
				{
					tunjangan = 1000000;
				}
				else if (masaKerja >= 5 && masaKerja < 10 )
				{
					tunjangan = 1500000;
				}
				else if (tunjangan >= 10)
				{
					tunjangan = 2000000;
				}
				
				totalGaji = gajiPokok + tunjangan;
				System.out.println("--------------------------------------------");
				System.out.println("Total Gaji " + nama + " \t\t\t= Rp " + totalGaji);
			}
		}	
		
	}
}
