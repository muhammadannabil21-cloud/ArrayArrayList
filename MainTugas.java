// Nama : Muhammad Annabil
// NPM  : 2410010648

package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array nama mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Basis Data", "Algoritma"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Muhammad Annabil", "2410010648", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010003", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Deni", "2410010004", 45));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2410010005", 70));

        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
        System.out.println();

        // Tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2410010006", 78));
        System.out.println("Setelah tambah 1 mahasiswa baru:");
        kelas.tampilkanSemua();
        System.out.println("Jumlah data terbaru: " + 6);
    }
}