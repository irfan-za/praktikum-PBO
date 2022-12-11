package University;


public class Staff {
    String nama;
    int nip;
    String jenisKelamin;
    double gaji;
    static final int maxHariCuti = 12;

    protected Staff() {
    }
    void terimaGaji(double gaji){
        this.gaji+=gaji;
        System.out.printf("gaji : Rp %,.2f",this.gaji);
    }

    protected Staff(String masukan) {
        this.nama = masukan;
    }

    public void masukanNip(int masukan) {
        this.nip = masukan;
    }



}
