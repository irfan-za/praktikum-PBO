package hewan;

public class Main {
    public static void main(String[] args) {

        Hewan harimau= new Hewan();
        Hewan kerbau= new Hewan();

        harimau.setHewan("Harimau",4,"Daging","Karnifora");
        kerbau.setHewan("Kerbau",4,"Rumput","Herbifora");

        harimau.info();
        kerbau.info();
    }
}