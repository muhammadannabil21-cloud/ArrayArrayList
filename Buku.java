package bagian3.perpustakaan;

public class Buku {

    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // Latihan Mandiri No.2

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}