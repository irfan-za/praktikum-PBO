package University;

public class Mahasiswa {
    public String nama = "student";
    String nim;
    String alamat;
    String password;
    double ipk;
    static final double maxipk = 4.00;

    protected Mahasiswa() {
        
    }

    protected Mahasiswa(String  masukan) {
        this.nama = masukan;
    }

    void isiKRS() {
        System.out.println("Mahasiswa telah mengisi KRS");
    }

    double ambilNilai() {
        return ipk;
    }

    void setPassword(String pass) {
        password = pass;
    }

    void revisiNilai(double nilaiBaru) {
        ipk = nilaiBaru;
    }
}



