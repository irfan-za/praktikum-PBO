public class Nilai {
    int nilaiUTS,nilaiUAS,nilaiTugas;


    void total(int nilaiTugas, int nilaiUAS, int nilaiUTS){
        System.out.println("nilai tugas : "+nilaiTugas+"\n"+
                "nilai uts : "+nilaiUTS+"\n"+
                "nilai uas :"+nilaiUAS);
    }
    double total1(int nilaiTugas, int nilaiUAS, int nilaiUTS){
        double nilaiTotal=nilaiTugas+nilaiUAS+nilaiUTS;
        return nilaiTotal;
    }

}
