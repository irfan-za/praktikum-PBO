public class BUKU {
    String Judul;
    String Pengarang;
    int Tahun;
    int Jumlah;

    void beriJudul(String judul) {
        this.Judul = judul;
    }

    void beriPengarang(String pengarang) {
        this.Pengarang = pengarang;
    }

    void beriTahun(int tahun) {
        this.Tahun = tahun;
    }

    void berijumlah(int jumlah) {
        this.Jumlah = jumlah;
    }

    void cetakInfo() {
        System.out.println(
            "judul = " + Judul + "\n" +
            "pengarang = " + Pengarang + "\n" +
            "tahun = " + Tahun + "\n" +
            "tersedia = " + Jumlah + "buku" + "\n"
        );
    }
}