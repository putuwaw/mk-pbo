package matriks;

public class Matriks {
  private int baris;
  private int kolom;
  private int[][] data;

  // TAMBAHAN: Membuat Constructor dengan Overloading
  // 1. Jika memasukkan dua input, maka buat matriks dengan ukuran input
  // tersebut
  // 2. Jika hanya satu input, maka set baris dan kolom sesuai input tersebut

  // CONSTRUCTOR
  public Matriks(int baris, int kolom) {
    this.baris = baris;
    this.kolom = kolom;
    this.data = new int[this.baris][this.kolom];
  }

  public Matriks(int n) {
    this.baris = n;
    this.kolom = n;
    this.data = new int[this.baris][this.kolom];
  }

  // METHOD UNTUK MENGISI MATRIKS
  public void isi(int baris, int kolom, int data) {
    this.data[baris][kolom] = data;
  }

  // TAMBAHAN: Membuat Method dengan Overloading
  // 1. Jika memasukkan satu input, maka akan dicetak deskripsi tambahan dari
  // input tersebut
  // 2. Jika tidak memberikan input, maka akan dicetak matriks saja
  // METHOD UNTUK MENCETAK MATRIKS
  public void cetak(String desc) {
    System.out.println(desc);
    for (int i = 0; i < this.baris; i++) {
      for (int j = 0; j < this.kolom; j++) {
        System.out.print(this.data[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void cetak() {
    System.out.println("Matriks: ");
    for (int i = 0; i < this.baris; i++) {
      for (int j = 0; j < this.kolom; j++) {
        System.out.print(this.data[i][j] + " ");
      }
      System.out.println();
    }
  }

  // METHOD UNTUK MELAKUKAN PENJUMLAHAN MATRIKS
  public boolean tambah(Matriks m) {
    if (this.baris == m.baris && this.kolom == m.kolom) {
      for (int i = 0; i < this.baris; i++) {
        for (int j = 0; j < this.kolom; j++) {
          this.data[i][j] += m.data[i][j];
        }
      }
    } else {
      System.out.println("ERROR! Jumlah baris dan kolom harus sama!");
      return false;
    }
    return true;
  }

  // GETTER DAN SETTER
  public int getBaris() {
    return this.baris;
  }

  public int getKolom() {
    return this.kolom;
  }

  public void setBaris(int baris) {
    this.baris = baris;
  }

  public void setKolom(int kolom) {
    this.kolom = kolom;
  }
}