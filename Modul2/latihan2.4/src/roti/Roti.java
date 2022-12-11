package roti;

public class Roti {
    String warna, rasa;
    int berat;
    double harga;

    void beriWarna(String warnaRoti){
        warna=warnaRoti;
    }
    void beriRasa(String rasaRoti){
        rasa=rasaRoti;
    }
    void timbangBerat(int beratRoti){
        berat=beratRoti;
    }
    void hargaJual(double hargaRoti){
        harga=hargaRoti;
    }
    void infoRoti(){
        System.out.println(
                "Warna roti.Roti : "+ warna+ "\n"+
                "Rasa roti.Roti : "+ rasa+ "\n"+
                "Berat roti.Roti : "+ berat+ "gr\n"+
                "Harga roti.Roti : Rp. "+ harga
        );
    }
}
