public class Pet {
    private String nama;

    public void beriNama(String nama) {
        this.nama = nama;
    }

    public String nama(String nama) {
        this.nama=nama;
        return this.nama;
    }
    public String perilaku(){
        return "Hewan penurut";
    }
}
