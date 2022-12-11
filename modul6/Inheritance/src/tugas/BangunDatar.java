package tugas;

public class BangunDatar {
    double luas=10;
    double keliling=15;
    static void hitungLuas(int p,double l){
        System.out.println(p*l);
    }

    static void luasSegitiga(int a,int t){
        System.out.println((a*t)/2);
    }

    static double hitungKeliling(int p, double l){
        return 2*(p+l);
    }
    static double kelilingSegitiga(int s1, double s2,double s3){
        return s1+s2+s3;
    }


}
