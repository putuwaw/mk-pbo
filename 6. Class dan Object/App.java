import java.util.Scanner;

import matriks.Matriks;

public class App {
  public static void main(String args[]) {
    // PROGRAM SEDERHANA PENJUMLAHAN DUA BUAH MATRIKS

    // Membuat object input dari class Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Program Penjumlahan Matriks");
    System.out.println("===========================");
    System.out.println("Matriks A");
    System.out.print("Masukkan jumlah baris: ");
    int n = input.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    int m = input.nextInt();

    // Membuat object matriks A dari input user
    Matriks A = new Matriks(n, m);

    // Memasukkan data ke matriks A
    for (int i = 0; i < A.getBaris(); i++) {
      for (int j = 0; j < A.getKolom(); j++) {
        int data = input.nextInt();
        A.isi(i, j, data);
      }
    }

    System.out.println("Matriks B");
    System.out.print("Masukkan jumlah baris: ");
    n = input.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    m = input.nextInt();

    // Membuat object matriks B dari input user
    Matriks B = new Matriks(n, m);

    // Memasukkan data ke matriks B
    for (int i = 0; i < B.getBaris(); i++) {
      for (int j = 0; j < B.getKolom(); j++) {
        int data = input.nextInt();
        B.isi(i, j, data);
      }
    }

    A.cetak("Matriks A adalah:");
    B.cetak("Matriks B adalah:");

    // Melakukan penjumlahan matriks A dan B
    if (A.tambah(B) == true) {
      A.cetak("Hasil penjumlahan matriks A dan B adalah:");
    } else {
      System.out.println("Gagal melakukan penjumlahan!");
    }

    // Menutup scanner
    input.close();
  }
}