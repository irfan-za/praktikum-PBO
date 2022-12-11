package Conference;

import University.Mahasiswa;

public class Delegasi extends Mahasiswa {
    String instansi = "UMS";

    Delegasi(String masukan) {
        super(masukan);
        System.out.println("Objek delegasi berhasil dibuat");
    }
    void cetakNama() {
        System.out.println(this.nama);
        
    }
}
