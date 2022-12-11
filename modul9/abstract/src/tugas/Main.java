package tugas;

public class Main {
    public static void main(String[] args) {
        Balok b= new Balok();
        System.out.println("==== BALOK🎴 ====");
        System.out.printf("Volume\t\t\t: %d\n", b.volume());
        System.out.printf("Luas Permukaan\t: %d\n", b.luasPermukaan());

        Kubus k= new Kubus();
        System.out.println("==== KUBUS🎲 ====");
        System.out.printf("Volume\t\t\t: %d\n", k.volume());
        System.out.printf("Luas Permukaan\t: %d\n", k.luasPermukaan());

        Bola bo= new Bola();
        System.out.println("==== BOLA🌍 ====");
        System.out.printf("Volume\t\t\t: %d\n", bo.volume());
        System.out.printf("Luas Permukaan\t: %d\n", bo.luasPermukaan());

    }
}
