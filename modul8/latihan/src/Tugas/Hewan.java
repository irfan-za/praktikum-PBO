package Tugas;

public class Hewan {
    public void jalan() {
        System.out.println("Hewan bisa berjalan");
    }
}
class Kucing extends Hewan{
    String alatGerak= "Kaki";

    public void jalan() {
        System.out.println("Kucing bisa berjalan dengan "+ alatGerak +" dan berlari");
    }
}

class Elang extends Hewan {
    public void jalan() {
        System.out.println("Elang tidak bisa berjalan, tapi bisa terbang.");
    }
}



