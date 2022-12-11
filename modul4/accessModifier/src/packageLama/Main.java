package packageLama;

public class Main {
    public static void main(String[] args) {
//        ==== akses private variable ====
        PrivateModifier pm= new PrivateModifier();
//        System.out.println(pm.nama);

//        ==== akses default variable ====
        DefaultModifier dm= new DefaultModifier();
        dm.jumlah();
    }
}