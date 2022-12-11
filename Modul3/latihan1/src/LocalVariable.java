public class LocalVariable {
    int umur=12;
    public void hitungUsia(){
        int usia=0;
        int tahunSekarang=2019;
        int tahunLahir=1993;

        usia=tahunSekarang-tahunLahir;

        System.out.println("usia saya : "+usia);
    }
    void beratBadan(){
        int beratLahir=20;
        int beratBadan=beratLahir+(umur/2);

    }
}

