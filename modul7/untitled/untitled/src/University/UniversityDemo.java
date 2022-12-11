package University;


public class UniversityDemo {
    public static void main(String[] args) {
        //Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama= "Budi";
        mhs1.nim="L2001";
        mhs1.alamat="Solo";
        mhs1.ipk=3.5;
        mhs1.password="anjayy";

        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.alamat);
        System.out.println(mhs1.ipk);
        System.out.println(Mahasiswa.maxipk);
        System.out.println(mhs1.password);
        
        mhs1.isiKRS();
        System.out.println(mhs1.ambilNilai());
        mhs1.revisiNilai(3.7);
        System.out.println(mhs1.ambilNilai());
        
        System.out.println("\n");

        //Staff
        Staff staff1 = new Staff();
        staff1.nama = "Joni";
        staff1.nip = 696969;
        staff1.jenisKelamin = "L";
        staff1.gaji = 1000000;



        System.out.println(staff1.nama);
        System.out.println(staff1.nip);
        System.out.println(staff1.jenisKelamin);
        System.out.println(staff1.gaji);
        

    }
}