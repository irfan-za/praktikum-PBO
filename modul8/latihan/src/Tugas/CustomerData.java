package Tugas;

public class CustomerData {
    String nama = "Irfan";
    String alamat = "Boyolali";
    String tanggalLahir = "1-1-1990";
    String pekerjaan= "Mahasiswa";
    double gaji=99000000;

    public CustomerData(){
        System.out.printf(
                "=================================\n"+
                        "Customer Data👇\n" +
                "=================================\n"+
                "Nama\t\t\t: %1$s\n" +
                "Alamat\t\t\t: %2$s\n" +
                "Tanggal Lahir\t: %3$s\n" +
                "Pekerjaan\t\t: %4$s\n" +
                "Gaji\t\t\t: %5$,.2f\n" ,nama, alamat, tanggalLahir, pekerjaan, gaji);
    }
    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji){
        this.nama=nama;
        this.alamat=alamat;
        this.tanggalLahir=tanggalLahir;
        this.pekerjaan=pekerjaan;
        this.gaji=gaji;

        System.out.printf(
                "=================================\n"+
                        "Customer Data [w/ PARAM]\n" +
                "=================================\n"+
                "Nama\t\t\t: %1$s\n" +
                "Alamat\t\t\t: %2$s\n" +
                "Tanggal Lahir\t: %3$s\n" +
                "Pekerjaan\t\t: %4$s\n" +
                "Gaji\t\t\t: %5$,.2f\n" ,nama, alamat, tanggalLahir, pekerjaan, gaji);
    }

}
