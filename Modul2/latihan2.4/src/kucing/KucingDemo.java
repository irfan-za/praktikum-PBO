package kucing;

public class KucingDemo {
    public static void main(String[] args) {
        Kucing kucing= new Kucing();

        kucing.umur(2);
        kucing.meong();

        System.out.println("umur : "+kucing.umur+"\n"+
                "warna bulu : "+ kucing.warnaBulu);}

}
