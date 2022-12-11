package praktikum5;

public class ParamConstructor {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;
    ParamConstructor(String namaPengarang, String judulBuku ){
        this.namaPengarang=namaPengarang;
        this.judulBuku=judulBuku;
    }
        ParamConstructor(int tahunTerbit, int cetakanKe){
        this.tahunTerbit=tahunTerbit;
        this.cetakanKe=cetakanKe;
    }
        ParamConstructor(double hargaJual){
        this.hargaJual=hargaJual;
    }
    void jp(){
        System.out.printf("Judul : %1$s\nPengarang : %2$s\n",this.judulBuku,this.namaPengarang);
    }
    void tc(){
        System.out.printf("Tahun terbit : %1$d\nCetakan ke-%2$d\n",this.tahunTerbit, this.cetakanKe);
    }
    void harga(){
        System.out.printf("Harga jual : %,.2f",this.hargaJual);
    }

}
