package tugas;

public class PersegiPanjang extends BangunDatar  {
    static int panjang=20;
    static double lebar=10;

    public static void main(String[] args) {
        System.out.print("Luas Persegi panjang : ");
        BangunDatar.hitungLuas(panjang, lebar);

        System.out.println("Keliling persegi panjang : "+ BangunDatar.hitungKeliling(panjang,lebar));
    }
}
