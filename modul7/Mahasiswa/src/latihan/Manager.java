package latihan;

public class Manager extends Karyawan{
    private float jamKerja= 7.5f;

    public float jamKerja(){
        return jamKerja;
//        return (int) jamKerja;
    }

    public void setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;
    }

    public float getGajiManager() {
        return super.getGaji()*2;
    }
}
