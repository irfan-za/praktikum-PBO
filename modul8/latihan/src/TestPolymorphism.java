public class TestPolymorphism {
    public static void main(String[] args) {
        Pet p= new Pet();
        Anjing a= new Anjing();
        Kucing k= new Kucing();

        p.beriNama("Budi");

        System.out.println(p.perilaku());
        System.out.println(a.perilaku());
        System.out.println(k.perilaku());
        System.out.println("===== 👇 =====");

        System.out.println(k.nama("TOM"));
        System.out.println(k.makanan());
        System.out.println(k.suara());
        System.out.println(a.nama("BULL"));
        System.out.println(a.makanan());
        System.out.println(a.suara());

    }
}