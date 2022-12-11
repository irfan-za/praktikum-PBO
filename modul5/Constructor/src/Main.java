public class Main {

    public static void main(String[] args) {
       ConstructorMhs mhs1= new ConstructorMhs("Muhammad");
       mhs1.tambah();
       ConstructorMhs mhs2= new ConstructorMhs("Irfan");
       mhs2.tambah();
       ConstructorMhs mhs3= new ConstructorMhs("Zahran");
       mhs3.tambah();

        System.out.println("Jumlah object = "+ ConstructorMhs.tambah());
        System.out.print("===============================\n" +
                "Nama  : Muhammad Irfan Zahran\n" +
                "NIM   : L200210016\n" +
                "Kelas : A");
    }
}