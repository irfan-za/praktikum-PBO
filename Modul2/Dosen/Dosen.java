package modul2.Tugas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    Date tglLahir; 

    void tampilkanNama(String value){
        nama = value;
    }

    void tampilkanTglLahir(String value) throws ParseException  {
       SimpleDateFormat input = new SimpleDateFormat("dd-MM-yyyy");
       tglLahir = input.parse(value);
    }

    void tampilkanNik(int value){
        nik = value;
    }

    void printInfo(){
        System.out.println(
            "Nama           : " + nama + "\n" +
            "NIK            : " + nik + "\n" +
            "Tanggal Lahir  : " + new SimpleDateFormat("dd-MM-yyyy").format(tglLahir) + "\n" 
        );
    }

    public static void main(String[] args) throws ParseException {
        Dosen dosen = new Dosen();
        dosen.tampilkanNama("Irfan");
        dosen.tampilkanNik(200210021);
        dosen.tampilkanTglLahir("15-05-2003");
        dosen.printInfo();
    }
    
}
