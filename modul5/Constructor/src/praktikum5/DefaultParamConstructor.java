package praktikum5;

public class DefaultParamConstructor {
        String nama;
        int umur;
        DefaultParamConstructor(){
            System.out.println("Menampilkan default constructor!");
        }
        DefaultParamConstructor(String nama, int umur){
            this.nama=nama;
            this.umur=umur;
        }
        void sapa(){
            System.out.printf("Nama saya %s, umur saya %d tahun🖐️",this.nama,this.umur);
        }

}
