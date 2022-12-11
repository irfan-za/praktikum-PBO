package latihan;

public class Mobil extends Kendaraan {
    static int roda=4;

    public static void main(String[] args) {
        System.out.printf("roda mobil : %1$d\nroda kendaraan : %2$d",roda, Kendaraan.roda);
    }
}
