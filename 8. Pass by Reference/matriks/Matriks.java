package matriks;

public class Matriks {
  private int baris;
  private int kolom;
  private int[][] data;

  // konstruktor
  public Matriks(int baris, int kolom) {
    this.baris = baris;
    this.kolom = kolom;
    this.data = new int[this.baris][this.kolom];
  }

  // TAMBAHAN
  // Constructor overloading, yang menerima object sebagai parameter
  public Matriks(Matriks m) {
    this.baris = m.baris;
    this.kolom = m.kolom;
    this.data = new int[m.baris][m.kolom];
    for (int i = 0; i < this.baris; i++) {
      for (int j = 0; j < this.kolom; j++) {
        this.data[i][j] = m.data[i][j];
      }
    }
  }

  // method untuk mengisi matriks
  public void isi(int baris, int kolom, int data) {
    this.data[baris][kolom] = data;
  }

  // TAMBAHAN
  // Method untuk melakukan fungsi kuadrat terhadap isi matriks
  // Contoh pass by references (object)
  public void kuadrat(Matriks m) {
    for (int i = 0; i < m.baris; i++) {
      for (int j = 0; j < m.kolom; j++) {
        m.data[i][j] *= m.data[i][j];
      }
    }
  }

  // Method overloading untuk mencetak matriks
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

  // TAMBAHAN
  // method yang mengembalikan matriks (return object)
  public Matriks tambah(Matriks m) {
    Matriks temp = new Matriks(m);
    for (int i = 0; i < this.baris; i++) {
      for (int j = 0; j < this.kolom; j++) {
        temp.data[i][j] = m.data[i][j] + this.data[i][j];
      }
    }
    return temp;
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