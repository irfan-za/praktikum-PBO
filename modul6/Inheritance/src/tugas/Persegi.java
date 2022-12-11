package tugas;

public class Persegi extends BangunDatar {
    static double sisi=10;

    public static void main(String[] args) {
        System.out.print("Luas Persegi : ");
        BangunDatar.hitungLuas((int)sisi, sisi);

        System.out.println("Keliling persegi :"+BangunDatar.hitungKeliling((int)sisi,sisi));
    }
}
