package packageLama;

public class PublicModifier {
    public int a=1;
    public int b=2;
    public int c=3;

    public void kali() {
        int d= a*b*c;
        System.out.println("hasil kali : "+d);
    }
public void tambah() {
        int d= a+b+c;
        System.out.println("hasil tambah : "+d);
    }
public void kurang() {
        int d= a-b-c;
        System.out.println("hasil kurang : "+d);
    }
public void bagi() {
        int d= a/b/c;
        System.out.println("hasil bagi : "+d);
    }
public void rata_rata() {
        int d= (a+b+c)/3;
        System.out.println("hasil rata-rata : "+d);
    }

}
