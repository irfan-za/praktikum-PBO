package tugas;

public class SegiTigaSamaKaki extends SegiTiga{
    static double sisiMiring=12;
    static int t=12;
    static double alasSegitiga=SegiTiga.alas;


    public static void main(String[] args) {
        System.out.print("Luas Segitiga sama kaki : ");
        BangunDatar.luasSegitiga((int)alasSegitiga,t);

        System.out.println("Keliling Segitiga sama kaki : "+ BangunDatar.kelilingSegitiga((int)alasSegitiga,sisiMiring,sisiMiring));
    }
}
