public class Rekening {
    double saldo=0;
    int no_rekening=123122;

    void cek_saldo(){
        System.out.println("saldo :"+saldo);
        System.out.println("no rekening :"+no_rekening);
    }
    void menabung(double uang){
        this.saldo+=uang;
        System.out.println("saldo saat ini : "+(saldo));
    }
    void menarik(double uang){
        this.saldo-=uang;
        System.out.println("saldo saat ini : "+(saldo));

    }
    void transfer(double uang){
        this.saldo-=uang;
        System.out.println("saldo saat ini : "+(saldo));

    }
}
