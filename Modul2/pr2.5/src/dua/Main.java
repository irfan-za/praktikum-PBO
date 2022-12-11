package dua;
public class Main {
    public static void main(String[] args) {
        Dosen dosen= new Dosen();
        dosen.tampilkanNama("Aris");
        dosen.tampilkanTglLahir("12-07-1998");
        dosen.tampilkanNik(123123);
        dosen.tampilkanPendidikan("S2");

        Mahasiswa mahasiswa= new Mahasiswa();
        mahasiswa.tampilkanNama("Muhammad Irfan Zahran");
        mahasiswa.tampilkanNim("L200210016");
        mahasiswa.tampilkanAlamat("Boyolali");
        mahasiswa.tampilkanSemester(3);

        Karyawan karyawan= new Karyawan();
        karyawan.tampilkanNama("Muhammad");
        karyawan.tampilkanJabatan("Kepala Marketing");
        karyawan.tampilkanAlamat("Boyolali");
        karyawan.tampilkanGaji(3000000);
    }
}
