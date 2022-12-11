package latihan;

public class Pesawat extends Kendaraan{
    static String bahanBakar="Avtur";

    public static void main(String[] args) {
        System.out.printf("bahan bakar pesawat : %1$s\nbahan bakar kendaraan : %2$s",bahanBakar, Kendaraan.bahanBakar);
        System.out.println("\nkecepatan kendaraan : "+Kendaraan.kecepatan);
    }
}
