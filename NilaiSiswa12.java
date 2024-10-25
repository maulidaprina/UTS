import java.util.Scanner;

public class NilaiSiswa12 {
    public static void main(String[] args) {
       
        Scanner sc12 = new Scanner(System.in);

int totalSiswa = 0, atasMean = 0, bawahMean = 0;
double nilai = 0, totalNilai = 0, meanAkhir;
String nama;
boolean mayoritasNilai;

while (true) {
    System.out.println("Silahkan Ketik 'Selesai' untuk berhenti");
    System.out.print("Masukkan nama siswa: ");
    nama = sc12.nextLine();

    if (nama.equalsIgnoreCase("selesai")) {
        break;
    }

    System.out.print("Masukkan nilai siswa: ");
    nilai = sc12.nextDouble();
    sc12.nextLine();

    totalSiswa ++;
    totalNilai += nilai;
   
        if (nilai >= 75) {
            atasMean++;
        } else {
            bawahMean++;
        }
    } 

    if (totalSiswa > 0) {
        meanAkhir = totalNilai / totalSiswa;

    mayoritasNilai = atasMean > (totalSiswa / 2.0);

System.out.println("-------------------------------------");
System.out.println("-------Laporan Penilaian Kelas-------");
System.out.println("-------------------------------------");
System.out.println("Rata-rata Nilai Kelas: " + meanAkhir);
System.out.println("Jumlah Siswa Memiliki Nilai di Atas Rata-rata: " + atasMean);
System.out.println("Jumlah Siswa Memiliki Nilai di Bawah Rata-rata: " + bawahMean);
System.out.println("Apakah Mayoritas Nilai Siswa di Atas Rata-rata? " + (mayoritasNilai ? "Ya" : "Tidak"));

} else {
    System.out.println("Tidak ada nilai yang dimasukkan.");
}
    }
}