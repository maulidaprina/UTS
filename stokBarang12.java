import java.util.Scanner;

public class stokBarang12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

String namaBarang;
int permintaan, stokBarang, hargaPerUnit, totalNilaiStok = 0, nilaiStokBarang = 0;

while (true) {
    System.out.println("=====Manajemen Stok Barang=====");
    System.out.println("Silahkan Ketik 'Selesai' untuk berhenti");
    System.out.println("Masukkan Nama Barang: ");
    namaBarang = sc12.nextLine();

    if (namaBarang.equalsIgnoreCase("selesai")){
        break;
    }
    System.out.print("Masukkan Jumlah Stok: ");
    stokBarang = sc12.nextInt();

    System.out.print("Masukkan Harga Per Unit: ");
    hargaPerUnit = sc12.nextInt();
    sc12.nextLine();

    nilaiStokBarang = stokBarang * hargaPerUnit;
    totalNilaiStok += nilaiStokBarang;

    System.out.println("Total Nilai Stok Untuk " + namaBarang + ": Rp " + nilaiStokBarang);

    System.out.print("Masukkan jumlah permintaan produk: ");
    permintaan = sc12.nextInt();
    sc12.nextLine();

    if (permintaan <= stokBarang) {
        stokBarang -= permintaan;
        System.out.println("Permintaan dapat dipenuhi. Sisa stok: " + stokBarang);
        } else {
        System.out.println("Permintaan tidak dapat dipenuhi. Stok tidak mencukupi.");
        }
    }

    System.out.println("--------------------------------------");
    System.out.println("-------Laporan Stok Barang Toko-------");
    System.out.println("--------------------------------------");
    System.out.println("Total nilai seluruh stok: Rp " + totalNilaiStok);
    System.out.println("Terima kasih telah menggunakan program manajemen stok.");


    }
}