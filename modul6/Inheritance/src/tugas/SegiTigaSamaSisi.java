package tugas;

public class SegiTigaSamaSisi extends SegiTiga{
    static double sisi=12;
    static int t=12;
    static double alasSegitiga=SegiTiga.alas;

    public static void main(String[] args) {
        System.out.print("Luas Segitiga sama sisi : ");
        BangunDatar.luasSegitiga((int)alasSegitiga,t);

        System.out.println("Keliling Segitiga sama sisi : "+ BangunDatar.kelilingSegitiga((int)sisi,sisi,sisi));
    }
}
