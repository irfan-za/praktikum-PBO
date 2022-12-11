public class Main {
    public static void main(String[] args) {
        LocalVariable local= new LocalVariable();
        local.beratBadan();
        local.hitungUsia();

        Pegawai pegawai=  new Pegawai();
        pegawai.dataPegawai("irfan",123123, 3000000);

        Nilai nilai= new Nilai();
        System.out.println("total nilai : "+nilai.total1(122,12,12));

        Rekening rekening= new Rekening();
        rekening.cek_saldo();
        rekening.menabung(1000);
        rekening.menarik(12);
        rekening.transfer(12);
    }
}