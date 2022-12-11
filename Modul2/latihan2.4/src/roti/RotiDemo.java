package roti;

public class RotiDemo {
    public static void main(String[] args) {

        Roti roti1= new Roti();
        roti1.beriWarna("merah");
        roti1.beriRasa("stroberi");
        roti1.timbangBerat(20);
        roti1.hargaJual(50000);
        roti1.infoRoti();

        Roti roti2= new Roti();
        roti2.beriWarna("kuning");
        roti2.beriRasa("keju");
        roti2.timbangBerat(10);
        roti2.hargaJual(23000);
        roti2.infoRoti();

        Roti roti3= new Roti();
        roti3.beriWarna("putih");
        roti3.beriRasa("original");
        roti3.timbangBerat(12);
        roti3.hargaJual(30000);
        roti3.infoRoti();

    }
}