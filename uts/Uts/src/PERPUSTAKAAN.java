public class PERPUSTAKAAN {
    public static void main(String[] args) {
        BUKU buku1 = new BUKU();
        buku1.beriJudul("OO Programming Using Java");
        buku1.beriPengarang("S Kendal");
        buku1.beriTahun(2018);
        buku1.berijumlah(2);
        buku1.cetakInfo();

        BUKU buku2 = new BUKU();
        buku2.beriJudul("Dasar Teknik Informatika");
        buku2.beriPengarang("Novel Pratama");
        buku2.beriTahun(2018);
        buku2.berijumlah(3);
        buku2.cetakInfo();

        BUKU buku3 = new BUKU();
        buku3.beriJudul("Komputer Cerdas");
        buku3.beriPengarang("Nurul Nafiyah");
        buku3.beriTahun(2020);
        buku3.berijumlah(3);
        buku3.cetakInfo();

        BUKU buku4 = new BUKU();
        buku4.beriJudul("Pengantar Teknologi Informasi");
        buku4.beriPengarang("Muslim Ridho");
        buku4.beriTahun(2017);
        buku4.berijumlah(5);
        buku4.cetakInfo();
    }
}
