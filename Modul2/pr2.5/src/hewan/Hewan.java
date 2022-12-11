package hewan;

public class Hewan {
    String nama, makanan, tipe;
    int kaki;

    public void setHewan(String nama, int kaki, String makanan, String tipe) {
        this.nama = nama;
        this.kaki = kaki;
        this.makanan = makanan;
        this.tipe = tipe;
    }
    public void info(){
        System.out.println(
                "Nama hewan.Hewan : "+this.nama+"\n"+
                        "Jumlah kaki : "+this.kaki+"\n"+
                        "Jumlah makanan : "+this.makanan+"\n"+
                        "Jumlah tipe : "+this.tipe
        );
    }
}
