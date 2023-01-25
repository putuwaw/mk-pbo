import java.util.Scanner;

import matriks.Matriks;

public class App {
  public static void main(String args[]) {
    // PROGRAM SEDERHANA PENJUMLAHAN DUA BUAH MATRIKS

    // Deklarasi matriks A, B, dan C
    Matriks A, B, C;

    // Membuat object input dari class Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Program Penjumlahan Matriks");
    System.out.println("===========================");
    System.out.println("Matriks A");
    System.out.print("Masukkan jumlah baris: ");
    int n = input.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    int m = input.nextInt();

    A = new Matriks(n, m);
    for (int i = 0; i < A.getBaris(); i++) {
      for (int j = 0; j < A.getKolom(); j++) {
        int num = input.nextInt();
        A.isi(i, j, num);
      }
    }

    // Membuat object matriks B dari matriks A
    // Implementasi Object Sebagai Parameter dalam Konstruktor
    B = new Matriks(A);

    // Melakukan pembesaran terhadap matriks B
    // Implementasi Pass by References
    B.kuadrat(B);

    // Membuat matriks C dengan Object Sebagai Kembalian
    // Implementasi Object sebagai Nilai Kembalian
    C = A.tambah(B);

    // Mencetak matriks
    A.cetak("Matriks A:");
    B.cetak("Matriks B (kuadrat dari matriks A):");
    C.cetak("Hasil matriks C (penjumlahan matriks A dan B): ");

    // Menutup scanner
    input.close();
  }
}